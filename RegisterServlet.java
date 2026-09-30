package com.hallbooking.controller;
import com.hallbooking.dao.UserDAO; import com.hallbooking.model.User;
import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*; import java.io.IOException;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
 protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException{
  try{User u=new User(req.getParameter("name"),req.getParameter("email"),req.getParameter("password"),"CUSTOMER");new UserDAO().register(u);resp.sendRedirect("login.html");}
  catch(Exception e){throw new IOException(e);}
 }
}
