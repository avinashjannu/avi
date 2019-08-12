<%-- 
    Document   : customer_signup
    Created on : Oct 5, 2018, 12:06:22 PM
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
    </head>

	<body>

            <div class="header">
                    <div class="topleft">
                            <img src="images/10.jpeg" width="234" height="229">
                    </div>
                    <h1>Farming Assistance Services</h1>
            </div>

            <div class="navbar">
            <a href="contact.jsp">Contact</a>
            <a href="about.jsp">About us</a>
            <a href="index.jsp">Home</a>
            </div>
            <br>

            <div class="register">
                <form action="registerservlet" method="post">
                    <div class="container">
                        <h4>Register</h4>
                        <hr>

                        <label for="login">Customers Login ID</label>
                        <input type="text" id="loginid" placeholder="Login id" name="loginid" required>

                        <label for="fname">Customers First name</label>
                        <input type="text" id="fname" placeholder="Your name.." name="fname" required>

                        <label for="lname">Customers Last name</label>
                        <input type="text" id="lname" placeholder="Your lastname" name="lname" required>

                        <label for=address>Address</label>
                        <input type="text" id="address" placeholder="Your address" name="address" required>

                        <label for="pass">Password</label>
                        <input type="password" id="pwd" placeholder="Enter Password" name="pwd" required>

                        <label for="fname">Contact No</label>
                        <input type="text" id="contact" placeholder="Mobile no.." name="contact" required>
                        <hr>

                        <button type="submit" class="registerbtn">Register</button>
                    </div>

                </form>
            </div>
        </body>
</html>

