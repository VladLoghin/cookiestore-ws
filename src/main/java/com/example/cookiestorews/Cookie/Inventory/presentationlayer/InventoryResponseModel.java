package com.example.cookiestorews.Cookie.Inventory.presentationlayer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class InventoryResponseModel {
    private String inventory_id;
    private String stock_type;
}
