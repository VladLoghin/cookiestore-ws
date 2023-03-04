package com.example.cookiestorews.Cookie.Inventory.datamapperlayer;

import com.example.cookiestorews.Cookie.Inventory.datalayer.Inventory;
import com.example.cookiestorews.Cookie.Inventory.presentationlayer.InventoryRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InventoryRequestMapper {
    @Mapping(target="id", ignore = true)
    @Mapping(target = "inventoryIdentifier", ignore = true)
    Inventory requestModelToEntity(InventoryRequestModel requestModel);
}
