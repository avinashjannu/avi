/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.clogindb;
import structure.customer;

/**
 *
 * @author utkarsha
 */
@WebServlet(name = "custloginservlet", urlPatterns = {"/custloginservlet"})
public class custloginservlet extends HttpServlet 
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
       String uname=request.getParameter("loginid");
		String pass=request.getParameter("pwd");
		
		customer ub=new customer();
		ub.setName(uname);
		ub.setPassword(pass);
		
        String sql="select * from customer where cust_id=? and password=?";

        ResultSet rs=clogindb.login_cust(ub,sql);
        	
		try 
		{
			if(rs.next())
			{
				System.out.println("login sucessfull");
				
				HttpSession session=request.getSession();
				session.setAttribute("id",rs.getString(1));
				session.setAttribute("name",rs.getString(2));
				session.setAttribute("last",rs.getString(3));
				session.setAttribute("address",rs.getString(4));
                                session.setAttribute("password",rs.getString(5));
                                session.setAttribute("contact",rs.getString(6));
                
				response.sendRedirect("cnavbar.jsp");
				
               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}
			else
			{
                                response.sendRedirect("customer_login1.jsp");
				System.out.println("login unsucessfull");
                //getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);            
			}
		} 
		catch (SQLException ex) 
                {
			ex.printStackTrace();
		}
		
    }

   
}
