package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.cust_requirement;


public class updatereqdb
{
    public static int updatereq(cust_requirement rq)
    {
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";
                Connection con;
                int i=0;
                ResultSet rs= null;
	//Connection con=connect();
            String sql="update cust_requirement set admin_status=? where cust_id=? and cname=?";
	
            try
               {   
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, username, password);
			
                System.out.println("Customer id:"+rq.getcust_id());
                System.out.println("crop name:"+rq.getcname());
                System.out.println("Status:"+rq.getstatus());
                
		PreparedStatement stm=con.prepareStatement(sql);
                
                stm.setString(1, rq.getstatus());
                
		stm.setString(2, rq.getcust_id());
                
                stm.setString(3, rq.getcname());
                
                
               


                //stm.setString(7,ub.getName()); //for: "where username=?"
                System.out.println("str:"+sql   );


                 i=stm.executeUpdate();

                System.out.println("VALUE OF i is" +i);

	}       catch (ClassNotFoundException ex) 
                {
                     Logger.getLogger(updatereqdb.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(updatereqdb.class.getName()).log(Level.SEVERE, null, ex);
                   // ex.printStackTrace();
                }
		
		catch(Exception ex)
                {}
			
        return i;
    }

}