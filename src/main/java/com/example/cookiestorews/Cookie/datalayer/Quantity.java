package com.example.cookiestorews.Cookie.datalayer;

import jakarta.validation.constraints.NotNull;

import java.util.Objects;

public class Quantity {
    private Integer quantity;

    Quantity(){

    }

    public Quantity(@NotNull Integer quantity){
        Objects.requireNonNull(this.quantity = quantity);
    }

    public @NotNull Integer getQuantity(){return quantity;}
}
