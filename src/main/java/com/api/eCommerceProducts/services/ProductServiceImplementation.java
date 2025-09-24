package com.api.eCommerceProducts.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.eCommerceProducts.models.Product;
import com.api.eCommerceProducts.repositorys.ProductRepository;
@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<Product> createProduct(Product product) {
        try {
            Product productNew = product;
            return ResponseEntity.ok(productRepository.save(productNew));
        } catch (Exception e) {
            // TODO: handle exception
            return ResponseEntity.badRequest().build();
        }
    }

    @Override
    public List<Product> getAllProducts() {
        try {
            return productRepository.findAll();
        } catch (Exception e) {
            // TODO: handle exception
            return new ArrayList<>();
        }
    }

}
