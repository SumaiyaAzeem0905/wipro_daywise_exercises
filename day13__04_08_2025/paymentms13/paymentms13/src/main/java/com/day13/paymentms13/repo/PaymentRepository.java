package com.day13.paymentms13.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day13.paymentms13.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
