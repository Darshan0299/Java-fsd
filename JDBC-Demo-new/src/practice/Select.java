package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		

		Class.forName("com.mysql.cj.jdbc.Driver");  // it is mandatory line  // it is the first line in the process of connecting to db
		
		// 2. connect to db --. use class DriverManager and method getConnection(DBURL,username,password)
		
		String dburl = "jdbc:mysql://localhost:3306/myproducts";  //1st variable
		String username = "root";
		String password = "Dar02shan08@99";
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		System.out.println("successfully connected the database");
		
		//Run a query on the db
		
		String query =  "select * from products where product_id = 101";
		
		//send query to the db
		
		Statement stmt = con.createStatement();
			
			// excute the query and fetch the output and store it in a obj of type result
			
		ResultSet rs = stmt.executeQuery(query);
		
		//print all the rows on the console
		
		while(rs.next())
		{
			System.out.print("product_id: " + rs.getString("product_id") + "\t");
			System.out.print("qty: " + rs.getString("qty") + "\t");
			System.out.println("price: " + rs.getString("price") + "\t");
			
		}
		
		// Close the conncection
		
		
		con.close();

	}

}
