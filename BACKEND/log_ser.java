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
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SasiMalu
 */
public class log_ser extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String uname=request.getParameter("username"); 
        String pwd=request.getParameter("password");
        HttpSession session=request.getSession();
        session.setAttribute("username",uname);
        try{
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123");
       // Statement s=con.createStatement();
        PreparedStatement ps =con.prepareStatement("SELECT * FROM \"public\".reg where uname=? AND pwd=?");
        ps.setString(1,uname);
        ps.setString(2,pwd);
        
        
        ResultSet rs;
        rs=ps.executeQuery();
        if(rs.next())
        {
            response.sendRedirect("home.html");
        }
        else{
            RequestDispatcher rd=request.getRequestDispatcher("register.html");
            rd.include(request, response);
          out.println("<center><h2>kindly register</h2></center>");
        }
                

        
          
    }

    catch(Exception e)
            {
    out.println(e);
}
}}
