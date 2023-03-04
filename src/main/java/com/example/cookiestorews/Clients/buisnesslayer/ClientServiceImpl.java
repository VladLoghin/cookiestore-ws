package com.example.cookiestorews.Clients.buisnesslayer;

import com.example.cookiestorews.Clients.datalayer.Client;
import com.example.cookiestorews.Clients.datalayer.Address;
import com.example.cookiestorews.Clients.datalayer.ClientRepository;
import com.example.cookiestorews.Clients.datamapperlayer.ClientRequestMapper;
import com.example.cookiestorews.Clients.datamapperlayer.ClientResponseMapper;
import com.example.cookiestorews.Clients.presentationlayer.ClientRequestModel;
import com.example.cookiestorews.Clients.presentationlayer.ClientResponseModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    private ClientRepository clientRepository;
    private ClientResponseMapper clientResponseMapper;
    private ClientRequestMapper clientRequestMapper;

    public ClientServiceImpl(ClientRepository clientRepository, ClientResponseMapper clientResponseMapper, ClientRequestMapper clientRequestMapper) {
        this.clientRepository = clientRepository;
        this.clientResponseMapper = clientResponseMapper;
        this.clientRequestMapper = clientRequestMapper;
    }

    @Override
    public List<ClientResponseModel> getClients() {
        //List<Client> clients = clientRepository.findAll();
        //return clientResponseMapper.entityListToResponseModelList(clients);
        return clientResponseMapper.entityListToResponseModelList(clientRepository.findAll());
    }

    @Override
    public ClientResponseModel getClientByClientId(String clientId) {
        return clientResponseMapper.entityToResponseModel(clientRepository.findByClientIdentifier_ClientId(clientId));
    }

    @Override
    public ClientResponseModel addClient(ClientRequestModel clientRequestModel) {
        Address address = new Address(clientRequestModel.getStreetAddress(), clientRequestModel.getCity(),
                clientRequestModel.getProvince(), clientRequestModel.getCountry(), clientRequestModel.getPostalCode());
        Client client = clientRequestMapper.requestModelToEntity(clientRequestModel);
        client.setAddress(address);

        return clientResponseMapper.entityToResponseModel(clientRepository.save(client));
    }

    @Override
    public ClientResponseModel updateClient(ClientRequestModel clientRequestModel, String clientId) {

        Client existingClient = clientRepository.findByClientIdentifier_ClientId((clientId));
        if(existingClient == null){
            return  null; //later throw exception
        }

        Address address = new Address(clientRequestModel.getStreetAddress(), clientRequestModel.getCity(),
                clientRequestModel.getProvince(), clientRequestModel.getCountry(), clientRequestModel.getPostalCode());
        Client client = clientRequestMapper.requestModelToEntity(clientRequestModel);
        client.setAddress(address);


        client.setId(existingClient.getId());
        client.setClientIdentifier(existingClient.getClientIdentifier());

        return clientResponseMapper.entityToResponseModel(clientRepository.save(client));
    }

    @Override
    public void removeClient(String clientId) {

        Client existingClient = clientRepository.findByClientIdentifier_ClientId(clientId);

        if(existingClient == null){
            return;
        }

        clientRepository.delete(existingClient);
    }
}
