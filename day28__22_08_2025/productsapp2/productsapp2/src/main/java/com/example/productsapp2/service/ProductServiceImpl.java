package com.example.productsapp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productsapp2.entity.Product;
import com.example.productsapp2.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> productOpt= productRepository.findById(id);
		if(productOpt.isPresent())
		{
			return productOpt.get();
		}
		return null;
	}
	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}


}
