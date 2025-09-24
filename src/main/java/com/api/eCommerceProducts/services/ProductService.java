package com.api.eCommerceProducts.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.eCommerceProducts.models.Product;

public interface ProductService {
    ResponseEntity<Product> createProduct(Product product);
    List<Product> getAllProducts();
}
