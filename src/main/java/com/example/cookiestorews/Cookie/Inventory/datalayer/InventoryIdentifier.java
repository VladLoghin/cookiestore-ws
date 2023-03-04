package com.example.cookiestorews.Cookie.Inventory.datalayer;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Embeddable
public class InventoryIdentifier {

    private String inventoryID;

    public InventoryIdentifier(){this.inventoryID = UUID.randomUUID().toString();}

}
