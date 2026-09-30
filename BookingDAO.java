package com.hallbooking.dao;

import com.hallbooking.util.DBConnection;
import java.sql.*;

public class BookingDAO {
    public boolean create(int userId,int hallId,String date,String eventType,int guests,double amount) throws SQLException {
        String sql="INSERT INTO bookings(user_id,hall_id,booking_date,event_type,guests,total_amount) VALUES(?,?,?,?,?,?)";
        try(Connection c=DBConnection.getConnection();PreparedStatement p=c.prepareStatement(sql)){
            p.setInt(1,userId);p.setInt(2,hallId);p.setDate(3,Date.valueOf(date));p.setString(4,eventType);p.setInt(5,guests);p.setDouble(6,amount);
            return p.executeUpdate()==1;
        }
    }
}
