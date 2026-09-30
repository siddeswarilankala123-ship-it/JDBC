package com.hallbooking.dao;

import com.hallbooking.model.User;
import com.hallbooking.util.DBConnection;
import java.sql.*;

public class UserDAO {
    public boolean register(User u) throws SQLException {
        String sql="INSERT INTO users(name,email,password,role) VALUES(?,?,?,'CUSTOMER')";
        try(Connection c=DBConnection.getConnection(); PreparedStatement p=c.prepareStatement(sql)){
            p.setString(1,u.getName()); p.setString(2,u.getEmail()); p.setString(3,u.getPassword());
            return p.executeUpdate()==1;
        }
    }
    public User login(String email,String password) throws SQLException {
        String sql="SELECT * FROM users WHERE email=? AND password=?";
        try(Connection c=DBConnection.getConnection(); PreparedStatement p=c.prepareStatement(sql)){
            p.setString(1,email); p.setString(2,password);
            try(ResultSet r=p.executeQuery()){ if(r.next()){User u=new User();u.setId(r.getInt("id"));u.setName(r.getString("name"));u.setEmail(r.getString("email"));u.setRole(r.getString("role"));return u;} }
        } return null;
    }
}
