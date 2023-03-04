package com.example.cookiestorews.Cookie.presentationlayer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CookieResponseModel {
    private String cookie_id;
    private String inventory_id;
    private String cookie_name;
    private Integer quantity;
    private String cookie_size;
    private Float price;
}
