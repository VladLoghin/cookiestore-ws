package com.example.cookiestorews.Cookie.Inventory.datamapperlayer;

import com.example.cookiestorews.Cookie.Inventory.datalayer.Inventory;
import com.example.cookiestorews.Cookie.Inventory.presentationlayer.CookieInventoryResponseModel;
import com.example.cookiestorews.Cookie.presentationlayer.CookieResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CookieInventoryResponseMapper {


    //@Mapping(expression = "java(inventory.getInventoryIdentifier().getInventory_id())", target = "inventory_id")
    //@Mapping(expression = "java(cookies)", target = "availableCookies")
    CookieInventoryResponseModel entitiesToResponseModel(Inventory inventory, List<CookieResponseModel> cookies);
}
