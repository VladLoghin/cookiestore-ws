package com.example.cookiestorews.Cookie.datalayer;

import com.example.cookiestorews.Clients.datalayer.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CookieRepository extends JpaRepository<Client, Integer> {
    List<Cookie> findAllByInventoryIdentifier_InventoryID(String inventoryID);

}
