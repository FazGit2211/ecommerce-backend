package com.api.eCommerceProducts.services.pants;

import com.api.eCommerceProducts.models.Pant;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface PantInterface {
    ResponseEntity<Pant> createPant(Pant pant);
    ResponseEntity<List<Pant>> getAllPants();
}
