package com.day15.orderms14.service;

import org.springframework.stereotype.Service;

import com.day15.orderms14.client.PaymentClient;
import com.day15.orderms14.dto.PaymentDto;
import com.day15.orderms14.entity.Order;
import com.day15.orderms14.repo.OrderRepository;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepo;
    private final PaymentClient paymentClient;

    public OrderService(OrderRepository orderRepo, PaymentClient paymentClient) {
        this.orderRepo = orderRepo;
        this.paymentClient = paymentClient;
    }

    public Order saveOrder(Order order) {
        return orderRepo.saveAll(order);
    }

    @CircuitBreaker(name = "paymentService", fallbackMethod = "paymentFallback")
    public PaymentDto createPaymentForOrder(PaymentDto paymentDto) {
        return paymentClient.createPayment(paymentDto);
    }

    // Fallback when payment service fails or circuit open
    public PaymentDto paymentFallback(PaymentDto paymentDto, Throwable t) {
        // return failed PaymentDto (or null) — here we return null to signal failure
        return null;
    }

    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    public java.util.Optional<Order> findById(Long id) {
        return orderRepo.findById(id);
    }

    public PaymentDto getPaymentByOrderId(Long orderId) {
        try {
            return paymentClient.getByOrderId(orderId);
        } catch (Exception ex) {
            return null;
        }
    }
}
