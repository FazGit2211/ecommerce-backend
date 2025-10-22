package com.api.eCommerceProducts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.eCommerceProducts.models.T_Shirt;
import com.api.eCommerceProducts.services.tshirts.T_ShirtService;

@RestController
@RequestMapping(value = "/tshirts", produces = MediaType.APPLICATION_JSON_VALUE)
public class T_ShirtController {

    @Autowired
    private T_ShirtService t_ShirtService;

    @PostMapping
    public ResponseEntity<T_Shirt> create(@RequestBody T_Shirt t_Shirt) {
        try {
            return t_ShirtService.createNew(t_Shirt);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<T_Shirt>> getAllList() {
        try {
            List<T_Shirt> list = t_ShirtService.getList();
            if (list == null) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
