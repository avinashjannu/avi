



<%-- 
    Document   : displaybill
    Created on : Oct 16, 2018, 4:29:45 PM
    Author     : utkarsha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String cust_id = request.getParameter("loginid");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "agriculture";
String userId = "root";
String password = "root";

try 
{
Class.forName(driverName);
} 
catch (ClassNotFoundException e)
{
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<html lang="en">
    <head>
        <title>Farming Assistance Services</title>
        <meta charset="UTF-8">
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="index1.css">
        <link rel="stylesheet" type="text/css" href="twocolumn.css">
    </head>
    <body>

        <div class="header">
            <div class="topleft">
            <img src="images/10.jpeg" width="234" height="234">
            </div>
            <h1>Farming Assistance Services</h1>
        </div>

        <div class="navbar">
           <a href="contact.jsp">Contact</a>
           <a href="about.jsp">About us</a>
           <a href="index.jsp">Home</a>
        </div>

        <div class="row">
        <ul>
       <li><a href="cust_requirement.jsp">Post Requirement</a></li>
       <li><a href="viewcust_requirement.jsp">Check Status</a></li>
        <li><a href="displaybill.jsp">Display bill</a></li>
       <li><a href="c_logout.jsp">Logout</a></li>
       </ul>
        
        
      <div class="main">  
        
        <table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#213409">
    <td><b><font color="#B0DC7A">Bill Id</font></b></td>
    <td><b><font color="#B0DC7A">Crop Name</font></b></td>
    <td><b><font color="#B0DC7A">Farmer Id</font></b></td>
    <td><b><font color="#B0DC7A">Customer Id</font></b></td>
    <td><b><font color="#B0DC7A">Crop Quantity</font></b></td>
    <td><b><font color="#B0DC7A">Crop Amount</font></b></td>
</tr>
<%
try
{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();


String sql ="select * from bill";

resultSet = statement.executeQuery(sql);
while(resultSet.next())
{
%>
<tr bgcolor="#B0DC7A">

<td><%=resultSet.getString(1) %></td>
<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
<td><%=resultSet.getString(4) %></td>
<td><%=resultSet.getString(5) %></td>
<td><%=resultSet.getString(6) %></td>


</tr>

<% 
}

}
catch (Exception e) 
{
    e.printStackTrace();
}


%>
        
</table>

      </div>
        </div>
    </body>
</html>
