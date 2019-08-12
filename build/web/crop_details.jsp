



<%-- 
    Document   : crop_details
    Created on : Oct 14, 2018, 6:19:37 PM
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
       <li><a href="crop_details.jsp">Post Crop details</a></li>
       <li><a href="viewcropdetail.jsp">Previous details</a></li>
       <li><a href="f_logout.jsp">Logout</a></li>
       </ul>


        <div class="main">
        <div class="register">
            <form action="cropdetailservlet" method="post">
                <div class="container">
                    <h4>Crop Details</h4>
                    <hr>

                    <label for="fid">farmer id</label>
                    <input type="text" id="loginid" placeholder="Farmer id" name="loginid" value="${fid}" required>

                    <label for="cre_id">Crop request id</label>
                    <input type="text" id="crq_id" placeholder="Crop request id..." name="crq_id" required>

                    <label for="cname">Crop name</label>
                    <input type="text" id="cname" placeholder="Crop name...." name="cname" required>

                    <label for="cquantity">Crop quantity</label>
                    <input type="text" id="cquantity" placeholder="crop quantity" name="cquantity" required>

                    <label for="camount">Crop amount</label>
                    <input type="text" id="camount" placeholder="crop amount" name="camount" required>
                    <hr>

                    <button type="submit" class="registerbtn">Register</button>
                </div>
            </form>
        </div>
        </div>   
        </div>  
    </body>
</html>
    
