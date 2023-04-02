package com.kevinbooms.dao;

import com.kevinbooms.model.Inventory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;

public class JdbcInventoryDao implements InventoryDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcInventoryDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Inventory> findAll() {
        return null;
    }

    @Override
    public Inventory findById(long id) {
        return null;
    }

    @Override
    public List<Inventory> findByType(String type) {
        return null;
    }

    @Override
    public List<Inventory> findByPrice(int price) {
        return null;
    }

    @Override
    public List<Inventory> findBySearchTerm(String term) {
        return null;
    }

    private Inventory mapRowToInventory(SqlRowSet rs) { // rs for rowSet
        Inventory item = new Inventory();
        item.setId(rs.getLong("item_id"));
        item.setName(rs.getString("item_name"));
        item.setType(rs.getString("item_type"));
        item.setAvaialble(rs.getInt("inventory_available"));
        item.setPrice(rs.getInt("inventory_price"));
        if (rs.wasNull()) {
            item.setId(null);
        }
        return item;
    }
}
