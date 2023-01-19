package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDatabase {

	public static void main(String[] args) throws SQLException {
		//Step 1: Create an instance for driver
		//Driver should be imported from com.mysql.cj.jdbc.driver
		Driver dbDriver=new Driver();
		
		//step 2: Register to the dbDriver
		//DriverManager is in java.sql package
		DriverManager.registerDriver(dbDriver);
		
		//Step 3: Establish Database connection
		//connection should be imported from java.sql.package
		//MySql url
		Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium","root", "root");
		
		//Step 4: Create statement
		//Statement should be imported from java.sql package
		Statement statement=connect.createStatement();
		
		//Step 5: Execute query to fetch data
		ResultSet result=statement.executeQuery("select*from students;");
		
		
		
		
		while(result.next()) {
			System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
			
			
				}
		//Step 6:Close database
         connect.close();
	}

}
