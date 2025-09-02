package com.day15.orderms14.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day15.orderms14.dto.PaymentDto;
import com.day15.orderms14.entity.Order;
import com.day15.orderms14.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService svc;

    public OrderController(OrderService svc) {
        this.svc = svc;
    }

    // Create order: sets status I, calls payment ms, updates status accordingly
    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody Order order) {
        order.setOrderStatus("I"); // Initiated
        Order saved = svc.saveOrder(order);

        // prepare payment dto
        PaymentDto paymentDto = PaymentDto.builder()
                .orderId(saved.getId())
                .amount(saved.getOrderValue())
                .paymentMode("UPI")
                .paymentStatus(true)
                .paymentDescription("Auto payment for order " + saved.getOrderNumber())
                .build();

        PaymentDto paymentResp = svc.createPaymentForOrder(paymentDto);

        if (paymentResp != null && paymentResp.getPaymentId() != null) {
            saved.setOrderStatus("P"); // Paid
            svc.saveOrder(saved);
            Map<String,Object> resp = new HashMap<>();
            resp.put("order", saved);
            resp.put("payment", paymentResp);
            return ResponseEntity.ok(resp);
        } else {
            saved.setOrderStatus("C"); // Cancelled
            svc.saveOrder(saved);
            return ResponseEntity.status(503).body("Payment failed or service unavailable. Order set to C.");
        }
    }

    // return order + payment data (if exists)
    @GetMapping("/{id}")
    public ResponseEntity<?> getOrderWithPayment(@PathVariable Long id) {
        Optional<Order> opt = svc.findById(id);
        if (opt.isEmpty()) return ResponseEntity.notFound().build();

        Order o = opt.get();
        PaymentDto p = svc.getPaymentByOrderId(o.getId());

        Map<String,Object> resp = new HashMap<>();
        resp.put("order", o);
        resp.put("payment", p == null ? "No payment found or service unavailable" : p);
        return ResponseEntity.ok().header("search-time", LocalDate.now().toString()).body(resp);
    }

    @GetMapping
    public ResponseEntity<?> findAllOrders() {
        List<Order> list = svc.findAll();
        if (list.isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().header("search-time", LocalDate.now().toString()).body(list);
    }

}
