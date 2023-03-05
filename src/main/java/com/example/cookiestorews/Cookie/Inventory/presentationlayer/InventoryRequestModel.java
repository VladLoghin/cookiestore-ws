package com.example.cookiestorews.Cookie.Inventory.presentationlayer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventoryRequestModel {

    String stock_type;

    public InventoryRequestModel(){

    }

    public String getStock_type() {
        return stock_type;
    }

    public void setStock_type(String stock_type) {
        this.stock_type = stock_type;
    }

}
