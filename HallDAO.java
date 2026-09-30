package com.hallbooking.dao;

import com.hallbooking.model.Hall;
import com.hallbooking.util.DBConnection;
import java.sql.*;
import java.util.*;

public class HallDAO {
    public List<Hall> findAll() throws SQLException {
        List<Hall> list=new ArrayList<>();
        try(Connection c=DBConnection.getConnection(); PreparedStatement p=c.prepareStatement("SELECT * FROM function_halls ORDER BY id DESC"); ResultSet r=p.executeQuery()){
            while(r.next()){Hall h=new Hall();h.setId(r.getInt("id"));h.setName(r.getString("name"));h.setLocation(r.getString("location"));h.setCapacity(r.getInt("capacity"));h.setPrice(r.getDouble("price"));h.setDescription(r.getString("description"));list.add(h);}
        } return list;
    }
}
