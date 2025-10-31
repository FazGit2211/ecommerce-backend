package com.api.eCommerceProducts.controllers;

import com.api.eCommerceProducts.models.Client;
import com.api.eCommerceProducts.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients",produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {

    @Autowired
    private ClientService clientService;

    public ResponseEntity<Client> PostClient(@RequestBody Client paramClient){
        try {
            Client clientCreated = clientService.CreateClient(paramClient);
            if (clientCreated.equals(null)){
                return ResponseEntity.badRequest().build();
            }
            return ResponseEntity.ok(clientCreated);
        }catch(Exception e){
            return ResponseEntity.internalServerError().build();
        }
    }
}
