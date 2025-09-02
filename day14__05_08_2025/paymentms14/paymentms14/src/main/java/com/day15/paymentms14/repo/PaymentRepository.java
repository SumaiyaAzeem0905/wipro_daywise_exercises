package com.day15.paymentms14.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day15.paymentms14.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByOrderId(Long orderId);
}
