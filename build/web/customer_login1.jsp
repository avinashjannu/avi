<%-- 
    Document   : customer_login
    Created on : Oct 5, 2018, 12:10:33 PM
    Author     : utkarsha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
	<head>
            <title>Farming Assistance Services</title>
            <meta charset="UTF-8">
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" type="text/css" href="index1.css">
            <link rel="stylesheet" type="text/css" href="login.css">
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


            <form action="custloginservlet"  method="post">
                <div class="imgcontainer">
                    <img src="images/11.png" alt="Avatar" class="avatar">
                </div>

                <div class="container">
                    <label for="uname"><b>Username</b></label>
                    <input type="text" placeholder="Enter Username" name="loginid" required>

                    <label for="psw"><b>Password</b></label>
                    <input type="password" placeholder="Enter Password" name="pwd" required>

                    <button  class="button" type="submit">Login</button>
                    <label><input type="checkbox" checked="checked" name="remember"> Remember me</label>
                    
                </div>

                <div class="container">
                    
                    <span class="psw">New <a href="customer_signup1.jsp">signup</a></span><br>
                    <br>
                    <br>
                    <br>

                </div>
            </form>
        </body>    
</html>
	


