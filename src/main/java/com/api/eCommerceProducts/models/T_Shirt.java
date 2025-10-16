package com.api.eCommerceProducts.models;

import jakarta.persistence.Entity;

@Entity
public class T_Shirt extends Product{
    private String code;
    private String type;

    public T_Shirt(){}

    public T_Shirt(String name,double price,String description,int stock,String category,String image,String code,String type){
        super(name, price, description, stock, category, image);
        this.code = code;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public String getType() {
        return type;
    }
    
}
