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

import database.alogindb;
import structure.admin;

/**
 *
 * @author utkarsha
 */
@WebServlet(name = "adminloginservlet", urlPatterns = {"/adminloginservlet"})
public class adminloginservlet extends HttpServlet
{

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
                String aid=request.getParameter("uname");
		String apassword=request.getParameter("psw");
		
		admin ad=new admin();
		ad.setid(aid);
		ad.setpassword(apassword);
		
        String sql="select * from admin_login where id=? and password=?";

        ResultSet rs= alogindb.login_admin(ad,sql);
        	
		try 
		{
			if(rs.next())
			{
				System.out.println("login sucessfull");
				
				HttpSession session=request.getSession();
				session.setAttribute("id",rs.getString(1));
				session.setAttribute("password",rs.getString(2));
				
                
				response.sendRedirect("adminnavbar.jsp");
				
               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}
			else
			{
                                response.sendRedirect("admin_login.jsp");
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
