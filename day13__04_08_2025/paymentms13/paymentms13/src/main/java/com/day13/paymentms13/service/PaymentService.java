package com.day13.paymentms13.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.day13.paymentms13.entity.Payment;
import com.day13.paymentms13.repo.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
    private PaymentRepository paymentRepository;

    public ResponseEntity<Payment> createPayment(Payment payment) {
        return ResponseEntity.ok(paymentRepository.save(payment));
    }

    public ResponseEntity<Payment> getPaymentById(Long id) {
        return paymentRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<List<Payment>> getAllPayments() {
        return ResponseEntity.ok(paymentRepository.findAll());
    }

    public ResponseEntity<Payment> updatePayment(Long id, Payment payment) {
        return paymentRepository.findById(id)
                .map(existing -> {
                    existing.setPaymentMethod(payment.getPaymentMethod());
                    existing.setAmount(payment.getAmount());
                    existing.setStatus(payment.getStatus());
                    return ResponseEntity.ok(paymentRepository.save(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Object> deletePayment(Long id) {
        return paymentRepository.findById(id)
                .map(existing -> {
                    paymentRepository.delete(existing);
                    return ResponseEntity.noContent().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
