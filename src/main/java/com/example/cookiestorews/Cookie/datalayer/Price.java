package com.example.cookiestorews.Cookie.datalayer;

import jakarta.validation.constraints.NotNull;

import java.util.Objects;

public class Price {


    private Float cost;


    Price(){

    }

    public Price(@NotNull Float cost){
        Objects.requireNonNull(this.cost = cost);
    }

    public @NotNull Float getCost(){return cost;}

}
