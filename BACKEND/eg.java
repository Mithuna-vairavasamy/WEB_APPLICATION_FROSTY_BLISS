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
public class eg extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // String name=request.getParameter("user");
        String phone=request.getParameter("phone");
        String count=request.getParameter("count");
        String amount=request.getParameter("amount");
        HttpSession sess=request.getSession();
        String name=(String)sess.getAttribute("username");
        
        String i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
      // int  i1=Integer.parseInt(request.getParameter("i1"));
       i1=request.getParameter("i1");
       i2=request.getParameter("i2");
        i3=request.getParameter("i3");
        i4=request.getParameter("i4");
        i5=request.getParameter("i5");
        i6=request.getParameter("i6");
        i7=request.getParameter("i7");
        i8=request.getParameter("i8");
        i9=request.getParameter("i9");
       i10=request.getParameter("i10");
       
        try{
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","123");
       // Statement s=con.createStatement();
        PreparedStatement ps =con.prepareStatement("SELECT * FROM ad");
      
          int it1,it2,it3,it4,it5,it6,it7,it8,it9,it10;
          
           ResultSet rs;
        rs=ps.executeQuery();
        
        out.println("<!DOCTYPE html>\n" +
"\n" +
"<html>\n" +
"<head>\n" +
"<title>buy</title>\n" +
"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"<style>\n" +
"body{\n" +
"background:linear-gradient(rgba(0,0,0,0.65),rgba(0,0,0,0.65)),url(ice3.png);\n" +
"background-size:cover;\n" +
"background-position:center;\n" +
"width:100%;\n" +
"height:60%;\n" +
"}\n" +
"ul{\n" +
"display:flex;\n" +
"position:absolute;\n" +
"right:20px;\n" +
"top:20px;\n" +
"\n" +
"}\n" +
"button a{\n" +
"    text-decoration: none;\n" +
"}\n" +
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
"}\n" +
"\n" +
".text{\n" +
"color:white;\n" +
"font-size:20px;\n" +
"}\n" +
".text input{\n" +
"text-align:center;\n" +
"color:black;\n" +
"background-color:beige;\n" +
"font-size:15px;\n" +
"padding:3px;\n" +
"font-weight:bold;\n" +
"}\n" +
".cart{\n" +
"margin-top:20px;\n" +
"border:3px ridge black;\n" +
"background-color:black;\n" +
"color:white;\n" +
"padding:20px;\n" +
"\n" +
"text-transform:capitalize;\n" +
"width:50%;\n" +
"height:10%;\n" +
"font-size:20px;\n" +
"font-weight:bold;\n" +
"}\n" +
".cart input{\n" +
"background:white; \n" +
"font-size:20px;\n" +
"margin-top:5px;\n" +
"border-radius:30px;\n" +
"padding:20px;\n" +
"color:black;\n" +
"padding:10px;\n" +
"border:4px solid black;\n" +
"}\n" +
"h2{\n" +
"\n" +
"text-align:center;\n" +
"color:plum;\n" +
"font-size:30px;\n" +
"font-weight:bold;\n" +
"margin:98px;\n" +
"}\n" +
"\n" +
"\n" +
".box{\n" +
"border:1px solid white;\n" +
"color:black;\n" +
"background-color:bisque;\n" +
"padding:5px;\n" +
"}\n" +
".image button{\n" +
"font-size:17px;\n" +
"color:black;\n" +
"padding:10px;\n" +
"background-color:bisque;\n" +
"width:150px;\n" +
"margin-top:10px;\n" +
"}\n" +
".image button:hover{\n" +
"font-size:16px;\n" +
"background-color:lightcoral;\n" +
"transform:scale(1.1);\n" +
"	}\n" +
".heading {\n" +
"	text-align:center;\n" +
"	padding:20px 30px;\n" +
"	color:mistyrose;\n" +
"        font-weight: bold;\n" +
"	text-transform:uppercase;\n" +
"	text-shadow:2px 2px black;\n" +
"        margin-top: 140px;\n" +
"	font-size:70px;\n" +
"}\n" +
".image-container{\n" +
"	display:flex;\n" +
"	justify-content:center;\n" +
"	background-color:transparent;\n" +
"	margin-right:30px;\n" +
"	padding:20px;\n" +
"	flex-wrap:wrap;\n" +
"	gap:20px;\n" +
"\n" +
"}\n" +
"\n" +
".image-container .image{\n" +
"	padding:10px;\n" +
"	background-color:black;\n" +
"	border:2px solid white;\n" +
"	margin: 1px 1px 1px 1px;\n" +
"	width:350px;\n" +
"	border-radius:120px;\n" +
"}\n" +
".image-container .image img{\n" +
"	height:270px;\n" +
"	width:100%;\n" +
"        margin-top:4px;\n" +
"	margin-bottom:10px;\n" +
"	border-radius:280px;\n" +
"	transition:0.9s ease;\n" +
"}\n" +
"\n" +
".image-container .image img:hover{\n" +
"	\n" +
"	transform: scale(0.5);\n" +
"}\n" +
".image-container .image p{\n" +
"	text-align:center;\n" +
"	border:1px solid beige;\n" +
"	background-color:beige;\n" +
"	color:black;\n" +
"	\n" +
"	font-size:17px;\n" +
"}\n" +
"\n" +
"button{\n" +
"font-size:25px;\n" +
"color:black;\n" +
"font-weight:bold;\n" +
"border-radius: 10px;\n" +
"padding:15px;\n" +
"	background-color:lightblue;\n" +
"	height:50px;\n" +
"	width:100px;\n" +
"}\n" +
".button{\n" +
"font-size:25px;\n" +
"color:black;\n" +
"font-weight:bold;\n" +
"border-radius: 10px;\n" +
"padding:15px;\n" +
"	background-color:lightblue;\n" +
"	height:30px;\n" +
"	width:70px;\n" +
"}\n" +
"\n" +
".cart .button{\n" +
"font-size:20px;\n" +
"color:black;\n" +
"font-weight:bold;\n" +
"border-radius: 10px;\n" +
"padding:5px;\n" +
"	background-color:lightblue;\n" +
"	height:40px;\n" +
"	width:80px;\n" +
"}\n" +
"\n" +
"select{\n" +
"font-size:15px;\n" +
"color:black;\n" +
"font-family:  cursive;\n" +
"font-weight:bold;\n" +
"padding:3px;\n" +
"background-color:beige;\n" +
"	\n" +
"}\n" +
"a{\n" +
"text-decoration:none;\n" +
"color:black;\n" +
"}\n" +
"\n" +
"@media screen and(max-width:768px){	\n" +
"}\n" +
"\n" +
"</style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    \n" +
"    <div>\n" +
"	<ul>	\n" +
"		<li ><a href='home.html'>HOME</a></li>\n" +
"		<li><a href='about.html'>ABOUT</a></li>\n" +
"		<li class='active'><a href='eg' >MAKE ORDER</a></li>\n" +
"		<li><a href='contact.html'>CONTACT</a></li>\n" +
"		<li><a href='index.html'>LOGOUT</a></li>\n" +
"		\n" +
"	</ul>\n" +
"</div>\n" +
               
"<h1 class=\"heading\">BUY NOW</h1>\n" +
"<div class=\"image-container\">\n" +
"<div class=\"image\">	\n" +

"<img src=\"str.png\" alt=\"\">	\n" );
        
if(rs.next()){
            it1=Integer.parseInt(rs.getString("i1"));
            it2=Integer.parseInt(rs.getString("i2"));
           it3=Integer.parseInt(rs.getString("i3"));
            it4=Integer.parseInt(rs.getString("i4"));
           it5=Integer.parseInt(rs.getString("i5"));
            it6=Integer.parseInt(rs.getString("i6"));
           it7=Integer.parseInt(rs.getString("i7"));
            it8=Integer.parseInt(rs.getString("i8"));
             it9=Integer.parseInt(rs.getString("i9"));
              it10=Integer.parseInt(rs.getString("i10"));
           
       
        

  out.println(" \n " );
out.println("<p id='item1'>STRAWBERRY</p>	\n");
out.println("<div class='text'><center>	\n" );
out.println("<p id='item'>SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>\n");
out.println("<p id='item\"'>Extra  Price For TOPPINGS(10)</p>	\n");
out.println("&nbsp;<select name=\"cars1\" id=\"cars1\">\n" );
out.println("<option value=\"\" ></option> \n" );
out.println("<option value=\"small\">SMALL-100rs</option>\n" );
out.println("  <option value=\"medium\">MEDIUM-120rs</option> \n" +
"<option value=\"large\">LARGE-150rs</option>\n" +
"   </select>&nbsp;\n" +
"   <select name=\"toppings1\" id=\"top1\">\n" +
"   <option value=\"\" ></option> \n" +
"<option value=\"chocolate\">chocolate</option>\n" +
"  <option value=\"caramelsauce\">Caramelsauce</option> \n" +
" <option value=\"choco chip\">choco chip</option>\n" +
"   </select></center></div><br> \n" +
"  <center><div class=\"text\">PRICE:&nbsp; <input type=\"text\"  id=\"price1\" size=\"1px\" readonly>&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty1\" min=1 max=7 ></div><BR>\n" +
" <button onclick=\"cart1()\">ADD TO CART</button><br>\n" +
"<button onclick=\"can1()\">CANCEL</button>\n" +
                "<h4 id=\"error1\"></h4> \n "+
"  </center>\n" +

"	</div>\n" +
"\n" +
"\n" +
"<div class=\"image\">\n" +
"    <img src=\"but.png\" alt=\"\">\n" +
"	<p id=\"item2\">BUTTER PECAN</p>	\n" +
"<div class=\"text\"><center>	\n" +
"<p id=\"item\">SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>	\n" +
"<p id=\"item\">Extra  Price For TOPPINGS(10)</p>	\n" +
"&nbsp;<select name=\"cars2\" id=\"cars2\">	\n" +
"<option value=\"\" ></option>\n" +
"<option value=\"small\">SMALL-100rs</option>\n" +
"  <option value=\"medium\">MEDIUM-120rs</option>\n" +
"  <option value=\"large\">LARGE-150rs</option>\n" +
"   </select>&nbsp;\n" +
"   <select name=\"toppings2\"  id=\"top2\"> \n" +
" <option value=\"\" ></option>\n" +
" <option value=\"nuts cruch\">Nuts cruch</option> \n" +
"<option value=\"caramelsauce\">Caramelsauce</option>\n" +
"<option value=\"chocolate \">chocolate </option>\n" +
"   </select></div><br> \n" +
"<center> <div class=\"text\">PRICE:&nbsp; <input type=\"text\" value=\"\" id=\"price2\" size=\"1px\" readonly>&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty2\" min=1 max=7 ></div><BR>\n" +
"<button onclick=\"cart2()\">ADD TO CART</button><br>\n" +
"<button onclick=\"can2()\">CANCEL</button>\n" +
"<h4 id=\"error2\"></h4> </center>\n "+
"</div>\n" +
"\n" +
"<div class=\"image\">	\n" +
"<img src=\"cho.png\" alt=\"\">\n" +
"<p id=\"item3\">CHOCOCALTE </p>	\n" +   
"<div class=\"text\"><center>	\n" +
"<p id=\"item\">SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>	\n" +
"<p id=\"item\">Extra  Price For TOPPINGS(10)</p>\n" +
"	&nbsp;<select name=\"qty3\" id=\"cars3\">	\n" +
"<option value=\"\" ></option>\n" +
"  <option value=\"small\">SMALL-100rs</option>  \n" +
"<option value=\"medium\">MEDIUM-120rs</option>\n" +
"  <option value=\"large\">LARGE-150rs</option>\n" +
"   </select>&nbsp;\n" +
"   <select name=\"toppings3\" id=\"top3\">\n" +
" <option value=\"\" ></option>  \n" +
"<option value=\"choco chip\">choco chip</option>\n" +
" <option value=\"sprinkles\">sprinkles</option>\n" +
"  <option value=\"waffer\">waffer</option>\n" +
"   </select></div>\n" +
"  <center><div class=\"text\"><br>PRICE:&nbsp; <input type=\"text\" value=\"\" id=\"price3\" size=\"1px\" readonly>&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty3\" min=1 max=7 ></div><BR>	\n" +
"<button onclick=\"cart3()\">ADD TO CART</button><br>\n" +
"<button onclick=\"can3()\">CANCEL</button>\n" +
"<h4 id=\"error3\"></h4> </center>\n "+
"	</div></div>\n" +
"	\n" +
"\n" +
"\n" +
"<div class=\"image-container\">\n" +
"<div class=\"image\">	\n" +
"<img src=\"coo.png\" alt=\"\">\n" +        
"	<p id=\"item4\">COOKIES N' CREAM</p>	\n" +
"<div class=\"text\"><center>	\n" +
"<p id=\"item\">SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>	\n" +
"<p id=\"item\">Extra  Price For TOPPINGS(10)</p>	\n" +
"&nbsp;<select name=\"qty4\" id=\"cars4\">	\n" +
"<option value=\"\" ></option>\n" +
"<option value=\"small\">SMALL-100rs</option> \n" +
"<option value=\"medium\">MEDIUM-120rs</option>\n" +
" <option value=\"large\">LARGE-150rs</option>\n" +
"   </select>&nbsp; \n" +
"<select name=\"toppings4\" id=\"top4\">  \n" +
" <option value=\"\" ></option>\n" +
" <option value=\"choco chip\">choco chip</option> \n" +
"<option value=\"caramelsauce\">Caramel sauce</option>\n" +
"  <option value=\"chocolate \">chocolate </option>\n" +
"   </select></div>  \n" +
" <center><div class=\"text\"><br>\n" +
" PRICE:&nbsp; <input type=\"text\" value=\"\" id=\"price4\" size=\"1px\" readonly>&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty4\" min=1 max=7 ></div><BR>\n" +
"<button onclick=\"cart4()\">ADD TO CART</button><br>\n" +
"<button onclick=\"can4()\">CANCEL</button>\n" +
                "<h4 id=\"error4\"></h4> </center>\n "+
"	</div>\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"image\">\n" +
"	<img src=\"roc.png\" alt=\"\">\n" +
"	<p id=\"item5\">ROCKY ROAD</p>	\n" +
"<div class=\"text\"><center>	\n" +
"<p id=\"item\">SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>	\n" +
"<p id=\"item\">Extra  Price For TOPPINGS(10)</p>	\n" +
"&nbsp;<select name=\"qty5\" id=\"cars5\">\n" +
"	<option value=\"\" ></option>\n" +
"  <option value=\"small\">SMALL-100rs</option>\n" +
" <option value=\"medium\">MEDIUM-120rs</option>\n" +
"  <option value=\"large\">LARGE-150rs</option>\n" +
"   </select>&nbsp;\n" +
"  <select name=\"toppings5\" id=\"top5\">\n" +
"   <option value=\"\" ></option>\n" +
" <option value=\"nuts cruch\">Nuts cruch</option>\n" +
"  <option value=\"caramelsauce\">Caramelsauce</option>\n" +
" <option value=\"White chocolate\">White chocolate </option>\n" +
"   </select></div>\n" +
"  <center><div class=\"text\"><br>PRICE:&nbsp; <input type=\"text\" value=\"\" id=\"price5\" size=\"1px\">&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty5\" min=1 max=7 ></div><BR>	\n" +
"<button onclick=\"cart5()\">ADD TO CART</button><br>\n" +
"<button onclick=\"can5()\">CANCEL</button>\n" +
 "<h4 id=\"error5\"></h4> </center>\n "+
"	</div>\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"image\">\n" +
"	<img src=\"pis.png\" alt=\"\">	\n" +
"<p id=\"item6\">PISTACHIO</p>\n" +
"	<div class=\"text\">\n" +
"<p id=\"item\">SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>\n" +
"<p id=\"item\"><b>Extra  Price For TOPPINGS(10)</b></p>	\n" +
"&nbsp;&nbsp;&nbsp;<select name=\"qty6\" id=\"cars6\">	\n" +
"<option value=\"\" ></option>\n" +
"\n" +
"<option value=\"small\">SMALL-100rs</option>\n" +
"  <option value=\"medium\">MEDIUM-120rs</option>\n" +
"<option value=\"large\">LARGE-150rs</option>\n" +
"   </select>&nbsp;   \n" +
"<select name=\"toppings6\" id=\"top6\">  \n" +
"<option value=\"\" ></option> \n" +
"<option value=\"nuts cruch\">Nuts chrush</option>\n" +
" <option value=\"caramelsauce\">Caramel sauce</option>\n" +
"<option value=\"sprinkles \">sprinkles</option>\n" +
"   </select></div>\n" +
"  <center><div class=\"text\"><br>\n" +
"   PRICE:&nbsp; <input type=\"text\" value=\"\" id=\"price6\" size=\"1px\" readonly>&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty6\" min=1 max=7 ></div><BR>	\n" +
"<button onclick=\"cart6()\">ADD TO CART</button><br>\n" +
"<button onclick=\"can6()\">CANCEL</button>\n" +
"<h4 id=\"error6\"></h4> </center>\n "+
   "</div>\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"image\">\n" +
"	<img src=\"van.jpg\" alt=\"\">	\n" +
"<p id=\"item7\">VANILLA</p>\n" +
"	<div class=\"text\">\n" +
"<p id=\"item\">SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>\n" +
"<p id=\"item\">Extra  Price For TOPPINGS(10)</p>	\n" +
"&nbsp;&nbsp;&nbsp;<select name=\"qty7\" id=\"cars7\">	\n" +
"<option value=\"\" ></option>\n" +
"<option value=\"small\">SMALL-100rs</option>\n" +
"  <option value=\"medium\">MEDIUM-120rs</option>  \n" +
"<option value=\"large\">LARGE-150rs</option>\n" +
"   </select>&nbsp;\n" +
"<select name=\"toppings7\" id=\"top7\">  \n" +
"<option value=\"\" ></option>\n" +
"<option value=\"chocolate\">chocolate</option>\n" +
" <option value=\"caramelsauce\">Caramel sauce</option>  \n" +
"<option value=\"sprinkles \">Sprinkles </option>\n" +
"   </select></div>\n" +
" <center><div class=\"text\"><br>PRICE:&nbsp; <input type=\"text\" value=\"\" id=\"price7\" size=\"1px\" readonly>&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty7\" min=1 max=7 ></div><BR>	\n" +
"<button onclick=\"cart7()\">ADD TO CART</button><br>\n" +
"<button onclick=\"can7()\">CANCEL</button>\n" +
 "<h4 id=\"error7\"></h4> </center>\n "+
"	</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"image\">\n" +
"<img src=\"cot.avif\" alt=\"\">	\n" +
"<p id=\"item8\">COTTON CANDY </p>\n" +
"<div class=\"text\">\n" +
"<p id=\"item\">SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>\n" +
"<p id=\"item\">Extra  Price For TOPPINGS(10)</p>	\n" +
"&nbsp;&nbsp;&nbsp;<select name=\"qty8\" id=\"cars8\">	\n" +
"<option value=\"\" ></option>\n" +
"<option value=\"small\">SMALL-100rs</option>\n" +
"  <option value=\"medium\">MEDIUM-120rs</option>  \n" +
"<option value=\"large\">LARGE-150rs</option>\n" +
"   </select>&nbsp;  \n" +
"<select name=\"toppings8\" id=\"top8\">   \n" +
"<option value=\"\" ></option>  \n" +
"<option value=\"chocolate\">chocolate</option> \n" +
" <option value=\"waffer\">waffer</option> \n" +
"<option value=\"sprinkles \">Sprinkles </option>\n" +
"   </select></div>\n" +
"  <center><div class=\"text\"><br>PRICE:&nbsp; <input type=\"text\" value=\"\" id=\"price8\" size=\"1px\" readonly>&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty8\" min=1 max=7 ></div><BR>	\n" +
"<button onclick=\"cart8()\">ADD TO CART</button><br>\n" +          
"<button onclick=\"can8()\">CANCEL</button>\n" +
"<h4 id=\"error8\"></h4> </center>\n "+ 
"	</div>\n" +
"\n" +
                
"<div class=\"image\">\n" +
"<img src=\"mat.avif\">	\n" +
"<p id=\"item9\">MATCHA</p>\n" +
"<div class=\"text\">\n" +
"<p id=\"item\">SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>\n" +
"<p id=\"item\">Extra  Price For TOPPINGS(10)</p>	\n" +
"&nbsp;&nbsp;&nbsp;<select name=\"qty9\" id=\"cars9\">	\n" +
"<option value=\"\" ></option>\n" +
"<option value=\"small\">SMALL-100rs</option>\n" +
"  <option value=\"medium\">MEDIUM-120rs</option>  \n" +
"<option value=\"large\">LARGE-150rs</option>\n" +
"   </select>&nbsp;   \n" +
"<select name=\"toppings9\" id=\"top9\">   \n" +
"<option value=\"\" ></option> \n" +
"<option value=\"nuts chrush\">nuts chrush</option> \n" +
" <option value=\"choco chip\">choco chip</option> \n" +
"<option value=\"sprinkles \">Sprinkles </option>\n" +
"   </select></div>\n" +
"  <center><div class=\"text\"><br>PRICE:&nbsp; <input type=\"text\" value=\"\" id=\"price9\" size=\"1px\" readonly>&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty9\" min=1 max=7 ></div><BR>	\n" +
"<button onclick=\"cart9()\">ADD TO CART</button><br>\n" +
"<button onclick=\"can9()\">CANCEL</button>\n" +    
"<h4 id=\"error9\"></h4> </center>\n "+
"	</div>\n" +
"    \n" +
"    \n" +
"        <img src=\"bliss1.png\" width=\"20%\" height=\"20%\" alt=\"\">\n" +
"    \n" +
"<div class=\"image\">\n" +
"	<img src=\"spe.avif\" alt=\"\">	\n" +
"<p id=\"item10\">FROSTY BLISS SIGNATURE </p>\n" +
"	<div class=\"text\">\n" +
"<p id=\"item\">SIZE &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TOPPINGS</p>\n" +
"<p id=\"item\">Extra  Price For TOPPINGS(30)</p>	\n" +
"&nbsp;&nbsp;&nbsp;<select name=\"qty10\" id=\"cars10\">	\n" +
"<option value=\"\" ></option>\n" +
"<option value=\"small\">SMALL-200rs</option>\n" +
"  <option value=\"medium\">MEDIUM-250rs</option>  \n" +
"<option value=\"large\">LARGE-300rs</option>\n" +
"   </select>&nbsp;   \n" +
"<select name=\"toppings10\" id=\"top10\">\n" +
"<option value=\"\" ></option> \n" +
"<option value=\"secret sycrup\">secret sycrup</option>\n" +
" <option value=\"caramelsauce\">Caramel sauce</option>\n" +
"<option value=\"sprinkles \">Sprinkles </option>\n" +
"   </select><br><br>\n" +
"</div>\n" +
"  <center>\n" +
"<div class=\"text\"><br>PRICE:&nbsp; <input type=\"text\" value=\"\" id=\"price10\" size=\"1px\" readonly>&nbsp;&nbsp;\n" +
" QTY:<input type=\"number\"  id=\"qty10\" min=1 max=7 ></div><BR>	\n" +
" <button onclick=\"cart10()\">ADD TO CART</button><br>\n" +
"<button onclick=\"can10()\">CANCEL</button>\n" +
"<h4 id=\"error10\"></h4> </center>\n "+

"</div>\n" +
"   \n" +
"        <img src=\"bliss1.png\" width=\"20%\" height=\"20%\" alt=''>\n" +
"    \n" +
"</div>\n" +
"\n" +
"\n" +
"<center><div class=\"cart\">	\n" +
"<div class=\"box\">ADD TO CART</div>	\n" +
"<p id=\"amount1\"></p>	\n" +
"<p id=\"amount2\"></p>	\n" +
"<p id=\"amount3\"></p>\n" +
"<p id=\"amount4\"></p><p id=\"amount5\"></p><p id=\"amount6\"></p>\n" +
"<p id=\"amount7\"></p><p id=\"amount8\"></p><p id=\"amount9\"></p>\n" +
"<p id=\"amount10\"></p><br><br>	\n" +
"<button onclick=\"buy()\">BUY</button>&nbsp;&nbsp;\n" +
"<br></div>\n" +
"    <div class=\"cart\">\n" +
"        <form action='eg' method='get' onsubmit='return field()' >\n" +
"            <div class=\"box\">PLACE ORDER</div>	<br>\n" +
// "   NAME:- <input type=\"text\" id=\"user\" name=\"user\" onchange=\"validate()\" pattern=\"[A-Za-z]{5,10}\" ><br>\n" +
"   PHONE- <input type=\"text\" id=\"phone\" name=\"phone\" pattern=\"[0-9]{10}\" onchange=\"validatephone()\" ><br>\n" +
"   <br>No of item:<input type=\"text\" name=\"count\" id=\"count\" readonly><br>\n" +
"   <br>TOTAL:-<input type=\"text\" class=\"button\" name=\"amount\" id=\"amount\" readonly><br><br>\n" +
"   <input type=\"submit\"  value=\"pay\" class=\"button\">\n" +
"   <br><p id='show'></p>" +
"<input type='hidden'   name=\"i1\" id='p1' value="+ it1 +" size='1px' readonly>\n" +
" <input type='hidden'  name='i2' id='p2' value="+ it2 +" size='1px' readonly>\n" +
" <input type='hidden'  name='i3' id='p3' value="+ it3 +" size='1px' readonly>\n"  +
" <input type='hidden'  name='i4' id='p4' value="+ it4 +" size='1px' readonly>\n"  +
" <input type='hidden'  name='i5' id='p5' value="+ it5 +" size='1px' readonly>\n"  +
" <input type='hidden'  name='i6' id='p6' value="+ it6 +" size='1px' readonly>\n"  +
" <input type='hidden'  name='i7' id='p7' value="+ it7 +" size='1px' readonly>\n"  +
" <input type='hidden'  name='i8' id='p8' value="+ it8 +" size='1px' readonly>\n"  +
" <input type='hidden'  name='i9' id='p9' value="+ it9 +" size='1px' readonly>\n"  +
" <input type='hidden'  name='i10' id='p10' value="+ it10 +" size='1px' readonly>\n"+
"</form></div>\n" +
"</center>\n" +
"<script>\n" +
"function field(){\n" +
//"    var name=document.getElementById('user').value;\n" +
"    var phone=document.getElementById('phone').value;\n" +
"    var count=document.getElementById('count').value;\n" +
"    var amount=document.getElementById('amount').value;\n" +
"    if(phone===''|| count===''||amount==='')\n" +
        "{\n" +
"         document.getElementById('show').innerHTML='*required' \n" +
"                show.style='color:white';\n" +
"              return false;\n" +
"        }\n" +

"    else{\n" +
            "if(count<=0 ||amount <=0){ \n" +
"            document.getElementById('show').innerHTML='*kindly purchase' \n" +
"                show.style='color:white';\n" +
"              return false;\n" +
"                   }\n" +
         "else { \n"+
        "        document.getElementById('show').innerHTML=''; return true;  \n" +
        "       }      \n" +
        "    \n" +
        "return true; } \n" +
         "        document.getElementById('show').innerHTML=''; return true;  \n" +  
" return true;  }\n" +
          
          
"function validate(){\n" +
"            var name=document.getElementById('user');\n" +
"            if(!name.validity.valid)\n" +
"            {\n" +
"                document.getElementById('show').innerHTML=\"* username must be alphabet with 5-10 character\";\n" +
"                show.style=\"color:white\";\n" +
"              return false;\n" +
"            }\n" +
"            else{\n" +
"                document.getElementById('show').innerHTML=\"\";\n" +
"                return true;\n" +
"            }\n" +
"            return true;\n" +
"        \n" +
"        }\n" +
"  \n" +
"  function validatephone(){\n" +
"            var phone=document.getElementById('phone');\n" +
"            if(!phone.validity.valid)\n" +
"            {\n" +
"                document.getElementById('show').innerHTML=\"* phone number must be 10 digit\";\n" +
"                show.style=\"color:white\";\n" +
"              return false;\n" +
"            }\n" +
"            else{\n" +
"                document.getElementById('show').innerHTML=\"\";\n" +
"                return true;\n" +
"            }\n" +
"            return true;\n" +
"        \n" +
"        }\n" +
"\n" +
"\n" +
"\n" +
"function buy()\n" +
"{	\n" +
"var p1=document.getElementById('price1').value;	\n" +
"var p2=document.getElementById('price2').value;	\n" +
"var p3=document.getElementById('price3').value;	\n" +
"var p4=document.getElementById('price4').value;	\n" +
"var p5=document.getElementById('price5').value;	\n" +
"var p6=document.getElementById('price6').value;\n" +
"var p7=document.getElementById('price7').value;	\n" +
"var p8=document.getElementById('price8').value;	\n" +
"var p9=document.getElementById('price9').value;\n" +
"var p10=document.getElementById('price10').value;\n" +
"\n" +

"var a1=document.getElementById('qty1').value;	\n" +
"var a2=document.getElementById('qty2').value;	\n" +
"var a3=document.getElementById('qty3').value;	\n" +
"var a4=document.getElementById('qty4').value;	\n" +
"var a5=document.getElementById('qty5').value;	\n" +
"var a6=document.getElementById('qty6').value;	\n" +
"var a7=document.getElementById('qty7').value;	\n" +
"var a8=document.getElementById('qty8').value;	\n" +
"var a9=document.getElementById('qty9').value;	\n" +
"var a10=document.getElementById('qty10').value;	\n" +
          
          
"var total=0;\n" +
"var count=0;\n" +
"	\n" +
"if(a1!==\"\")\n" +
"{	\n" +
"    count++;\n" +

"total+=parseInt(p1);	\n" +
"}\n" +
"	\n" +
"if(a2!==\"\")\n" +
"{\n" +
"    count++;\n" +
"total+=parseInt(p2);	\n" +
"}\n" +
"	\n" +
"if(a3!==\"\")\n" +
"{	\n" +
"    count++;\n" +
"total+= parseInt(p3);	\n" +
"}\n" +
"if(a4!==\"\")\n" +
"	{\n" +
"	count++;\n" +
"total+= parseInt(p4);\n" +
"	\n" +
"}\n" +
"	\n" +
"if(a5!==\"\")\n" +
"{	\n" +
"    count++;\n" +
"total+= parseInt(p5);	\n" +
"}\n" +
"	\n" +
"if(a6!==\"\")\n" +
"{	 \n" +
"    count++;\n" +
"total+= parseInt(p6);	\n" +
"}\n" +
"	\n" +
"if(a7!==\"\")\n" +
"{	 \n" +
"    count++;\n" +
"total+= parseInt(p7);	\n" +
"}\n" +
"\n" +
"if(a8!==\"\")\n" +
"{\n" +
"        count++;\n" +
"\n" +
"total+= parseInt(p8);	\n" +
"}\n" +
"\n" +
"if(a9!==\"\")\n" +
"{	 count++; \n" +
"total+= parseInt(p9);	\n" +
"}\n" +
"if(a10!==\"\")\n" +
"{	 count++; \n" +
"total+= parseInt(p10);	\n" +
"}\n" +
"\n" +
"document.getElementById('amount').value=total;\n" +
"document.getElementById('count').value=count;\n" +
"}\n" +
"function can1(){\n" +
"    \n" +
"var a1=parseInt(document.getElementById('qty1').value);  \n"+
"var p=parseInt(document.getElementById('p1').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p1').value=t;\n" +
"    document.getElementById('amount1').innerHTML=\"\";\n" +
"    document.getElementById('price1').value=\"\";\n" +
"    document.getElementById('qty1').value=\"\";\n" +
"    document.getElementById('cars1').value=\"\";\n" +
"    document.getElementById('top1').value=\"\";\n" +
"    document.getElementById('price1').value=\"\";\n" +
"   \n" +
"}\n" +
"function can2(){\n" +
"    \n" +
"var a1=parseInt(document.getElementById('qty2').value);  \n"+
"var p=parseInt(document.getElementById('p2').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p2').value=t;\n" +
"    document.getElementById('amount2').innerHTML=\"\";\n" +
"    document.getElementById('price2').value=\"\";\n" +
"    document.getElementById('qty2').value=\"\";\n" +
"    document.getElementById('cars2').value=\"\";\n" +
"    document.getElementById('top2').value=\"\";\n" +
"    document.getElementById('price2').value=\"\";\n" +
"    \n" +
"}\n" +
"function can3(){\n" +
"    \n" +
"var a1=parseInt(document.getElementById('qty3').value);  \n"+
"var p=parseInt(document.getElementById('p3').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p3').value=t;\n" +
"    document.getElementById('amount3').innerHTML=\"\";\n" +
"    document.getElementById('price3').value=\"\";\n" +
"    document.getElementById('qty3').value=\"\";\n" +
"    document.getElementById('cars3').value=\"\";\n" +
"    document.getElementById('top3').value=\"\";\n" +
"    document.getElementById('price3').value=\"\";\n" +
"    }\n" +
"    \n" +
"\n" +
"\n" +
"function can4(){\n" +
"    \n" +
"var a1=parseInt(document.getElementById('qty4').value);  \n"+
"var p=parseInt(document.getElementById('p4').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p4').value=t;\n" +
"    document.getElementById('amount4').innerHTML=\"\";\n" +
"    document.getElementById('price4').value=\"\";\n" +
"    document.getElementById('qty4').value=\"\";\n" +
"    document.getElementById('cars4').value=\"\";\n" +
"    document.getElementById('top4').value=\"\";\n" +
"    document.getElementById('price4').value=\"\";\n" +
"    \n" +
"    \n" +
"}\n" +
"function can5(){\n" +
"     \n" +
"var a1=parseInt(document.getElementById('qty5').value);  \n"+
"var p=parseInt(document.getElementById('p5').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p5').value=t;\n" +
"    document.getElementById('amount5').innerHTML=\"\";\n" +
"    document.getElementById('price5').value=\"\";\n" +
"    document.getElementById('qty5').value=\"\";\n" +
"    document.getElementById('cars5').value=\"\";\n" +
"    document.getElementById('top5').value=\"\";\n" +
"    document.getElementById('price5').value=\"\";\n" +
"   \n" +
"}\n" +
"function can6(){\n" +
"    \n" +
"var a1=parseInt(document.getElementById('qty6').value);  \n"+
"var p=parseInt(document.getElementById('p6').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p6').value=t;\n" +
"    document.getElementById('amount6').innerHTML=\"\";\n" +
"    document.getElementById('price6').value=\"\";\n" +
"    document.getElementById('qty6').value=\"\";\n" +
"    document.getElementById('cars6').value=\"\";\n" +
"    document.getElementById('top6').value=\"\";\n" +
"    document.getElementById('price6').value=\"\";\n" +
"    }\n" +
"    \n" +
"function can7(){\n" +
"        \n" +
 "var a1=parseInt(document.getElementById('qty7').value);  \n"+
"var p=parseInt(document.getElementById('p7').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p7').value=t;\n" +
"    document.getElementById('amount7').innerHTML=\"\";\n" +
"    document.getElementById('price7').value=\"\";\n" +
"    document.getElementById('qty7').value=\"\";\n" +
"    document.getElementById('cars7').value=\"\";\n" +
"    document.getElementById('top7').value=\"\";\n" +
"    document.getElementById('price7').value=\"\";\n" +
"    }\n" +
"    \n" +
"function can8(){\n" +
"    \n" +
"var a1=parseInt(document.getElementById('qty8').value);  \n"+
"var p=parseInt(document.getElementById('p8').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p8').value=t;\n" +
"    document.getElementById('amount8').innerHTML=\"\";\n" +
"    document.getElementById('price8').value=\"\";\n" +
"    document.getElementById('qty8').value=\"\";\n" +
"    document.getElementById('cars8').value=\"\";\n" +
"    document.getElementById('top8').value=\"\";\n" +
"    document.getElementById('price8').value=\"\";\n" +
"    }\n" +
"    \n" +
"function can9(){\n" +
"   \n" +
"var a1=parseInt(document.getElementById('qty9').value);  \n"+
"var p=parseInt(document.getElementById('p9').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p9').value=t;\n" +
"    document.getElementById('amount9').innerHTML=\"\";\n" +
"    document.getElementById('price9').value=\"\";\n" +
"    document.getElementById('qty9').value=\"\";\n" +
"    document.getElementById('cars9').value=\"\";\n" +
"    document.getElementById('top9').value=\"\";\n" +
"    document.getElementById('price9').value=\"\";\n" +
"    }\n" +
"    \n" +
"function can10(){\n" +
"    \n" +
"var a1=parseInt(document.getElementById('qty10').value);  \n"+
"var p=parseInt(document.getElementById('p10').value);  \n"+
"var t=p+a1;\n"+
"    document.getElementById('p10').value=t;\n" +
"    document.getElementById('amount10').innerHTML=\"\";\n" +
"    document.getElementById('price10').value=\"\";\n" +
"    document.getElementById('qty10').value=\"\";\n" +
"    document.getElementById('cars10').value=\"\";\n" +
"    document.getElementById('top10').value=\"\";\n" +
"    document.getElementById('price10').value=\"\";\n" +
"}\n" +
"function cart1()\n" +
"{\n" +
"var pro=document.getElementById('item1');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty1').value;\n" +
"var size=document.getElementById('cars1').value;\n" +
"var top=document.getElementById('top1').value;\n" +
"var p=document.getElementById('p1').value;	\n" +
"var t;\n" +
"var to;\n" +
  "        if(p>0){ if(a1<=p){\n" +
"if(a1>0 && a1<8){\n" +
"if(size!==\"\"){\n" +
"if(size===\"small\")\n" +
            "{		\n" +
            "if(top!==\"\")\n" +
            " {\n" +
            " t=100+10;  to=t*a1; document.getElementById('price1').value=to;\n" +
            "}		\n" +
            "else{t=100; to=t*a1;  document.getElementById('price1').value=to;\n" +
            " }\n" +
            "}\n" +
            "\n" +
"else if(size===\"medium\"){\n" +
            "     \n" +
            "               if(top!==\"\")\n" +
            "{\n" +
            "t=120+10; to=t*a1;\n" +
  " document.getElementById('price1').value=to;\n" +
"}\n" +
"\n" +
"  else{\n" +
            "t=120;  to=t*a1; document.getElementById('price1').value=to;\n" +
          
            "   }\n" +
"\n" +
"} \n" +
"\n" +
"else{ \n" +
"     if(top!==\"\")\n" +
"{t=150+10;  to=t*a1; " +
           "   p1=p1-a1; \n" +      
                 "document.getElementById('price1').value=to;\n" +
"}\n" +
"      else{ t=150;  to=t*a1;" +
                
                " document.getElementById('price1').value=to; }     \n" +
"  }\n" +
"\n" +
"\n" +
"    if(to!==\"\")\n" +
"   {\n" +
"  document.getElementById('amount1').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
"document.getElementById('p1').value=p-a1; \n" +
"    }\n" +
"   else{\n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error1').innerHTML=\"\";\n" +
  "   error1.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error1').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error1.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error1').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error1.style=\"color:white\";\n" +
"}\n" +
"}" +
"else{\n" +
"var a1=parseInt(document.getElementById('qty1').value);  \n"+
"var p=parseInt(document.getElementById('p1').value);  \n"+
"var a=p+a1;\n" +
"         document.getElementById('error1').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error1.style=\"color:white\";\n" +
"    document.getElementById('amount1').innerHTML=\"\";\n" +
"    document.getElementById('price1').value=\"\";\n" +
"    document.getElementById('qty1').value=\"\";\n" +
"    document.getElementById('cars1').value=\"\";\n" +
"    document.getElementById('top1').value=\"\";\n" +
"    document.getElementById('price1').value=\"\";\n" +
//"    document.getElementById('p1').value=a;\n" +
"}\n" +
"}\n"+
 "else{\n" +
"         document.getElementById('error1').innerHTML=\"*OUT OF STOCK\";\n" +
"                error1.style=\"color:white\";\n" +
"    document.getElementById('amount1').innerHTML=\"\";\n" +
"    document.getElementById('price1').value=\"\";\n" +
"    document.getElementById('qty1').value=\"\";\n" +
"    document.getElementById('cars1').value=\"\";\n" +
"    document.getElementById('top1').value=\"\";\n" +
"    document.getElementById('price1').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +

                
"function cart2(){\n" +
"var pro=document.getElementById('item2');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty2').value;\n" +
"var size=document.getElementById('cars2').value;\n" +
"var top=document.getElementById('top2').value;\n" +
"var p=document.getElementById('p2').value;	\n" +
"var t;var to;\n" +
"        if(p>0){ if(a1<=p){\n" +
"if(a1>0 && a1<8){\n" +
"if(size!==\"\")\n" +
"{\n" +
"if(size===\"small\")\n" +
"{\n" +
"if(top!==\"\")\n" +
"{\n" +
" t=100+10;  to=t*a1;document.getElementById('price2').value=to;\n" +
" }\n" +
"else{ \n" +
"t=100;  to=t*a1;document.getElementById('price2').value=to;\n" +
"  }\n" +
"}\n" +
"\n" +
"else if(size===\"medium\"){\n" +
"if(top!==\"\")\n" +
"	{\n" +
" t=120+10;  to=t*a1;document.getElementById('price2').value=to;}\n" +
"else{\n" +
"t=120;  to=t*a1;document.getElementById('price2').value=to;\n" +
" }\n" +
"}\n" +
"else{\n" +
"if(top!==\"\")\n" +
"{\n" +
" t=150+10;  to=t*a1;document.getElementById('price2').value=to;\n" +
"}\n" +
"else{\n" +
"t=150;  to=t*a1;document.getElementById('price2').value=to;\n" +
" }\n" +
"}\n" +
"\n" +
"if(to!==\"\"){\n" +
"document.getElementById('amount2').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
"document.getElementById('p2').value=p-a1;	\n" +
"\n" +
"}\n" +
"\n" +
"else{  \n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error2').innerHTML=\"\";\n" +
  "   error2.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error2').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error2.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error2').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error2.style=\"color:white\";\n" +
"}\n" +
"}\n"+
"else{\n" +
"var a1=document.getElementById('qty2').value;\n" +
"var p=document.getElementById('p2').value;	\n" +
"         document.getElementById('error2').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error2.style=\"color:white\";\n" +
"    document.getElementById('amount2').innerHTML=\"\";\n" +
"    document.getElementById('price2').value=\"\";\n" +
"    document.getElementById('qty2').value=\"\";\n" +
"    document.getElementById('cars2').value=\"\";\n" +
"    document.getElementById('top2').value=\"\";\n" +
"    document.getElementById('price2').value=\"\";\n" +
"    document.getElementById('p').value='p+a1';\n" +
"}\n" +
"}\n" +
 "else{\n" +
"         document.getElementById('error2').innerHTML=\"*OUT OF STOCK\";\n" +
"                error2.style=\"color:white\";\n" +
"    document.getElementById('amount2').innerHTML=\"\";\n" +
"    document.getElementById('price2').value=\"\";\n" +
"    document.getElementById('qty2').value=\"\";\n" +
"    document.getElementById('cars2').value=\"\";\n" +
"    document.getElementById('top2').value=\"\";\n" +
"    document.getElementById('price2').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +

                
"function cart3(){\n" +
"var pro=document.getElementById('item3');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty3').value;\n" +
"var size=document.getElementById('cars3').value;\n" +
"var top=document.getElementById('top3').value;\n" +
"var p=document.getElementById('p3').value;	\n" +
"var t;var to;\n" +
"        if(p>0){ if(a1<=p){\n" +
"if(a1>0 && a1<8){\n" +
"if(size!==\"\")\n" +
"{\n" +
"\n" +
"if(size===\"small\")\n" +
"{\n" +
"if(top!==\"\"){\n" +
" t=100+10;  to=t*a1;document.getElementById('price3').value=to;}\n" +
"\n" +
"else{t=100; to=t*a1; document.getElementById('price3').value=to; }\n" +
"\n" +
"}\n" +
"\n" +
"else if(size===\"medium\"){\n" +
" if(top!==\"\")\n" +
"{\n" +
" t=120+10; to=t*a1; document.getElementById('price3').value=to;\n" +
"}\n" +
"else{\n" +
"t=120;  to=t*a1;document.getElementById('price3').value=to;\n" +
"}\n" +
"}\n" +
"\n" +
"else{\n" +
" if(top!==\"\")\n" +
"{\n" +
" t=150+10;  to=t*a1;document.getElementById('price3').value=to;\n" +
"}\n" +
"\n" +
"else{\n" +
"t=150; to=t*a1; document.getElementById('price3').value=to;\n" +
"  }\n" +
"\n" +
"}\n" +
"\n" +
"if(to!==\"\"){\n" +
"document.getElementById('amount3').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
"document.getElementById('p3').value=p-a1; \n" +
"}\n" +
"\n" +
"else{\n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error3').innerHTML=\"\";\n" +
  "   error3.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error3').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error3.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error3').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error3.style=\"color:white\";\n" +
"}\n" +
"}\n"+
"else{\n" +
"var a1=document.getElementById('qty3').value;\n" +
"var p=document.getElementById('p3').value;	\n" +
"         document.getElementById('error3').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error3.style=\"color:white\";\n" +
"    document.getElementById('amount3').innerHTML=\"\";\n" +
"    document.getElementById('price3').value=\"\";\n" +
"    document.getElementById('qty3').value=\"\";\n" +
"    document.getElementById('cars3').value=\"\";\n" +
"    document.getElementById('top3').value=\"\";\n" +
"    document.getElementById('price3').value=\"\";\n" +
"    document.getElementById('p').value='p+a1';\n" +
"}\n" +
"}\n" +
 "else{\n" +
"         document.getElementById('error3').innerHTML=\"*OUT OF STOCK\";\n" +
"                error3.style=\"color:white\";\n" +
"    document.getElementById('amount3').innerHTML=\"\";\n" +
"    document.getElementById('price3').value=\"\";\n" +
"    document.getElementById('qty3').value=\"\";\n" +
"    document.getElementById('cars3').value=\"\";\n" +
"    document.getElementById('top3').value=\"\";\n" +
"    document.getElementById('price3').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +


                
"function cart4(){\n" +
"var pro=document.getElementById('item4');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty4').value;\n" +
"var size=document.getElementById('cars4').value;\n" +
"var top=document.getElementById('top4').value;\n" +
"var p=document.getElementById('p4').value;	\n" +
"var t;var to;\n" +
"        if(p>0){ if(a1<=p){\n" +
"if(a1>0 && a1<8){\n" +
"if(size!==\"\"){\n" +
"\n" +
"if(size===\"small\")\n" +
"{\n" +
"\n" +
"if(top!==\"\")\n" +
"	{\n" +
" t=100+10;  to=t*a1; document.getElementById('price4').value=to;\n" +
"}\n" +
"\n" +
"else{\n" +
"t=100;  to=t*a1; document.getElementById('price4').value=to;\n" +
"}}\n" +
"\n" +
"else if(size===\"medium\"){\n" +
" if(top!==\"\"){\n" +
" t=120+10;  to=t*a1; document.getElementById('price4').value=to;\n" +
"}\n" +
"\n" +
"else{\n" +
"t=120;  to=t*a1; document.getElementById('price4').value=to;\n" +
"   }\n" +
"}\n" +
"else{\n" +
" if(top!==\"\")\n" +
"{ t=150+10;  to=t*a1; document.getElementById('price4').value=to;\n" +
"}\n" +
"\n" +
"else{\n" +
"t=150;  to=t*a1; document.getElementById('price4').value=to;\n" +
" }\n" +
"}\n" +
"\n" +
"if(to!==\"\"){\n" +
"document.getElementById('amount4').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
"document.getElementById('p4').value=p-a1; \n" +
"}\n" +
"else{\n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error4').innerHTML=\"\";\n" +
  "   error4.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error4').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error4.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error4').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error4.style=\"color:white\";\n" +
"}\n" +
"}\n"+
"else{\n" +
"var a1=document.getElementById('qty4').value;\n" +
"var p=document.getElementById('p4').value;	\n" +
"         document.getElementById('error4').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error4.style=\"color:white\";\n" +
"    document.getElementById('amount4').innerHTML=\"\";\n" +
"    document.getElementById('price4').value=\"\";\n" +
"    document.getElementById('qty4').value=\"\";\n" +
"    document.getElementById('cars4').value=\"\";\n" +
"    document.getElementById('top4').value=\"\";\n" +
"    document.getElementById('price4').value=\"\";\n" +
"    document.getElementById('p').value='p+a1';\n" +
"}\n" +
"}\n" +
 "else{\n" +
"         document.getElementById('error4').innerHTML=\"*OUT OF STOCK\";\n" +
"                error4.style=\"color:white\";\n" +
"    document.getElementById('amount4').innerHTML=\"\";\n" +
"    document.getElementById('price4').value=\"\";\n" +
"    document.getElementById('qty4').value=\"\";\n" +
"    document.getElementById('cars4').value=\"\";\n" +
"    document.getElementById('top4').value=\"\";\n" +
"    document.getElementById('price4').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +

                
                
"function cart5(){\n" +
"var pro=document.getElementById('item5');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty5').value;\n" +
"var size=document.getElementById('cars5').value;\n" +
"var top=document.getElementById('top5').value;\n" +
"var p=document.getElementById('p5').value;\n" +
"var t;var to;\n" +
"  if(p>0){if(a1<p){\n" +
"if(a1>0 && a1<8){\n" +
"if(size!==\"\"){\n" +
"if(size===\"small\")\n" +
"{\n" +
"if(top!==\"\"){\n" +
" t=100+10;  to=t*a1;document.getElementById('price5').value=to;\n" +
"}\n" +
"\n" +
"else{\n" +
"t=100;  to=t*a1;document.getElementById('price5').value=to;\n" +
"   }\n" +
"}\n" +
"else if(size===\"medium\"){\n" +
" if(top!==\"\")\n" +
"{\n" +
" t=120+10;  to=t*a1;document.getElementById('price5').value=to;}\n" +
"else{\n" +
"t=120;  to=t*a1;document.getElementById('price5').value=to;}\n" +
"}\n" +
"else{\n" +
" if(top!==\"\")\n" +
"{\n" +
" t=150+10;  to=t*a1;document.getElementById('price5').value=to;}\n" +
"else{\n" +
"t=150;  to=t*a1;document.getElementById('price5').value=to;\n" +
"  }\n" +
"}\n" +
"\n" +
"if(t!==\"\"){\n" +
"document.getElementById('amount5').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
          "document.getElementById('p5').value=p-a1; \n" +
"}\n" +
"else{\n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error5').innerHTML=\"\";\n" +
  "   error5.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error5').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error5.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error5').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error5.style=\"color:white\";\n" +
"}\n" +
"}\n"+
"else{\n" +
"var a1=document.getElementById('qty5').value;\n" +
"var p=document.getElementById('p5').value;	\n" +
"         document.getElementById('error5').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error5.style=\"color:white\";\n" +
"    document.getElementById('amount5').innerHTML=\"\";\n" +
"    document.getElementById('price5').value=\"\";\n" +
"    document.getElementById('qty5').value=\"\";\n" +
"    document.getElementById('cars5').value=\"\";\n" +
"    document.getElementById('top5').value=\"\";\n" +
"    document.getElementById('price5').value=\"\";\n" +
"    document.getElementById('p').value='p+a1';\n" +
"}\n" +
"}\n" +
 "else{\n" +
"         document.getElementById('error5').innerHTML=\"*OUT OF STOCK\";\n" +
"                error5.style=\"color:white\";\n" +
"    document.getElementById('amount5').innerHTML=\"\";\n" +
"    document.getElementById('price5').value=\"\";\n" +
"    document.getElementById('qty5').value=\"\";\n" +
"    document.getElementById('cars5').value=\"\";\n" +
"    document.getElementById('top5').value=\"\";\n" +
"    document.getElementById('price5').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +

                
                
"function cart6(){\n" +
"\n" +
"var pro=document.getElementById('item6');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty6').value;\n" +
"var size=document.getElementById('cars6').value;\n" +
"var top=document.getElementById('top6').value;\n" +
"var p=document.getElementById('p6').value;\n" +
"var t;var to;\n" +
"  if(p>0){if(a1<=p){\n" +
"if(a1>0 &&a1<8){\n" +
"if(size!==\"\"){\n" +
"\n" +
"if(size===\"small\")\n" +
"{\n" +
"\n" +
"            if(top!==\"\") {\n" +
" t=100+10;  to=t*a1; document.getElementById('price6').value=to;}\n" +
"\n" +
"       else{\n" +
"t=100;  to=t*a1; document.getElementById('price6').value=to;\n" +
"  }\n" +
"\n" +
"}\n" +
"\n" +
"else if(size===\"medium\"){\n" +
" if(top!==\"\")\n" +
"\n" +
"{\n" +
"\n" +
" t=120+10; to=t*a1; document.getElementById('price6').value=to;\n" +
"\n" +
"}\n" +
"else{\n" +
"t=120;  to=t*a1; document.getElementById('price6').value=to;\n" +
"\n" +
" }\n" +
"\n" +
"}\n" +
"\n" +
"else{\n" +
" if(top!==\"\")\n" +
"\n" +
"{\n" +
"\n" +
" t=150+10;to=t*a1; document.getElementById('price6').value=to;\n" +
"\n" +
"}\n" +
"\n" +
"else{\n" +
"\n" +
"t=150; to=t*a1;document.getElementById('price6').value=to;\n" +
"   }\n" +
"}\n" +
"\n" +
"if(t!==\"\"){\n" +
"	document.getElementById('amount6').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
"document.getElementById('p6').value=p-a1; \n" +
"}\n" +
"\n" +
"else{\n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error6').innerHTML=\"\";\n" +
  "   error6.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error6').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error6.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error6').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error6.style=\"color:white\";\n" +
"}\n" +
"}\n"+
"else{\n" +
"var a1=document.getElementById('qty6').value;\n" +
"var p=document.getElementById('p6').value;	\n" +
"         document.getElementById('error6').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error6.style=\"color:white\";\n" +
"    document.getElementById('amount6').innerHTML=\"\";\n" +
"    document.getElementById('price6').value=\"\";\n" +
"    document.getElementById('qty6').value=\"\";\n" +
"    document.getElementById('cars6').value=\"\";\n" +
"    document.getElementById('top6').value=\"\";\n" +
"    document.getElementById('price6').value=\"\";\n" +
"    document.getElementById('p').value='p+a1';\n" +
"}\n" +
"}\n" +
 "else{\n" +
"         document.getElementById('error6').innerHTML=\"*OUT OF STOCK\";\n" +
"                error6.style=\"color:white\";\n" +
"    document.getElementById('amount6').innerHTML=\"\";\n" +
"    document.getElementById('price6').value=\"\";\n" +
"    document.getElementById('qty6').value=\"\";\n" +
"    document.getElementById('cars6').value=\"\";\n" +
"    document.getElementById('top6').value=\"\";\n" +
"    document.getElementById('price6').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +

                
"function cart7(){\n" +
"\n" +
"var pro=document.getElementById('item7');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty7').value;\n" +
"var size=document.getElementById('cars7').value;\n" +
"var top=document.getElementById('top7').value;\n" +
"var p=document.getElementById('p7').value;\n" +
"var t;var to;\n" +
"  if(p>0){if(a1<=p){\n" +
"if(a1>0 && a1<8){\n" +
"if(size!==\"\"){\n" +
"\n" +
"if(size===\"small\")\n" +
"{\n" +
"            if(top!==\"\") {\n" +
" t=100+10;  to=t*a1;document.getElementById('price7').value=to;}\n" +
"\n" +
"       else{\n" +
"t=100;  to=t*a1;document.getElementById('price7').value=to;\n" +
"  }\n" +
"}\n" +
"\n" +
"else if(size===\"medium\"){\n" +
" if(top!==\"\")\n" +
"\n" +
"{\n" +
" t=120+10;  to=t*a1;document.getElementById('price7').value=to;\n" +
"}\n" +
"else{\n" +
"t=120;  to=t*a1;document.getElementById('price7').value=to;\n" +
" }\n" +
"}\n" +
"\n" +
"else{\n" +
" if(top!==\"\")\n" +
"\n" +
"{\n" +
" t=150+10;  to=t*a1;document.getElementById('price7').value=to;\n" +
"}\n" +
"\n" +
"else{\n" +
"t=150;  to=t*a1;document.getElementById('price7').value=to;\n" +
"   }\n" +
"}\n" +
"\n" +
"if(to!==\"\"){\n" +
"	document.getElementById('amount7').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
"document.getElementById('p7').value=p-a1; \n" +
          "}\n" +
"\n" +
"else{\n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error7').innerHTML=\"\";\n" +
  "   error7.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error7').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error7.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error7').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error7.style=\"color:white\";\n" +
"}\n" +
"}\n"+
"else{\n" +
"var a1=document.getElementById('qty7').value;\n" +
"var p=document.getElementById('p7').value;	\n" +
"         document.getElementById('error7').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error7.style=\"color:white\";\n" +
"    document.getElementById('amount7').innerHTML=\"\";\n" +
"    document.getElementById('price7').value=\"\";\n" +
"    document.getElementById('qty7').value=\"\";\n" +
"    document.getElementById('cars7').value=\"\";\n" +
"    document.getElementById('top7').value=\"\";\n" +
"    document.getElementById('price7').value=\"\";\n" +
"    document.getElementById('p').value='p+a1';\n" +
"}\n" +
"}\n" +
 "else{\n" +
"         document.getElementById('error7').innerHTML=\"*OUT OF STOCK\";\n" +
"                error7.style=\"color:white\";\n" +
"    document.getElementById('amount7').innerHTML=\"\";\n" +
"    document.getElementById('price7').value=\"\";\n" +
"    document.getElementById('qty7').value=\"\";\n" +
"    document.getElementById('cars7').value=\"\";\n" +
"    document.getElementById('top7').value=\"\";\n" +
"    document.getElementById('price7').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +

                
"function cart8(){\n" +
"var pro=document.getElementById('item8');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty8').value;\n" +
"var size=document.getElementById('cars8').value;\n" +
"var top=document.getElementById('top8').value;\n" +
"var p=document.getElementById('p8').value;\n" +
"var t;var to;\n" +
"  if(p>0){if( a1<=p){\n" +
"if(a1>0&&a1<8){\n" +
"if(size!==\"\"){\n" +
"if(size===\"small\")\n" +
"{\n" +
" if(top!==\"\") {\n" +
" t=100+10;  to=t*a1; document.getElementById('price8').value=to;}\n" +
"       else{\n" +
"t=100;  to=t*a1; document.getElementById('price8').value=to;\n" +
"  }\n" +
"}\n" +
"else if(size===\"medium\"){\n" +
" if(top!==\"\")\n" +
"{\n" +
" t=120+10;  to=t*a1; document.getElementById('price8').value=to;\n" +
"}\n" +
"else{\n" +
"t=120;  to=t*a1; document.getElementById('price8').value=to;\n" +
"\n" +
" }\n" +
"\n" +
"}\n" +
"else{\n" +
" if(top!==\"\")\n" +
"{\n" +
" t=150+10;  to=t*a1; document.getElementById('price8').value=to;\n" +
"}\n" +
"else{\n" +
"t=150;  to=t*a1; document.getElementById('price8').value=to;\n" +
"  }\n" +
"}\n" +
"if(to!==\"\"){\n" +
"document.getElementById('amount8').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
"document.getElementById('p8').value=p-a1; \n" +
"}\n" +
"else{\n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error8').innerHTML=\"\";\n" +
  "   error8.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error8').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error8.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error8').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error8.style=\"color:white\";\n" +
"}\n" +
"}\n"+
"else{\n" +
"var a1=document.getElementById('qty8').value;\n" +
"var p=document.getElementById('p8').value;	\n" +
"         document.getElementById('error8').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error8.style=\"color:white\";\n" +
"    document.getElementById('amount8').innerHTML=\"\";\n" +
"    document.getElementById('price8').value=\"\";\n" +
"    document.getElementById('qty8').value=\"\";\n" +
"    document.getElementById('cars8').value=\"\";\n" +
"    document.getElementById('top8').value=\"\";\n" +
"    document.getElementById('price8').value=\"\";\n" +
"    document.getElementById('p').value='p+a1';\n" +
"}\n" +
"}\n" +
 "else{\n" +
"         document.getElementById('error8').innerHTML=\"*OUT OF STOCK\";\n" +
"                error8.style=\"color:white\";\n" +
"    document.getElementById('amount8').innerHTML=\"\";\n" +
"    document.getElementById('price8').value=\"\";\n" +
"    document.getElementById('qty8').value=\"\";\n" +
"    document.getElementById('cars8').value=\"\";\n" +
"    document.getElementById('top8').value=\"\";\n" +
"    document.getElementById('price8').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +

"function cart9(){\n" +
"var pro=document.getElementById('item9');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty9').value;\n" +
"var size=document.getElementById('cars9').value;\n" +
"var top=document.getElementById('top9').value;\n" +
"var p=document.getElementById('p9').value;\n" +
"var t;var to;\n" +
"  if(p>0){if(a1<=p){\n" +
"if(a1>0&&a1<8){\n" +
"if(size!==\"\"){\n" +
"if(size===\"small\")\n" +
"{\n" +
" if(top!==\"\") {\n" +
" t=100+10;  to=t*a1; document.getElementById('price9').value=to;\n" +
" }\n" +
" else{\n" +
"t=100;  to=t*a1; document.getElementById('price9').value=to;\n" +
"  }\n" +
"}\n" +
"\n" +
"else if(size===\"medium\"){\n" +
" if(top!==\"\")\n" +
"{\n" +
" t=120+10;  to=t*a1; document.getElementById('price9').value=to;\n" +
"}\n" +
"else{\n" +
"t=120;  to=t*a1; document.getElementById('price9').value=to;\n" +
" }\n" +
"}\n" +
"\n" +
"else{\n" +
" if(top!==\"\")\n" +
"{\n" +
" t=150+10;  to=t*a1; document.getElementById('price9').value=to;\n" +
"}\n" +
"\n" +
"else{\n" +
"t=150; to=t*a1; document.getElementById('price9').value=to;\n" +
"   }\n" +
"}\n" +
"if(to!==\"\"){\n" +
"	document.getElementById('amount9').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
"document.getElementById('p9').value=p-a1; \n" +
          "}\n" +
"else{\n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error9').innerHTML=\"\";\n" +
  "   error9.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error9').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error9.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error9').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error9.style=\"color:white\";\n" +
"}\n" +
"}\n"+
"else{\n" +
"var a1=document.getElementById('qty3').value;\n" +
"var p=document.getElementById('p3').value;	\n" +
"         document.getElementById('error9').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error9.style=\"color:white\";\n" +
"    document.getElementById('amount9').innerHTML=\"\";\n" +
"    document.getElementById('price3').value=\"\";\n" +
"    document.getElementById('qty9').value=\"\";\n" +
"    document.getElementById('cars9').value=\"\";\n" +
"    document.getElementById('top9').value=\"\";\n" +
"    document.getElementById('price9').value=\"\";\n" +
"    document.getElementById('p').value='p+a1';\n" +
"}\n" +
"}\n" +
 "else{\n" +
"         document.getElementById('error9').innerHTML=\"*OUT OF STOCK\";\n" +
"                error9.style=\"color:white\";\n" +
"    document.getElementById('amount9').innerHTML=\"\";\n" +
"    document.getElementById('price9').value=\"\";\n" +
"    document.getElementById('qty9').value=\"\";\n" +
"    document.getElementById('cars9').value=\"\";\n" +
"    document.getElementById('top9').value=\"\";\n" +
"    document.getElementById('price9').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +

                
"function cart10(){\n" +
"var pro=document.getElementById('item10');\n" +
"var i = pro.textContent;\n" +
"var a1=document.getElementById('qty10').value;\n" +
"var size=document.getElementById('cars10').value;\n" +
"var top=document.getElementById('top10').value;\n" +
"var p=document.getElementById('p10').value;\n" +
"var t;var to;\n" +
"  if(p>0){ if(a1<=p){\n" +
"if(a1>0 && a1<8){\n" +
"if(size!==\"\"){\n" +
"if(size===\"small\")\n" +
"{\n" +
" if(top!==\"\") {\n" +
"    \n" +
" t=200+30;  to=t*a1; document.getElementById('price10').value=to; }\n" +
" else{ \n" +
"t=200;  to=t*a1; document.getElementById('price10').value=to;\n" +
"  }\n" +
"}\n" +
"\n" +
"else if(size===\"medium\"){\n" +
" if(top!==\"\")\n" +
"{ \n" +
" t=250+30;  to=t*a1; document.getElementById('price10').value=to;\n" +
"}\n" +
"else{ \n" +
"t=250;  to=t*a1; document.getElementById('price10').value=to;\n" +
" }\n" +
"}\n" +
"\n" +
"else{ \n" +
" if(top!==\"\")\n" +
"{ \n" +
" t=300+30; \n" +
"  to=t*a1;\n" +
"  document.getElementById('price10').value=to;\n" +
"}\n" +
"\n" +
"else{ \n" +
"t=300;  to=t*a1; \n" +
"document.getElementById('price10').value=to;\n" +
"   }\n" +
"}\n" +
"if(to!==\"\"){\n" +
"	document.getElementById('amount10').innerHTML=(i+\"---\"+size+\"---\"+top+\"----\"+t+\"---\"+to);\n" +
"document.getElementById('p10').value=p-a1; \n" +
          "}\n" +
"else{\n" +
"alert(\"kindly give the qty\");\n" +
"}\n" +
 "document.getElementById('error10').innerHTML=\"\";\n" +
  "   error10.style=\"color:white\";\n" +
" }\n" +
"else{\n" +
"         document.getElementById('error10').innerHTML=\"*KINDLY SELECT SIZE\";\n" +
"                error10.style=\"color:white\";\n" +
"}\n" +
"}\n" +
"else{\n" +
"         document.getElementById('error10').innerHTML=\"*KINDLY GIVE QTY\";\n" +
"                error10.style=\"color:white\";\n" +
"}\n" +
"}" +
"else{\n" +
"var a1=document.getElementById('qty10').value;\n" +
"var p=document.getElementById('p10').value;	\n" +
"         document.getElementById('error10').innerHTML=(\"*minimum available:=\" + p);\n" +
"                error10.style=\"color:white\";\n" +
"    document.getElementById('amount10').innerHTML=\"\";\n" +
"    document.getElementById('price10').value=\"\";\n" +
"    document.getElementById('qty10').value=\"\";\n" +
"    document.getElementById('cars10').value=\"\";\n" +
"    document.getElementById('top10').value=\"\";\n" +
"    document.getElementById('price10').value=\"\";\n" +
"    document.getElementById('p').value='p+a1';\n" +
"}\n" +
"}\n"+
 "else{\n" +
"         document.getElementById('error10').innerHTML=\"*OUT OF STOCK\";\n" +
"                error10.style=\"color:white\";\n" +
"    document.getElementById('amount10').innerHTML=\"\";\n" +
"    document.getElementById('price10').value=\"\";\n" +
"    document.getElementById('qty10').value=\"\";\n" +
"    document.getElementById('cars10').value=\"\";\n" +
"    document.getElementById('top10').value=\"\";\n" +
"    document.getElementById('price10').value=\"\";\n" +
"}\n" +
"}\n" +
"\n" +
"\n" +

                
                
"</script>\n" +
"</body>\n"+
"</html>\n" );              
}
 PreparedStatement ps1=con.prepareStatement("insert into buy(name,phone,count,amount) values(?,?,?,?)");
        ps1.setString(1,name);
         ps1.setString(2,phone);
          ps1.setString(3,count);
           ps1.setString(4,amount);
           ps1.executeUpdate();
      
       //out.println(i1);
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
     RequestDispatcher rd=request.getRequestDispatcher("contact.html");
            rd.forward(request, response);
          out.println("<center><h2></h2></center>");
 }  

    catch(Exception e)
            {
//   out.println(e);
}
}}
