package com.day13.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day13.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
