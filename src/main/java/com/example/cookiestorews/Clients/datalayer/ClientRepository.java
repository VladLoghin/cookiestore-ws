package com.example.cookiestorews.Clients.datalayer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Integer>{
    Client findByClientIdentifier_ClientId(String clientId);
}
