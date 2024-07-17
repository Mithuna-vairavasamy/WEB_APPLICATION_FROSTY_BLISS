/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lourd
 */
public class reg_ser extends HttpServlet {

  
  
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       String uname=request.getParameter("username");
       String uemail=request.getParameter("email");
       String pwd=request.getParameter("password");
       String cpwd=request.getParameter("cpassword");
       
       try{
           
       Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123");
        Statement s=con.createStatement();
        PreparedStatement ps =con.prepareStatement("insert into reg(uname,uemail,pwd,cpwd) values(?,?,?,?)");
        ps.setString(1,uname);
        ps.setString(2,uemail);
        ps.setString(3,pwd);
        ps.setString(4,cpwd);
        
   ps.executeUpdate();
       
            
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.include(request, response);
         
    }

       
catch(Exception e){
out.println(e);

}
}
}
