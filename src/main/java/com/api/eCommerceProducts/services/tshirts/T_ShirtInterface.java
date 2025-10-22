package com.api.eCommerceProducts.services.tshirts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.eCommerceProducts.models.T_Shirt;

public interface T_ShirtInterface {
    ResponseEntity<T_Shirt> createNew(T_Shirt t_Shirt);

    List<T_Shirt> getList();
}
