package com.kevinbooms.dao;

import com.kevinbooms.model.Order;

public interface OrderDao {

    /**
     * Get the grand total of gold in the order history via the datastore.
     *
     * @return the total as a Long
     */
    Long getTotalGold();

    /**
     *  Get the order from the datastore with the given id
     * @param orderId the id of the sale to retrieve
     * @return a complete Order object
     */
    Order getOrder(int orderId);

}
