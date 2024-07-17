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
 * @author SasiMalu
 */
public class admin extends HttpServlet {

  

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
      out.println("<!DOCTYPE html>\n" +
"<!--\n" +
"Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license\n" +
"Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Html.html to edit this template\n" +
"-->\n" +
"<html>\n" +
"    <head>\n" +
"        <title>TODO supply a title</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    \n" +
"    <style>\n" +
"        body\n" +
"{\n" +
"background:linear-gradient(rgba(0,0,0,0.35),rgba(0,0,0,0.35)),url(reg.webp);\n" +
"background-size:cover;\n" +
"width:100%;\n" +
"height:100%;\n" +
"color:white;\n" +
"}\n" +
"ul{\n" +
"display:flex;\n" +
"position:absolute;\n" +
"right:20px;\n" +
"top:20px;\n" +
"\n" +
"}\n" +
"\n" +
"\n" +
"ul li{\n" +
"list-style:none;\n" +
"margin-left:62px;\n" +
"margin-top:27px;\n" +
"}\n" +
"\n" +
"ul li a{\n" +
"font-size:2vw;\n" +
"text-decoration:none;\n" +
"color:snow;\n" +
"text-shadow:2px 2px black;\n" +
"}\n" +
"\n" +
"ul li.active a{\n" +
"	background-color:white;\n" +
"	color:darkmagenta;\n" +
"        padding:6px;\n" +
"        border-radius: 6px;\n" +
"        text-shadow:none;\n" +
"         font-weight:bold;\n" +
"}\n" +
"\n" +
"ul li a:hover\n" +
"{\n" +
"font-weight:bold;\n" +
"color:darkmagenta;\n" +
"padding:5px;\n" +
"text-shadow:none;\n" +
"background-color:white;\n" +
"border-top-left-radius: 6px;\n" +
"border-bottom-left-radius: 6px;\n" +
"border-top-right-radius:6px;\n" +
"border-bottom-right-radius:6px;\n" +
"}\n"+
"        </style></head>\n" +
"    <body>\n" +

"<div>\n" +
"<ul>\n" +
"<li class='active'><a href=\"index.html\">LOGOUT</a></li>	\n" +
"</ul>\n" +
"</div>\n"+
"        <h1>RESTOCK THE ITEM</h1>\n" +
"        <form  action='admin' method=\"get\" onsubmit=\"return field()\">\n" +
"        STRAWBERRY:<input type=\"text\"  id=\"i1\" name=\"i1\"><br><br>\n" +
"        BUTTER PECAN:<input type=\"text\" id=\"i2\" name=\"i2\"><br><br>\n" +
"        CHOCOLATE: <input type=\"text\" id=\"i3\" name=\"i3\"><br><br>\n" +
"        COOKIES'N CREAM: <input type=\"text\" id=\"i4\" name=\"i4\"><br><br>\n" +
"        ROCKY ROAD: <input type=\"text\" id=\"i5\" name=\"i5\"><br><br>\n" +
"PISTACHIO<input type=\"text\" id=\"i6\" name=\"i6\"><br><br>\n" +
"VANILLA:<input type=\"text\"  id=\"i7\" name=\"i7\"><br><br>\n" +
"COTTON CANDY:<input type=\"text\"  id=\"i8\" name=\"i8\"><br> <br>\n" +
"MATCHA:<input type=\"text\" id=\"i9\" name=\"i9\"><br><br>\n" +
"FROSTY BLISS SIGNATURE:<input type=\"text\" id=\"i10\" name=\"i10\"><br><br> \n" +
"<input type=\"submit\" value=\"submit\"><p id=\"show\"></p></form> \n" +
"<script>\n" +
"    function field(){\n" +
"        var i1=document.getElementById('i1').value;\n" +
"        var i2=document.getElementById('i2').value;\n" +
"        var i3=document.getElementById('i3').value;\n" +
"        var i4=document.getElementById('i4').value;\n" +
"        var i5=document.getElementById('i5').value;\n" +
"        var i6=document.getElementById('i6').value;\n" +
"        var i7=document.getElementById('i7').value;\n" +
"        var i8=document.getElementById('i8').value;\n" +
"        var i9=document.getElementById('i9').value;\n" +
"        var i10=document.getElementById('i10').value;\n" +
"       \n" +
"       if(i1===\"\" || i2===\"\"|| i3===\"\"|| i4===\"\"|| i5===\"\"|| i6===\"\"|| i7===\"\"|| i8===\"\"|| i9===\"\" || i10===\"\")\n" +
"       {\n" +
"          document.getElementById('show').innerHTML=\"REFILL THE ITEM\";\n" +
"          show.style=\"color:red;\";\n" +
"                \n" +
"                return false;\n" +
"       }\n" +
"       return true;\n" +
"    }\n" +
"    </script>\n" +
"    </body>\n" +
"</html>\n" +
"");
      
      
       try{
           
       Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123");
        Statement s=con.createStatement();
        
 
      
              
               String i1=request.getParameter("i1");
       String i2=request.getParameter("i2");
       String i3=request.getParameter("i3");
       String i4=request.getParameter("i4");
       String i5=request.getParameter("i5");
       String i6=request.getParameter("i6");
       String i7=request.getParameter("i7");
       String i8=request.getParameter("i8");
       String i9=request.getParameter("i9");
       String i10=request.getParameter("i10");
        PreparedStatement p =con.prepareStatement("update ad set i1=?,i2=?,i3=?,i4=?,i5=?,i6=?,i7=?,i8=?,i9=?,i10=? ");
        p.setString(1,i1);
        p.setString(2,i2);
        p.setString(3,i3);
        p.setString(4,i4);
        p.setString(5,i5);
        p.setString(6,i6);
        p.setString(7,i7);
        p.setString(8,i8);
        p.setString(9,i9);
        p.setString(10,i10);
   p.executeUpdate();
       
            
         
         
    }

       
catch(Exception e){
//out.println(e);

}
    }

  
}
/**
 * int i1=Integer.parseInt(request.getParameter("i1"));
              int i2=Integer.parseInt(request.getParameter("i2"));
              int i3=Integer.parseInt(request.getParameter("i3"));
              int i4=Integer.parseInt(request.getParameter("i4"));
              int i5=Integer.parseInt(request.getParameter("i5"));
              int i6=Integer.parseInt(request.getParameter("i6"));
              int i7=Integer.parseInt(request.getParameter("i7"));
              int i8=Integer.parseInt(request.getParameter("i8"));
              int i9=Integer.parseInt(request.getParameter("i9"));
              int i10=Integer.parseInt(request.getParameter("i10"));
         //PreparedStatement p =con.prepareStatement("insert into admin(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10) values(?,?,?,?,?,?,?,?,?,?)");     
        PreparedStatement p =con.prepareStatement("update admin set i1=?,i2=?,i3=?,i4=?,i5=?,i6=?,i7=?,i8=?,i9=?,i10=? ");
        p.setInt(1,i1);
        p.setInt(2,i2);
        p.setInt(3,i3);
        p.setInt(4,i4);
        p.setInt(5,i5);
        p.setInt(6,i6);
        p.setInt(7,i7);
        p.setInt(8,i8);
        p.setInt(9,i9);
        p.setInt(10,i10);
   p.executeUpdate();**/
 