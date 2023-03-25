package com.kevinbooms.dao;

import com.kevinbooms.model.Item;

import java.util.List;

public interface ItemDao {

    /**
     * Get an Item from the datastore based on the given id
     * @param itemId the id of the item to retrieve
     * @return a complete Item object
     */
    Item getItem(long itemId);

    /**
     * Get items whose 'type' match the given search string
     * @param search the string to search for in item types
     * @return a List of Item objects
     */
    List<Item> findItemsByType(String itemType);
}
