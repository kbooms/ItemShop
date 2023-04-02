package com.kevinbooms.dao;

import com.kevinbooms.model.Inventory;

import java.util.List;

public interface InventoryDao {

    /**
     * a user can list all items in inventory
     * a user search for an item by id
     * a user can search for an item by type
     * a user can search for an item by price
     * a user can search fpr an item by a search term
     */

    List<Inventory> findAll();

    Inventory findById(Long id);

    List<Inventory> findByType(String type);

    List<Inventory> findByPrice(int price);

    List<Inventory> findBySearchTerm(String term);

    Inventory addInventory(Inventory newInventory);

    void updateInventory(Inventory updatedInventory);

    void deleteInventory(Long id);
}
