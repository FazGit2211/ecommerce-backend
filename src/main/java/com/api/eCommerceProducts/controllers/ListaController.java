package com.api.eCommerceProducts.controllers;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.eCommerceProducts.tads.listTad.Lista;
import com.api.eCommerceProducts.tads.listTad.Nodo;

@RestController
@RequestMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
public class ListaController {
    @PostMapping
    public ResponseEntity<Nodo> addList(int value){
        try {
            Nodo nodo = new Nodo(value);
            Lista lista = new Lista();
            lista.insertarNodo(nodo);
            return ResponseEntity.ok(nodo);
        } catch (Exception e) {
            // TODO: handle exception
            return ResponseEntity.badRequest().build();
        }
    }
}
