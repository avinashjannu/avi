
package controller;

import database.billdb;
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
import structure.customer;
import structure.bill;
import structure.crop;
   

@WebServlet(name = "billservlet", urlPatterns = {"/billservlet"})
public class billservlet extends HttpServlet 
{




@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
      //1. Retrive all the parameters from jsp
                String bid=request.getParameter("bid");
                String crname=request.getParameter("crname");
                String fid=request.getParameter("fid");
                String cust_id=request.getParameter("cust_id");
                String quantity=request.getParameter("quantity");
		String amount=request.getParameter("amount");
	
		
		
                
                
        //2. set the valuse in model class
                farmer fd=new farmer();
                customer ub=new customer();
                bill bd=new bill();
                 crop cr=new crop();
                
                bd.setbid(bid);
                cr.setcrname(crname);
                fd.setfid(fid);
                ub.setName(cust_id);
                bd.setquantity(quantity);
                bd.setamount(amount);
                
                
               
        
        //3.pass model class objct to DAO class method
                int i= billdb.registerbill(fd,ub,bd,cr);

                if(i!=0)
                {
                     System.out.println("value inserted");
                     
                     HttpSession session=request.getSession();
                     session.setAttribute("username",fid);
                     
                     response.sendRedirect("bill.jsp"); //redirect user to login.jsp

                }
                else
                {
                    System.out.println("value not inserted"); //data insertion failed
                    response.sendRedirect("bill.jsp"); //redirect user to register.jsp
       
                }

        
        
    }

  
}
