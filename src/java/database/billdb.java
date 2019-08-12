package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.farmer;
import structure.customer;
import structure.bill;
import structure.crop;



//@WebServlet(name = "db", urlPatterns = {"/db"})
       public class billdb
               
        {
            
            public static int registerbill(farmer fd,customer ub,bill bd,crop cr)             
            {
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";
               // System.out.println("hi 1 ");
                Connection con;
                int i = 0 ;
                String sql="insert into bill(bid,crname,fid,cust_id,quantity,amount) values (?,?,?,?,?,?)";
                
               // System.out.println("hi 2");
              
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url, username, password);
                    PreparedStatement stm = con.prepareStatement(sql);
                    stm.setString(1,bd.getbid());
                    stm.setString(2,cr.getcrname());
                    stm.setString(3,fd.getfid());
                    stm.setString(4,ub.getName());
                    stm.setString(5,bd.getquantity());
                    stm.setString(6,bd.getamount());  
                    
                   // System.out.println("hi 3");
                    i = stm.executeUpdate();
                    //System.out.println("hi 4");
                }
                  
                catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(billdb.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) 
                {
                    Logger.getLogger(billdb.class.getName()).log(Level.SEVERE, null, ex);
                }
                catch(Exception ex){}  

              return i;
            }


                
           
    }

   

