package com.api.eCommerceProducts.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.eCommerceProducts.models.T_Shirt;
import com.api.eCommerceProducts.repositorys.T_ShirtRepository;

@Service
public class T_ShirtService implements T_ShirtInterface {

    @Autowired
    private T_ShirtRepository t_ShirtRepository;

    @Override
    public ResponseEntity<T_Shirt> createNew(T_Shirt t_Shirt) {
        try {
            return ResponseEntity.ok(t_ShirtRepository.save(t_Shirt));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @Override
    public List<T_Shirt> getList() {
        try {
            List<T_Shirt> tShirtList = t_ShirtRepository.findAll();
            return  tShirtList;
        } catch (Exception e) {
            return null;
        }
    }

}
