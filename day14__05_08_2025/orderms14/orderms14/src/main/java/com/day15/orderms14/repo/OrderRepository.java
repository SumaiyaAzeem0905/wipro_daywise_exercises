package com.day15.orderms14.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day15.orderms14.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
