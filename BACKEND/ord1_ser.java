/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class ord1_ser extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
        String name=request.getParameter("user");
       String phone=request.getParameter("phone");
       int no=Integer.parseInt(request.getParameter("count"));
       int tot=Integer.parseInt(request.getParameter("amount"));

       //HttpSession s1=request.getSession();
       //String name=(String)s1.getAttribute("username");
      try{
           Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123");
        //Statement s=con.createStatement();
        PreparedStatement ps =con.prepareStatement("insert into order(name,phone,no,tot) values(?,?,?,?)");
        ps.setString(1,name);
        ps.setString(2,phone);
        ps.setInt(3,no);
        ps.setInt(4,tot);
        ps.executeUpdate();
         RequestDispatcher rd=request.getRequestDispatcher("order1.html");
            rd.include(request, response);
          out.println("<center><h2>Inserted</h2></center>"); 
       }
       catch(Exception e){
           out.println(e);
       }



}
}
