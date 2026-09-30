package com.hallbooking.controller;
import com.hallbooking.dao.BookingDAO; import com.hallbooking.model.User;
import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*; import java.io.IOException;
@WebServlet("/booking")
public class BookingServlet extends HttpServlet{
 protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException{
  try{
   User u=(User)req.getSession().getAttribute("user");
   if(u==null){resp.sendRedirect("login.html");return;}
   int hallId=Integer.parseInt(req.getParameter("hallId"));
   String date=req.getParameter("bookingDate"), event=req.getParameter("eventType");
   int guests=Integer.parseInt(req.getParameter("guests")); double amount=Double.parseDouble(req.getParameter("amount"));
   new BookingDAO().create(u.getId(),hallId,date,event,guests,amount);
   resp.getWriter().println("Booking created successfully. You can close this page.");
  }catch(Exception e){throw new IOException(e);}
 }
}
