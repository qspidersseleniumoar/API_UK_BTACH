package pac1;

import java.sql.SQLException;

import org.testng.annotations.Test;

import pac.lib.DatabaseLib;

public class UnitTest {
   @Test
   public void deleteProject() throws SQLException {
	   
	   DatabaseLib lib = new DatabaseLib();
	    lib.executeNonSelectQuery("delete from project where project_id='TY_PROJ_303'");
	    lib.executeNonSelectQuery("delete from project where project_id='TY_PROJ_304'");
   }
   
}
