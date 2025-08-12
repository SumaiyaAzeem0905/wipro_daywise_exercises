package com.wipro.ProductManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import org.springframework.stereotype.Service;

import com.wipro.ProductManagement.entity.Product;
import com.wipro.ProductManagement.repo.ProductRepository;

@Service
public class ProductService {
	@Autowired
    private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProductsByMake(String productMake) {
        return productRepository.findByProductMake(productMake);
    }
    
    public List<Product> getProductsByNameAndMakeSorted(String name, String make) {
        return productRepository.findByProductNameAndProductMakeOrderByProductNameDesc(name, make);
    }
    
    public Page<Product> getProductsPaginatedAndSorted(int pageNo, int pageSize, String sortBy) {
        PageRequest pageRequest = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        return productRepository.findAll(pageRequest);
    }

    // Create
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Read all
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Read by ID
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    // Update
    public Product updateProduct(Product product) {
        return productRepository.save(product); // save works for both add & update
    }

    // Delete
    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "Product with id " + id + " deleted successfully.";
    }

}
