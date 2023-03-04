package com.example.cookiestorews.Cookie.datalayer;

import com.example.cookiestorews.Cookie.Inventory.datalayer.InventoryIdentifier;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Cookie")
@Data
public class Cookie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Embedded
    private CookieIdentifier cookieIdentifier;

    @Embedded
    private InventoryIdentifier inventoryIdentifier;

    @Enumerated(EnumType.STRING)
    private Size Size;

    private Integer Quantity;

    @Enumerated(EnumType.STRING)
    private Name Name;

    private Double Price;

    Cookie(){

    }

    public Cookie(CookieIdentifier cookieIdentifier, Size size, Integer quantity, Name name, Double price) {
        this.cookieIdentifier = cookieIdentifier;
        Size = size;
        Quantity = quantity;
        Name = name;
        Price = price;
    }
}
