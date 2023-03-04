package com.example.cookiestorews.Cookie.Inventory.datamapperlayer;

import com.example.cookiestorews.Cookie.Inventory.datalayer.Inventory;
import com.example.cookiestorews.Cookie.Inventory.presentationlayer.InventoryResponseModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InventoryResponseMapper {

    @Mapping(expression = "java(Inventories.getInventory_id().getInventory_id())", target = "inventory_id")


    InventoryResponseModel entityToResponseModel(Inventory inventory);

    List<InventoryResponseModel> entityListToResponseModelList(List<Inventory> inventories);

}
