package pac.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseLib {
	
	public ResultSet executeSelectQuery(String query) throws SQLException {
				Connection con = null;
				 ResultSet result = null;
				try {
					/*step 1 : load / register the mysql data base  */
						Driver driverRef = new Driver();
						DriverManager.registerDriver(driverRef);				
					/*step 2 : Connect to data base*/
						 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");				
				    /*step 3 : issue/ create SQL Statement */
						Statement stat = con.createStatement();
						
						
					/*step 4 : execute Query */
						   result = stat.executeQuery(query);
						     while (result.next()) {
							    System.out.println(result.getString(1) + "\t" + result.getString(2) + "\t"+result.getInt(6));					
						      }
				}catch (Exception e) {
					System.out.println("handle the Problems");
				}finally {
					/*step 5 : close the connection*/
					  con.close();
					  }    
	return result;
	}
	
   public int executeNonSelectQuery(String query) throws SQLException {
		   Connection con = null;
			int result = 0;
			try {
				/*step 1 : load / register the mysql data base  */
					Driver driverRef = new Driver();
					DriverManager.registerDriver(driverRef);				
				/*step 2 : Connect to data base*/
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");				
			    /*step 3 : issue/ create SQL Statement */
					Statement stat = con.createStatement();

					
				/*step 4 : execute Query */
					   result = stat.executeUpdate(query) ;
					if(result==1) {
						System.out.println("project is deleted==PASS");
					}else {
						System.err.println("project is not exits==FAIL");
					}
					
			}catch (Exception e) {
				System.out.println("handle the Problems");
			}finally {
				/*step 5 : close the connection*/
				  con.close();
				  }
			return result;
			
		
	}

}
