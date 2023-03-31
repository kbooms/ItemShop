package com.kevinbooms.dao;

import com.kevinbooms.model.Item;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcItemDao implements ItemDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcItemDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Item> findAll() {
        List<Item> items = new ArrayList<>();
        String sql = "SELECT item_id, item_name, item_type, item_value, item_desc " +
                     "FROM item;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while (results.next()) {
            items.add(mapRowToItem(results));
        }
        return items;
    }
    @Override
    public Item getItem(long itemId) {
        Item item = null;
        String sql = "SELECT item_id, item_name, item_type, item_value, item_desc " +
                     "FROM item " +
                     "WHERE item_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, itemId);
        if (results.next()) {
            item = mapRowToItem(results);
        }
        return item;
    }

    @Override
    public List<Item> findItemsByType(String itemType) {
        List<Item> items = new ArrayList<>();
        String sql = "SELECT item_id, item_name, item_type, item_value, item_desc " +
                     "FROM item " +
                     "WHERE item_type LIKE ?;";
        itemType = "%" + itemType + "%";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, itemType);
        while (results.next()) {
            items.add(mapRowToItem(results));
        }
        return items;
    }

    private Item mapRowToItem(SqlRowSet rs) { // rs for rowSet
        Item item = new Item();
        item.setItemId(rs.getLong("item_id"));
        item.setItemName(rs.getString("item_name"));
        item.setItemType(rs.getString("item_type"));
        item.setItemValue(rs.getInt("item_value"));
        item.setItemDescription(rs.getString("item_desc"));
        if (rs.wasNull()) {
            item.setItemId(null);
        }
        return item;
    }
}
