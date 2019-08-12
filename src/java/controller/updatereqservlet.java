/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.updatereqdb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import structure.cust_requirement;

/**
 *
 * @author utkarsha
 */
@WebServlet(name = "updatereqservlet", urlPatterns = {"/updatereqservlet"})
public class updatereqservlet extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String id = request.getParameter("cust_id");
        String name= request.getParameter("cname");
        String status= request.getParameter("status");
        
        HttpSession session = request.getSession();
        cust_requirement rq= new cust_requirement();
        
        rq.setcust_id(id);
        rq.setcname(name);
        rq.setstatus(status);
        
        String str="update cust_requirement set admin_status=? where cust_id=? and cname=?";
        int i = updatereqdb.updatereq(rq);
        
        if(i!=0)
        {
            session.setAttribute("cust_id", id);
            session.setAttribute("cname", name);
            session.setAttribute("status",status);
            
            System.out.println("Update sucessfully");
            session.setAttribute("msg","Upadate sucessfully");
            response.sendRedirect("admincust_requirement.jsp");
            
            
        }
        else
        {
            System.out.println("not updated");
            session.setAttribute("smsg","Not updated");
              response.sendRedirect("admincust_requirement.jsp");
            
            
        }
    }

    

}
