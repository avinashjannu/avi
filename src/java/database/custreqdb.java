package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.customer;
import structure.cust_requirement;

//@WebServlet(name = "db", urlPatterns = {"/db"})
       public class custreqdb
               
        {
            
            public static int registercustreq(customer ub,cust_requirement rq)             
            {
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";
               // System.out.println("hi 1 ");
                Connection con;
                int i = 0 ;
                String sql="insert into cust_requirement(cust_id,cname,cquantity) values (?,?,?)";
                
               // System.out.println("hi 2");
              
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url, username, password);
                    PreparedStatement stm = con.prepareStatement(sql);
                    stm.setString(1,ub.getName());
                  
                    stm.setString(2,rq.getcname());
                    stm.setString(3,rq.getcquantity());
                    
                    
                   // System.out.println("hi 3");
                    i = stm.executeUpdate();
                    //System.out.println("hi 4");
                }
                  
                catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(custreqdb.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) 
                {
                    Logger.getLogger(custreqdb.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch(Exception ex){}  

              return i;
            }


                
           
    }

   

