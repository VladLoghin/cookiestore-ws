package com.example.cookiestorews.Clients.buisnesslayer;

import ch.qos.logback.core.net.server.Client;
import com.example.cookiestorews.Clients.presentationlayer.ClientRequestModel;
import com.example.cookiestorews.Clients.presentationlayer.ClientResponseModel;
import org.mapstruct.Mapping;

import java.util.List;

public interface ClientService {

    List<ClientResponseModel> getClients();
    ClientResponseModel getClientByClientId(String clientId);
    ClientResponseModel addClient(ClientRequestModel clientRequestModel);
    ClientResponseModel updateClient(ClientRequestModel clientRequestModel, String clientId);
    void removeClient(String clientId);
}

