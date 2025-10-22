package com.api.eCommerceProducts.controllers;

import com.api.eCommerceProducts.models.Pant;
import com.api.eCommerceProducts.services.pants.PantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pants", produces = MediaType.APPLICATION_JSON_VALUE)
public class PantController {
    @Autowired
    private PantService pantService;

    @PostMapping
    public ResponseEntity<Pant> create(@RequestBody Pant pant){
        try{
            return pantService.createPant(pant);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Pant>> getAll(){
        try{
            return pantService.getAllPants();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
