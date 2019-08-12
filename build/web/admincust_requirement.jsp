

<%-- 
    Document   : admincust_requirement
    Created on : Oct 16, 2018, 10:58:03 PM
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
        <link rel="stylesheet" type="text/css" href="signup1.css">
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
          <li><a href="admincropdetail.jsp">Farmer Crop_details</a></li>
          <li><a href="admincust_requirement.jsp">Customer Requirement</a></li>
          <li><a href="bill.jsp">Generate Bill </a></li>
          <li><a href="a_logout.jsp">Logout</a></li>
        </ul>
        
    
            <div calss="main">
                <br>
                <br>
                
        <table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#213409">
    <td><b><font color="#B0DC7A">Customer Id</font></b></td>
    <td><b><font color="#B0DC7A">Crop Name</font></b></td>
    <td><b><font color="#B0DC7A">Crop Quantity</font></b></td>
    <td><b><font color="#B0DC7A">Admin Status</font></b></td>
</tr>
<%
try
{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();


String sql ="select * from cust_requirement";

resultSet = statement.executeQuery(sql);
while(resultSet.next())
{
%>
<tr bgcolor="#B0DC7A">

<td><%=resultSet.getString(1) %></td>
<td><%=resultSet.getString(2) %></td>
<td><%=resultSet.getString(3) %></td>
<td><%=resultSet.getString(4) %></td>


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

<br><br>            
   <div class="register">
                <form action="updatereqservlet" method="post">
                    <div class="container">
                        <h4>Update Status</h4>
                        <hr>

                        <label for="cust_id">Customer Id</label>
                        <input type="text" id="cust_id"  placeholder="Customer Id" name="cust_id" required>
                         
                        <label for="cname">Crop name</label>
                        <input type="text" id="cname"  placeholder="Crop name...." name="cname" required>

                        <label for="status">Admin Status</label>
                        <input type="text" id="status" placeholder="Status" name="status" required>
                        <hr>

                        <button type="submit" class="registerbtn">Update</button>
                    </div>
                </form>
        

            </div>

    
</div>
        </div>
    
    
    
    
    </body>
            
</html>
