/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import database.cropdb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import structure.farmer;
import structure.crop;


/**
 *
 * @author utkarsha
 */
@WebServlet(name = "cropdetailservlet", urlPatterns = {"/cropdetailservlet"})
public class cropdetailservlet extends HttpServlet 
{

 
    
    
    
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        //1. Retrive all the parameters from jsp
                String fid=request.getParameter("loginid");
                String crq_id=request.getParameter("crq_id");
                String cname=request.getParameter("cname");
                String cquantity=request.getParameter("cquantity");
		String camount=request.getParameter("camount");
	
		
		
                
                
        //2. set the valuse in model class
                farmer fd=new farmer();
                crop cr=new crop();

                fd.setfid(fid);
                cr.setcrq_id(crq_id);
                cr.setcrname(cname);
                cr.setcrquantity(cquantity);
                cr.setcramount(camount);
                
                
               
        
        //3.pass model class objct to DAO class method
                int i= cropdb.registercrop(fd,cr);

                if(i!=0)
                {
                     System.out.println("value inserted");
                     
                     HttpSession session=request.getSession();
                     session.setAttribute("username",fid);
                     
                     response.sendRedirect("crop_details.jsp"); //redirect user to login.jsp

                }
                else
                {
                    System.out.println("value not inserted"); //data insertion failed
                    response.sendRedirect("crop_details.jsp"); //redirect user to register.jsp
       
                }

   }
        
    }

    

