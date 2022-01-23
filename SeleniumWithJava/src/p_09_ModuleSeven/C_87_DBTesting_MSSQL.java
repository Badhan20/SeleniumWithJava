package p_09_ModuleSeven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C_87_DBTesting_MSSQL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{

		
			String dbURL = "jdbc:sqlserver://192.168.0.101:1433/TestDatabase";
			String username = "badhan";
			        String password = "Badhan@8753";
			        //Load MS SQL JDBC Driver
			        Class.forName("net.sourceforge.jtds.jdbc.Driver");
			        //Creating connection to the database
			        Connection con = DriverManager.getConnection(dbURL,username,password);
			        //Creating statement object
			     Statement st = con.createStatement();
			     String selectquery = "SELECT * FROM EmployeeDetails";
			        //Executing the SQL Query and store the results in ResultSet
			     ResultSet rs = st.executeQuery(selectquery);
			     //While loop to iterate through all data and print results
			     while (rs.next()) {
			     System.out.println(rs.getString("transaction_datetime"));
			     }
			        //Closing DB Connection
			     con.close();
		
	}

}
