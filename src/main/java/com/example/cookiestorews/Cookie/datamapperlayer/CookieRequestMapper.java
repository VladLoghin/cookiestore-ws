package com.example.cookiestorews.Cookie.datamapperlayer;

import com.example.cookiestorews.Cookie.Inventory.datalayer.InventoryIdentifier;
import com.example.cookiestorews.Cookie.datalayer.Cookie;
import com.example.cookiestorews.Cookie.datalayer.CookieIdentifier;
import com.example.cookiestorews.Cookie.datalayer.Price;
import com.example.cookiestorews.Cookie.presentationlayer.CookieRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CookieRequestMapper {

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(expression = "java(cookieIdentifier)", target = "cookieIdentifier"),
            @Mapping(expression = "java(inventoryIdentifier)", target = "inventoryIdentifier"),
            @Mapping(expression = "java(Price)", target = "price"),
    })
    Cookie requestModelToEntity(CookieRequestModel cookieRequestModel, CookieIdentifier cookieIdentifier, InventoryIdentifier inventoryIdentifier, Price price);
}
