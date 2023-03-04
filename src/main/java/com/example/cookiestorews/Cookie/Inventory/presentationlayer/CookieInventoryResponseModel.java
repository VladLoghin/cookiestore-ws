package com.example.cookiestorews.Cookie.Inventory.presentationlayer;

import com.example.cookiestorews.Cookie.presentationlayer.CookieResponseModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CookieInventoryResponseModel {
    private String inventory_id;
    private String stock_type;
    private List<CookieResponseModel> availableCookies;
}
