



<%-- 
    Document   : cust_requirement
    Created on : Oct 15, 2018, 1:57:03 PM
    Author     : utkarsha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="english">

    <head>
            <title>Farming Assistance Services</title>
            <meta charset="UTF-8">
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" type="text/css" href="index1.css">
            <link rel="stylesheet" type="text/css" href="signup1.css">
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
            <a href="index1.jsp">Home</a>
        </div>

        <div class="row">
            
                
                
            <ul>
                <li><a href="cust_requirement.jsp">Post Requirment</a></li>
                <li><a href="viewcust_requirement.jsp">Check Status</a></li>
                <li><a href="displaybill.jsp">Display Bill</a><li>
                <li><a href="c_logout.jsp">Logout</a></li>
            </ul>
                
           
       
        
            
     <div class="main">
        <div class="register">
            <form action="cust_reqservlet " method="post">
                <div class="container">
                    <h4>Customer requirement</h4>
                    


                    <label for="cust_id">Customer ID</label>
                    <input type="text" id="cust_id"placeholder="Customer id.." name="cust_id" value="${id}" required>

                    <label for="cname">Crop Name</label>
                    <input type="text" id="cname" placeholder="Crop name.." name="cname" required>

                    <label for="cquantity">Crop Quantity</label>
                    <input type="text" id="cquantity" placeholder="Crop quantity in kg.." name="cquantity" required>

                    <hr>

                    <button type="submit" class="registerbtn">Post Requirement</button>
                </div>
            </form>
         </div>
        </div>
        </div>    
    </body>
</html>
        
        




                        

