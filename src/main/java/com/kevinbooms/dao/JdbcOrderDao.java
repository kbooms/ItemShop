package com.kevinbooms.dao;

import com.kevinbooms.model.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;

public class JdbcOrderDao implements OrderDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcOrderDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Long getTotalGold() {
        return jdbcTemplate.queryForObject("SELECT SUM(total_sale) FROM orders;", Long.class);
    }

    @Override
    public Order getOrder(long orderId) {
        Order order = null;
        String sql = "SELECT order_id, customer, is_delivered, total_sale " +
                     "FROM orders " +
                     "WHERE order_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, orderId);
        if (results.next()) {
            order = mapRowToOrder(results);
        }
        return order;
    }

    public Order mapRowToOrder(SqlRowSet rs) {
        Order order = new Order();
        order.setOrderId(rs.getLong("order_id"));
        order.setCustomer(rs.getString("customer"));
        order.setDelivered(rs.getBoolean("is_delivered"));
        order.setTotalSale(rs.getInt("total_sale"));
//        order.setItemsCart(rs.getString("items_cart"));
        if (rs.wasNull()) {
            order.setOrderId(null);
        }
        return order;
    }
}
