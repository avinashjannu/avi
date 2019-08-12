package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.customer;


//@WebServlet(name = "db", urlPatterns = {"/db"})
       public class db
        {
            
            private static Connection connect()
            {
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";

                Connection con=null;
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(url, username, password);
                    
                }
                  
                catch (ClassNotFoundException ex) {
                    Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
                }
                 catch(Exception ex){}  
              return con;  
            }


                public static int register(customer ub)
            {
                int i = 0 ;
                String sql="insert into customer(cust_id,firstname,lastname,address,password,contact) values(?,?,?,?,?,?)";
                Connection con=connect();
                try
                {
                    
                    PreparedStatement stm = con.prepareStatement(sql);
                    
                    stm.setString(2,ub.getName());
                    stm.setString(1,ub.getname());
                    stm.setString(3,ub.getLast());
                    stm.setString(4,ub.getAddress());
                    stm.setString(5,ub.getPassword());  
                    stm.setString(6,ub.getContact());
                    i = stm.executeUpdate();
                }

                catch (SQLException ex) {
                    Logger.getLogger(db.class.getName()).log(Level.SEVERE, null, ex);
                }
                 catch(Exception ex){}  
                return i;
            }

    }

   

