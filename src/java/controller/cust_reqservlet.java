/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import database.cropdb;
import database.custreqdb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import structure.customer;
import structure.cust_requirement;

        


@WebServlet(name = "cust_reqservlet", urlPatterns = {"/cust_reqservlet"})
public class cust_reqservlet extends HttpServlet 
{


   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //1. Retrive all the parameters from jsp
                String cust_id=request.getParameter("cust_id");
               String cname=request.getParameter("cname");
                String cquantity=request.getParameter("cquantity");
	
		
		
                
                
        //2. set the valuse in model class
                customer ub=new customer();
                cust_requirement rq=new cust_requirement();

                ub.setName(cust_id);
                rq.setcname(cname);
                rq.setcquantity(cquantity);
                
                
                
               
        
        //3.pass model class objct to DAO class method
                int i= custreqdb.registercustreq(ub,rq);

                if(i!=0)
                {
                     System.out.println("value inserted");
                     
                     HttpSession session=request.getSession();
                     session.setAttribute("username",cust_id);
                     
                     response.sendRedirect("cust_requirement.jsp"); //redirect user to login.jsp

                }
                else
                {
                    System.out.println("value not inserted"); //data insertion failed
                    response.sendRedirect("cust_requirement.jsp"); //redirect user to register.jsp
       
                }

   
        
    }

    
}
