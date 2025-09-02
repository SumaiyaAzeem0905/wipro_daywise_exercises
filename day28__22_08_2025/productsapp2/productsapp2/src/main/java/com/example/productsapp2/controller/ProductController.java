package com.example.productsapp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.productsapp2.entity.Product;
import com.example.productsapp2.repo.ProductRepository;
import com.example.productsapp2.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:4200")

public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping
	List<Product> findAll()
	{
		return productService.findAll();
	}
	@GetMapping("/{id}")
	Product findById(@PathVariable int id)
	{
		return productService.findById(id);
	}
	@DeleteMapping("/{id}")
	void deleteById(@PathVariable int id)
	{
		 productService.deleteById(id);
	}
	@PostMapping
	void save(@RequestBody Product product)
	{
		productService.save(product);
		
	}
	@PutMapping
	void update(@RequestBody Product product)
	{
		productService.save(product);
		
	}

	

}
