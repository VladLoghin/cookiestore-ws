package com.example.cookiestorews.Clients.presentationlayer;

import com.example.cookiestorews.Clients.buisnesslayer.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;


import java.util.List;

@RestController
@RequestMapping("api/v1/clients")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping()
    public List<ClientResponseModel> getClients(){
        return clientService.getClients();
    }

    @GetMapping("/{clientId}")
    public ClientResponseModel getClientByClientId(@PathVariable String clientId){
        return clientService.getClientByClientId(clientId);
    }

    @PostMapping()
    public ClientResponseModel addClient(@RequestBody ClientRequestModel clientRequestModel){
        return clientService.addClient(clientRequestModel);
    }

    @PutMapping("/{clientId}")
    public ClientResponseModel updateClient(@RequestBody ClientRequestModel clientRequestModel, @PathVariable String clientId){
        return clientService.updateClient(clientRequestModel, clientId);
    }

    @DeleteMapping("/{clientId}")
    public void removeClient(@PathVariable String clientId){
        clientService.removeClient(clientId);
    }
}


