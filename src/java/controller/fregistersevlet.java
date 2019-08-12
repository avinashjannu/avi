/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.fdb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import structure.farmer;

/**
 *
 * @author utkarsha
 */
@WebServlet(name = "fregisterservlet", urlPatterns = {"/fregisterservlet"})
public class fregistersevlet extends HttpServlet 
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException
    {
             //1. Retrive all the parameters from jsp
                String fid=request.getParameter("loginid");
                String fname=request.getParameter("fname");
                String flname=request.getParameter("lname");
                String faddress=request.getParameter("address");
		String fpass=request.getParameter("pwd");
		String fphone=request.getParameter("contact");
		
		
                
                
        //2. set the valuse in model class
                farmer fd=new farmer();
                fd.setfid(fid);
                fd.setfname(fname);
                fd.setflast(flname);
                fd.setfaddress(faddress);
                fd.setfpassword(fpass);
                fd.setfcontact(fphone);
                
               
        
        //3.pass model class objct to DAO class method
                int i= fdb.register1(fd);

                if(i!=0)
                {
                     System.out.println("value inserted");
                     
                     HttpSession session=request.getSession();
                     session.setAttribute("username",fid);
                     
                     response.sendRedirect("farmer_login1.jsp"); //redirect user to login.jsp

                }
                else
                {
                    System.out.println("value not inserted"); //data insertion failed
                    response.sendRedirect("farmer_signup1.jsp"); //redirect user to register.jsp
       
                }

   }
}