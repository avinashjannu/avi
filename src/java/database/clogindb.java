package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.customer;


//@WebServlet(name = "db", urlPatterns = {"/db"})
       public class clogindb
               
        {
            
            public static ResultSet login_cust(customer ub,String sql)             
            {
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";
               // System.out.println("hi 1 ");
                Connection con;
                ResultSet rs=null;
              
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url, username, password);
                    PreparedStatement stm = con.prepareStatement(sql);
                    stm.setString(1,ub.getName());
                    stm.setString(2,ub.getPassword());
                    rs=stm.executeQuery();


	
                  
                }
                  
                catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(clogindb.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) 
                {
                    Logger.getLogger(clogindb.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
                catch(Exception ex){}  
                
              return rs;
            }


                
           
    }

   

