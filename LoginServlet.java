package com.hallbooking.controller;
import com.hallbooking.dao.UserDAO; import com.hallbooking.model.User;
import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*; import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
 protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws IOException{
  try{User u=new UserDAO().login(req.getParameter("email"),req.getParameter("password"));if(u!=null){req.getSession().setAttribute("user",u);resp.sendRedirect("halls");}else resp.sendRedirect("login.html?error=1");}
  catch(Exception e){throw new IOException(e);}
 }
}
