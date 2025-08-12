package com.wipro.ProductManagement.controller;


import com.wipro.ProductManagement.service.*;

import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.ProductManagement.entity.Product;
import com.wipro.ProductManagement.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
    private ProductService productService;

	@Autowired
	private ProductService service;
	
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    
    @GetMapping("/make/{make}")
    public List<Product> getProductsByMake(@PathVariable String make) {
        return productService.getProductsByMake(make);
    }
    
    @GetMapping("/search")
    public List<Product> searchByNameAndMakeSorted(
            @RequestParam String name,
            @RequestParam String make) {
        return productService.getProductsByNameAndMakeSorted(name, make);
    }
    
    
    @GetMapping("/paginated")
    public Page<Product> getPaginatedProducts(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "5") int size,
        @RequestParam(defaultValue = "productPrice") String sortBy
    ) {
        return service.getProductsPaginatedAndSorted(page, size, sortBy);
    }


    // GET all
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // GET by ID
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    // PUT
    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
