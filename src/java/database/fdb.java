package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.farmer;


//@WebServlet(name = "db", urlPatterns = {"/db"})
       public class fdb
               
        {
            
            public static int register1(farmer fd)             
            {
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";
               // System.out.println("hi 1 ");
                Connection con;
                int i = 0 ;
                String sql="insert into farmer(fid,firstname,lastname,address,password,contact) values (?,?,?,?,?,?)";
               // System.out.println("hi 2");
              
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url, username, password);
                    PreparedStatement stm = con.prepareStatement(sql);
                    stm.setString(1,fd.getfid());
                    stm.setString(2,fd.getfname());
                    
                    stm.setString(3,fd.getflast());
                    stm.setString(4,fd.getfaddress());
                    stm.setString(5,fd.getfpassword());  
                    stm.setString(6,fd.getfcontact());
                   // System.out.println("hi 3");
                    i = stm.executeUpdate();
                    //System.out.println("hi 4");
                }
                  
                catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(fdb.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) 
                {
                    Logger.getLogger(fdb.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch(Exception ex){}  

              return i;
            }


                
           
    }

   

