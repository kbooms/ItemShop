package com.kevinbooms.dao;

import com.kevinbooms.model.Item;

import java.util.List;

public interface ItemDao {
    /**
     * Get all of the items currently available in the inventory
     */
    List<Item> findAll();

    /**
     * Get an Item from the datastore based on the given id
     * @param itemId the id of the item to retrieve
     * @return a complete Item object
     */
    Item getItem(long itemId);

    /**
     * Get Items from the datastore based on the given
     * search term. Should return any item with term in "name"
     * @param term the search term input by the user
     * @return a list of items matching the supplied term
     */
    List<Item> findBySearchTerm(String term);

    /**
     * Get items whose 'type' match the given search string
     * @param search the string to search for in item types
     * @return a List of Item objects
     */
    List<Item> findItemsByType(String itemType);
}
