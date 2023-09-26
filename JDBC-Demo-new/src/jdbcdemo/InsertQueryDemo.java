package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQueryDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//String query = "Insert into movies values ('movie1', 'comedy' , 'director', '1985')";
				String dburl = "jdbc:mysql://localhost:3306/animated_movies";  //1st variable
				String username = "root";
				String password = "Dar02shan08@99";
				
				//load the jdbc driver driver
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//make connection with the db
				
				Connection con = DriverManager.getConnection(dburl, username, password);
				
				// PreparedStataement --> used for executing insert query with parameters
				
				String title = "newmovie";
				String genre = "Comedy";
				String director = "Dir1";
				String release_year = "1999";
				
				
				
				
				// con.prepareStatement("Insert into movies values ('movie1', 'comedy' , 'director', '1985')");
				PreparedStatement ps  = con.prepareStatement("Insert into movies values (?,?,?,?)");
				
				//ps.setString(indexno, columnname)
				
				ps.setString(1, title);
				ps.setString(2, genre);
				ps.setString(3, director);
				ps.setString(4, release_year);
				ps.executeUpdate();
				
				con.close();
				
				
				


	}

}
