package com.api.eCommerceProducts.services;

import com.api.eCommerceProducts.models.Order;
import com.api.eCommerceProducts.repositorys.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderService implements OrderInterface{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order CreateOrder(Order paramOrder) {
        try{
            if (paramOrder.getClient().getName().trim() != "" && !paramOrder.getProducts().isEmpty()){
                return orderRepository.save(paramOrder);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Order> GetAllOrder() {
        try {
            return orderRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
