package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.farmer;
import structure.crop;

//@WebServlet(name = "db", urlPatterns = {"/db"})
       public class cropdb
               
        {
            
            public static int registercrop(farmer fd,crop cr)             
            {
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";
               // System.out.println("hi 1 ");
                Connection con;
                int i = 0 ;
                String sql="insert into crop_details(fid,crq_id,crname,crquantity,cramount) values (?,?,?,?,?)";
                
               // System.out.println("hi 2");
              
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url, username, password);
                    PreparedStatement stm = con.prepareStatement(sql);
                    stm.setString(1,fd.getfid());
                    stm.setString(2,cr.getcrq_id());
                    
                    stm.setString(3,cr.getcrname());
                    stm.setString(4,cr.getcrquantity());
                    stm.setString(5,cr.getcramount());  
                    
                   // System.out.println("hi 3");
                    i = stm.executeUpdate();
                    //System.out.println("hi 4");
                }
                  
                catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(cropdb.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) 
                {
                    Logger.getLogger(cropdb.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch(Exception ex){}  

              return i;
            }


                
           
    }

   

