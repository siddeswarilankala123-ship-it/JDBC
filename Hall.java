package com.hallbooking.model;

public class Hall {
    private int id, capacity;
    private String name, location, description;
    private double price;
    public int getId(){return id;} public void setId(int v){id=v;}
    public int getCapacity(){return capacity;} public void setCapacity(int v){capacity=v;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public String getLocation(){return location;} public void setLocation(String v){location=v;}
    public String getDescription(){return description;} public void setDescription(String v){description=v;}
    public double getPrice(){return price;} public void setPrice(double v){price=v;}
}
