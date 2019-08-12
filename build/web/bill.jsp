



<%-- 
    Document   : bill
    Created on : Oct 15, 2018, 10:46:59 PM
    Author     : utkarsha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


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
                <a href="index.jsp">Home</a>          
            </div>
            
            <div class="row">            
            <ul>
                <li><a href="admincropdetail.jsp">Farmer Crop_details</a></li>
                <li><a href="admincust_requirement.jsp">Customer Requirement</a></li>
                <li><a href="bill.jsp">Generate Bill </a></li>
                <li><a href="a_logout.jsp">Logout</a></li>
            </ul>
            <br>

            <div class="main">
            <div class="register">
                <form action="billservlet" method="post">
                    <div class="container">
                        <h4>Generate bill</h4>
                        <hr>

                        <label for="bid">Bill id</label>
                        <input type="text" id="bid" placeholder="Bill id" name="bid" required>

                        <label for="crname">Crop name</label>
                        <input type="text" id="crname" placeholder="Crop name...." name="crname" required>

                        <label for="fid">Farmer id</label>
                        <input type="text" id="fid" placeholder="Farmer id..." name="fid" required>

                            <label for="cust_id">Customer id</label>
                        <input type="text" id="cust_id" placeholder="Customer id..." name="cust_id" required>

                            <label for="quantity">Quantity</label>
                        <input type="text" id="quantity" placeholder="Quantity..." name="quantity" required>

                        <label for="amount">Amount</label>
                        <input type="text" id="amount" placeholder="Amount..." name="amount" required>
                        <hr>

                        <button type="submit" class="registerbtn">Generate bill</button>
                    </div>
                </form>
            </div>
            </div>
            </div>
        </body>
</html>
                
                
        


