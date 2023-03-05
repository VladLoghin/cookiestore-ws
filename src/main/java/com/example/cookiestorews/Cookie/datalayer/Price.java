package com.example.cookiestorews.Cookie.datalayer;

import jakarta.validation.constraints.NotNull;

import java.util.Objects;

public class Price {


    public Double cost;


    Price(){

    }

    public Price(@NotNull Double cost){
        Objects.requireNonNull(this.cost = cost);
    }

    public @NotNull Double getCost(){return cost;}

}
