package com.example.productsapp2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productsapp2.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
