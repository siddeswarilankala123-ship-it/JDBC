package com.hallbooking.model;

public class Booking {
    private int id,userId,hallId,guests;
    private String bookingDate,eventType,status;
    private double totalAmount;
    public int getId(){return id;} public void setId(int v){id=v;}
    public int getUserId(){return userId;} public void setUserId(int v){userId=v;}
    public int getHallId(){return hallId;} public void setHallId(int v){hallId=v;}
    public int getGuests(){return guests;} public void setGuests(int v){guests=v;}
    public String getBookingDate(){return bookingDate;} public void setBookingDate(String v){bookingDate=v;}
    public String getEventType(){return eventType;} public void setEventType(String v){eventType=v;}
    public String getStatus(){return status;} public void setStatus(String v){status=v;}
    public double getTotalAmount(){return totalAmount;} public void setTotalAmount(double v){totalAmount=v;}
}
