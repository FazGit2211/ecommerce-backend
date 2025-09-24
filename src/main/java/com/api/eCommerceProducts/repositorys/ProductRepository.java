package com.api.eCommerceProducts.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.eCommerceProducts.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
