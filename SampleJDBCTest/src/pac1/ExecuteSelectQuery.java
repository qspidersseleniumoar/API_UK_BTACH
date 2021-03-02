package pac1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class ExecuteSelectQuery {
	public static void main(String[] args) throws Throwable {
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
				String sql = "delete from project where project_id='TY_PROJ_604'";
				
			/*step 4 : execute Query */
				   result = stat.executeUpdate(sql) ;
				if(result==1) {
					System.out.println("project is deleted==PASS");
				}else {
					System.err.println("project is not exits==FAIL");
				}
				
		}catch (Exception e) {
			System.out.println("handle the Problems");
		}finally {
			/*step 5 : close the connection*/
			  con.close();}    
	}   
}
