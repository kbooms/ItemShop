package com.kevinbooms.dao;

import com.kevinbooms.model.Inventory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcInventoryDao implements InventoryDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcInventoryDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Inventory> findAll() {
        List<Inventory> allInventory = new ArrayList<>();
        String sql = "SELECT inventory_id, inventory_name, inventory_type, inventory_available, inventory_price " +
                     "FROM inventory;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            allInventory.add(mapRowToInventory(results));
        }
        return allInventory;
    }

    @Override
    public Inventory findById(Long id) {
        Inventory item;
        String sql = "SELECT inventory_id, inventory_name, inventory_type, inventory_available, inventory_price " +
                     "FROM inventory " +
                     "WHERE inventory_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, id);
        item = mapRowToInventory(results);
        return item;
    }

    @Override
    public List<Inventory> findByType(String type) {
        List<Inventory> matchingTypes = new ArrayList<>();
        String sql = "SELECT inventory_id, inventory_name, inventory_type, inventory_available, inventory_price " +
                     "FROM inventory " +
                     "WHERE inventory_type LIKE ?;";
        type = "%" + type + "%";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, type);
        while (results.next()) {
            matchingTypes.add(mapRowToInventory(results));
        }
        return matchingTypes;
    }

    @Override
    public List<Inventory> findByPrice(int price) {
        return null;
    }

    @Override
    public List<Inventory> findBySearchTerm(String term) {
        List<Inventory> matchingItems = new ArrayList<>();
        String sql = "SELECT inventory_id, inventory_name, inventory_type, inventory_available, inventory_price " +
                "FROM inventory " +
                "WHERE inventory_name ILIKE ?;";
        String fixedTerm = "%" + term + "%";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, fixedTerm);
        while(results.next()) {
            matchingItems.add(mapRowToInventory(results));
        }
        return matchingItems;
    }

    @Override
    public Inventory addInventory(Inventory newInventory) {
        Inventory newItem = new Inventory();
        String sql = "INSERT INTO inventory (inventory_name, inventory_type, inventory_available, inventory_price) " +
                     "VALUES (?, ?, ?, ?) " +
                     "RETURNING inventory_id";


        return null;
    }

    @Override
    public void updateInventory(Inventory updatedInventory) {

    }

    @Override
    public void deleteInventory(Long id) {

    }

    private Inventory mapRowToInventory(SqlRowSet rs) { // rs for rowSet
        Inventory item = new Inventory();
        item.setInventoryId(rs.getLong("inventory_id"));
        item.setInventoryName(rs.getString("inventory_name"));
        item.setInventoryType(rs.getString("inventory_type"));
        item.setInventoryAvailable(rs.getInt("inventory_available"));
        item.setInventoryPrice(rs.getInt("inventory_price"));
        if (rs.wasNull()) {
            item.setInventoryId(null);
        }
        return item;
    }
}
