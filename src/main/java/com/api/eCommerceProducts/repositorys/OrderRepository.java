package com.api.eCommerceProducts.repositorys;

import com.api.eCommerceProducts.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
