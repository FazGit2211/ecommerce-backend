package com.api.eCommerceProducts.models;

import jakarta.persistence.OneToMany;

import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private String surname;
    private String email;
    @OneToMany
    private ArrayList<Order> orders;

    public Client(String paramName,String paramSurname,String paramEmail){
        this.name = paramName;
        this.surname = paramSurname;
        this.email = paramEmail;
        this.orders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addOrder(Order paramOrder){
        this.orders.add(paramOrder);
    }

    public ArrayList<Order> getOrders(){
        return this.orders;
    }
}
