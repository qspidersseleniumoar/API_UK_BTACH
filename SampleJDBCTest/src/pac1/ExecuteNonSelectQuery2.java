package pac1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class ExecuteNonSelectQuery2 {
	public static void main(String[] args) throws Throwable {
		Connection con = null;
		try {
			/*step 1 : load / register the mysql data base  */
				Driver driverRef = new Driver();
				DriverManager.registerDriver(driverRef);				
			/*step 2 : Connect to data base*/
				 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");				
		    /*step 3 : issue/ create SQL Statement */
				Statement stat = con.createStatement();
				String sql = "select * from project";
				
			/*step 4 : execute Query */
				  ResultSet result = stat.executeQuery(sql);
				     while (result.next()) {
					    System.out.println(result.getString(1) + "\t" + result.getString(2) + "\t"+result.getInt(6));					
				      }
		}catch (Exception e) {
			System.out.println("handle the Problems");
		}finally {
			/*step 5 : close the connection*/
			  con.close();}    
	}   
}
