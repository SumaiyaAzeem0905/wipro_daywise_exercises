package com.wipro.ProductManagement.repo;
import com.wipro.ProductManagement.entity.Product;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findByProductMake(String productMake);
	List<Product> findByProductNameAndProductMakeOrderByProductNameDesc(String productName, String productMake);
	Page<Product> findAll(Pageable pageable);
}
