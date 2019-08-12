/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import database.updatedetaildb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import structure.crop;
/**
 *
 * @author utkarsha
 */
@WebServlet(urlPatterns = {"/updatedetailservlet"})
public class updatedetailservlet extends HttpServlet {

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
    {
        String id= request.getParameter("crq_id");
        String status= request.getParameter("status");
        
        HttpSession session = request.getSession();
        crop cr= new crop();
        
        cr.setcrq_id(id);
        cr.setstatus(status);
        
        String str="update crop_details set admin_status=? where crq_id=?";
        int i = updatedetaildb.updatedetail(cr);
        
        if(i!=0)
        {
            session.setAttribute("crq_id", id);
            session.setAttribute("status",status);
            
            System.out.println("Update sucessfully");
            session.setAttribute("msg","Upadate sucessfully");
            response.sendRedirect("admincropdetail.jsp");
            
            
        }
        else
        {
            System.out.println("not updated");
            session.setAttribute("smsg","Not updated");
              response.sendRedirect("admincropdetail.jsp");
            
            
        }
    }

    
}
