package com.example.cookiestorews.Cookie.Inventory.datalayer;

import com.example.cookiestorews.Clients.datalayer.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Client, Integer> {
    Inventory findByInventoryIdentifier_InventoryID(String inventoryID);
    String existsByInventoryIdentifier_InventoryID(String inventoryID);

}
