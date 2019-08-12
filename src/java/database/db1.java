package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.customer;


//@WebServlet(name = "db", urlPatterns = {"/db"})
       public class db1
               
        {
            
            public static int register(customer ub)             
            {
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";
               // System.out.println("hi 1 ");
                Connection con;
                int i = 0 ;
                String sql="insert into customer(cust_id,firstname,lastname,address,password,contact) values (?,?,?,?,?,?)";
               // System.out.println("hi 2");
              
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url, username, password);
                    PreparedStatement stm = con.prepareStatement(sql);
                    stm.setString(1,ub.getName());
                    stm.setString(2,ub.getname());
                    
                    stm.setString(3,ub.getLast());
                    stm.setString(4,ub.getAddress());
                    stm.setString(5,ub.getPassword());  
                    stm.setString(6,ub.getContact());
                   // System.out.println("hi 3");
                    i = stm.executeUpdate();
                    //System.out.println("hi 4");
                }
                  
                catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(db1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) 
                {
                    Logger.getLogger(db1.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch(Exception ex){}  

              return i;
            }


                
           
    }

   

