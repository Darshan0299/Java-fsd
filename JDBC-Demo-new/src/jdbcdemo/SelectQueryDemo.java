package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//we should connect to the db
				//  1.load the db jdbc driver
				
				Class.forName("com.mysql.cj.jdbc.Driver");  // it is mandatory line  // it is the first line in the process of connecting to db
				
				// 2. connect to db --. use class DriverManager and method getConnection(DBURL,username,password)
				
				String dburl = "jdbc:mysql://localhost:3306/animated_movies";  //1st variable
				String username = "root";
				String password = "Dar02shan08@99";
				
				Connection con = DriverManager.getConnection(dburl, username, password);
				
				System.out.println("successfully connected the database");
				
				//Run a query on the db
				
				String query =  "select * from movies";
				
				//send query to the db
				
				Statement stmt = con.createStatement();
					
					// excute the query and fetch the output and store it in a obj of type result
					
				ResultSet rs = stmt.executeQuery(query);
				
				//print all the rows on the console
				
				while(rs.next())
				{
					System.out.print("Title: " + rs.getString("title") + "\t");
					System.out.print("genre: " + rs.getString("genre") + "\t");
					System.out.print("Director: " + rs.getString("Director") + "\t");
					System.out.println("release_year: " + rs.getString("release_year") + "\t");
					
				}
				
				// Close the conncection
				
				
				con.close();
				
				


	}

}
