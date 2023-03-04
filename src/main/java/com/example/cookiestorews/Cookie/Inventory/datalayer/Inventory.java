package com.example.cookiestorews.Cookie.Inventory.datalayer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Inventories")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private InventoryIdentifier inventoryIdentifier;

    private String stock_type;

    public Inventory() {
        this.inventoryIdentifier = new InventoryIdentifier();
    }

    public Inventory(InventoryIdentifier inventoryIdentifier, String stock_type) {
        this.inventoryIdentifier = inventoryIdentifier;
        this.stock_type = stock_type;
    }
}
