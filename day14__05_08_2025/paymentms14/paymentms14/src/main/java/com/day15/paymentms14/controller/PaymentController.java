package com.day15.paymentms14.controller;


import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day15.paymentms14.entity.Payment;
import com.day15.paymentms14.repo.PaymentRepository;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	private final PaymentRepository repo;

    public PaymentController(PaymentRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody Payment p) {
        Payment saved = repo.save(p);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<Payment>> getAll() {
        List<Payment> list = repo.findAll();
        if (list.isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().header("search-time", LocalDate.now().toString()).body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getById(@PathVariable Long id) {
        return repo.findById(id)
                   .map(pay -> ResponseEntity.ok().header("search-time", LocalDate.now().toString()).body(pay))
                   .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/by-order/{orderId}")
    public ResponseEntity<Payment> getByOrderId(@PathVariable Long orderId) {
        return repo.findByOrderId(orderId)
                   .map(pay -> ResponseEntity.ok(pay))
                   .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Payment updated) {
        return repo.findById(id).map(pay -> {
            pay.setAmount(updated.getAmount());
            pay.setPaymentMode(updated.getPaymentMode());
            pay.setPaymentDescription(updated.getPaymentDescription());
            pay.setPaymentStatus(updated.isPaymentStatus());
            repo.save(pay);
            return ResponseEntity.ok("Data modified successfully");
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        if (!repo.existsById(id)) return ResponseEntity.notFound().build();
        repo.deleteById(id);
        return ResponseEntity.ok("Data deleted successfully");
    }
}
