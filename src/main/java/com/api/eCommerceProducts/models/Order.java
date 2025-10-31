package com.api.eCommerceProducts.models;

import jakarta.persistence.OneToMany;

import java.util.ArrayList;

public class Order {
    private int id;
    private String code;
    private Client client;
    @OneToMany
    private ArrayList<Product> products;

    public Order(Client paramClient, String paramCode){
        this.client = paramClient;
        this.code = paramCode;
        this.products = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public Client getClient() {
        return client;
    }

    public void addProduct(Product paramProduct){
        this.products.add(paramProduct);
    }

    public ArrayList<Product> getProducts(){
        return this.products;
    }

    public double calculateTotalPrice(){
        double total = 0;
        for(Product p : products){
            total += p.getPrice() * p.getStock();
        }
        return  total;
    }
}
