package com.api.eCommerceProducts.services;

import com.api.eCommerceProducts.models.Order;

import java.util.List;

public interface OrderInterface {
    Order CreateOrder(Order paramOrder);
    List<Order> GetAllOrder();
}
