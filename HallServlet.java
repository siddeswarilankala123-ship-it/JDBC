package com.hallbooking.controller;
import com.hallbooking.dao.HallDAO; import com.hallbooking.model.Hall;
import jakarta.servlet.annotation.WebServlet; import jakarta.servlet.http.*; import java.io.IOException;
@WebServlet("/halls")
public class HallServlet extends HttpServlet{
 protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException{
  try{req.setAttribute("halls",new HallDAO().findAll());req.getRequestDispatcher("/halls.jsp").forward(req,resp);}
  catch(Exception e){throw new IOException(e);}
 }
}
