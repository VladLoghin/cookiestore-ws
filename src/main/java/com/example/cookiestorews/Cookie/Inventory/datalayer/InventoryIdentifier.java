package com.example.cookiestorews.Cookie.Inventory.datalayer;

import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class InventoryIdentifier {

    private String inventoryID;

    InventoryIdentifier(){this.inventoryID = UUID.randomUUID().toString();}

    public String getInventoryID(){return inventoryID;}
}
