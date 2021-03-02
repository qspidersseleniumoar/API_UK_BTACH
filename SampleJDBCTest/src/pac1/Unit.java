package pac1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import pac.lib.DatabaseLib;

public class Unit {
	
	@Test
	public void checkCustomerInProjectDB() throws Throwable {
	  boolean flag = false;
	  String expectedProject = "hdfc";
		
		DatabaseLib lib = new DatabaseLib();
		  ResultSet result = lib.executeSelectQuery("select * from project");
		
		   while(result.next()) {
			   String actProjectNAme = result.getString(4);
			   if(actProjectNAme.equals(expectedProject)) {
				   flag =true;
				   break;
			   }
		   }
	     if(flag==true) {
	    	 System.out.println(expectedProject + "==> is availbale in db");
	     }else {
	    	 System.out.println(expectedProject + "==> is not availbale  in db==FAIL");
	     }
		   Assert.assertEquals(flag, true);
	}
	

}
