package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.admin;

public class alogindb
{
    public static ResultSet login_admin(admin ad, String sql)
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
			stm.setString(1,ad.getid());
			stm.setString(2,ad.getpassword());
			rs=stm.executeQuery();
		}
                catch (ClassNotFoundException ex) 
                {
                     Logger.getLogger(alogindb.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(alogindb.class.getName()).log(Level.SEVERE, null, ex);
                    ex.printStackTrace();
                }
		
		catch(Exception ex)
                {}
					

		return rs;
	}
}

