package database;


import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import structure.crop;


public class updatedetaildb
{
    public static int updatedetail(crop cr)
    {
                String url="jdbc:mysql://localhost:3306/agriculture";
                String username="root";
                String password="root";
                Connection con;
                int i=0;
                ResultSet rs=null;
	//Connection con=connect();
            String sql="update crop_details set admin_status=? where crq_id=?";
	
            try
               {   
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, username, password);
			
                System.out.println("crop request id:"+cr.getcrq_id());
                System.out.println("Status:"+cr.getstatus());
                
		PreparedStatement stm=con.prepareStatement(sql);
                
                stm.setString(1, cr.getstatus());
		stm.setString(2, cr.getcrq_id());
                
               


                //stm.setString(7,ub.getName()); //for: "where username=?"
                System.out.println("str:"+sql   );


                 i=stm.executeUpdate();

                System.out.println("VALUE OF i is" +i);

	}       catch (ClassNotFoundException ex) 
                {
                     Logger.getLogger(updatedetaildb.class.getName()).log(Level.SEVERE, null, ex);
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(updatedetaildb.class.getName()).log(Level.SEVERE, null, ex);
                   // ex.printStackTrace();
                }
		
		catch(Exception ex)
                {}
			
        return i;
    }

}