package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import structure.farmer;

public class flogindb
{
    public static ResultSet login_farmer(farmer fd, String sql)
	{
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";
               
                Connection con;
                ResultSet rs=null;
		
		try
		{       
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection(url, username, password);
			PreparedStatement stm=con.prepareStatement(sql);
			stm.setString(1,fd.getfid());
			stm.setString(2,fd.getfpassword());
			rs=stm.executeQuery();


		}
                 catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(flogindb.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(flogindb.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
                 catch(Exception ex){}  
	
		return rs;
	}
}