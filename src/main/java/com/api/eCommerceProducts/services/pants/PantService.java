package com.api.eCommerceProducts.services.pants;

import com.api.eCommerceProducts.models.Pant;
import com.api.eCommerceProducts.repositorys.PantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PantService implements PantInterface {
    @Autowired
    private PantRepository pantRepository;

    @Override
    public ResponseEntity<Pant> createPant(Pant pant) {
        try {
            pantRepository.save(pant);
            return ResponseEntity.ok(pant);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResponseEntity<List<Pant>> getAllPants() {
        try {
            return ResponseEntity.ok(pantRepository.findAll());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
