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

import database.flogindb;
import structure.farmer;
/**
 *
 * @author utkarsha
 */
@WebServlet(name = "farmerloginservlet", urlPatterns = {"/farmerloginservlet"})
public class farmerloginservlet extends HttpServlet
{

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
                String id=request.getParameter("loginid");
		String password=request.getParameter("pwd");
		
		farmer fd = new farmer();
		fd.setfid(id);
		fd.setfpassword(password);
		
        String sql="select * from farmer where fid=? and password=?";

        ResultSet rs = flogindb.login_farmer(fd,sql);
        	
		try 
		{
			if(rs.next())
			{
				System.out.println("login sucessfull");
				
				HttpSession session=request.getSession();
				session.setAttribute("fid",rs.getString(1));
				session.setAttribute("fname",rs.getString(2));
				session.setAttribute("flast",rs.getString(3));
				session.setAttribute("faddress",rs.getString(4));
                                session.setAttribute("fpassword",rs.getString(5));
                                session.setAttribute("fcontact",rs.getString(6));
                
				response.sendRedirect("fnavbar.jsp");
				
               // getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request, response);
			}
			else
			{
                                response.sendRedirect("farmer_login1.jsp");
				System.out.println("login unsucessfull");
                //getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);            
			}
		} 
		catch (SQLException ex) {
			ex.printStackTrace();
		}
    }

   

}
