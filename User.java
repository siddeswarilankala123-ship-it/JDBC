package com.hallbooking.model;

public class User {
    private int id;
    private String name, email, password, role;
    public User() {}
    public User(String name,String email,String password,String role){this.name=name;this.email=email;this.password=password;this.role=role;}
    public int getId(){return id;} public void setId(int id){this.id=id;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public String getEmail(){return email;} public void setEmail(String v){email=v;}
    public String getPassword(){return password;} public void setPassword(String v){password=v;}
    public String getRole(){return role;} public void setRole(String v){role=v;}
}
