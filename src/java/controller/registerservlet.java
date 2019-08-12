/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.db1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import structure.customer;

/**
 *
 * @author utkarsha
 */
@WebServlet(name = "registerservlet", urlPatterns = {"/registerservlet"})
public class registerservlet extends HttpServlet 
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException
    {
             //1. Retrive all the parameters from jsp
                String custid=request.getParameter("loginid");
                String fname=request.getParameter("fname");
                String lname=request.getParameter("lname");
                String address=request.getParameter("address");
		String pass=request.getParameter("pwd");
		String phone=request.getParameter("contact");
		
		
                
                
        //2. set the valuse in model class
                customer ub=new customer();
                ub.setName(custid);
                ub.setname(fname);
                ub.setLast(lname);
                ub.setAddress(address);
                ub.setPassword(pass);
                ub.setContact(phone);
                
               
        
        //3.pass model class objct to DAO class method
                int i= db1.register(ub);

                if(i!=0)
                {
                     System.out.println("value inserted");
                     
                     HttpSession session=request.getSession();
                     session.setAttribute("username",custid);
                     
                     response.sendRedirect("customer_login1.jsp"); //redirect user to login.jsp

                }
                else
                {
                    System.out.println("value not inserted"); //data insertion failed
                    response.sendRedirect("customer_signup1.jsp"); //redirect user to register.jsp
       
                }

   }
}