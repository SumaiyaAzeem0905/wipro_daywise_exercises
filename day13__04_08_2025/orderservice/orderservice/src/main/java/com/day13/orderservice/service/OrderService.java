package com.day13.orderservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.day13.orderservice.entity.Order;
import com.day13.orderservice.repo.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
