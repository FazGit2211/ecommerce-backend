package com.api.eCommerceProducts.models;

public class Pant extends Product{

    public Pant(){}

    public Pant(String name, double price, String description, int stock, String category, String image, String code, String type){
        super(name, price, description, stock, category, image, code, type);
    }

    @Override
    public void decrementStock(int num) {
        try {
            int actStock = this.getStock();
            if (num > 0 && actStock >= 0){
                this.setStock(actStock -= num);
            }
        }catch (Exception ex){
            throw ex;
        }
    }

}
