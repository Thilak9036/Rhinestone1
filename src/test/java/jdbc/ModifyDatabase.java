package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ModifyDatabase {

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
		
		//to modify data bases like inserting data
		int result1=statement.executeUpdate("insert into students(id,name,address)values(105,'xyz','Hyderabad')");
		if (result1==1) 
		
			{
				System.out.println("Db updated succesully");
			}
			else
			{
				System.out.println("DB is not updated");
			}
		
		
		
		//Step 6:Close database
         connect.close();
	}

}
