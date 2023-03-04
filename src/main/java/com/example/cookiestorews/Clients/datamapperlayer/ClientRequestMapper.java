package com.example.cookiestorews.Clients.datamapperlayer;

import com.example.cookiestorews.Clients.datalayer.Client;
import com.example.cookiestorews.Clients.presentationlayer.ClientRequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientRequestMapper {


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "clientIdentifier", ignore = true)
    @Mapping(target = "address", ignore = true)

    Client requestModelToEntity(ClientRequestModel requestModel);

}

