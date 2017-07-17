package dbconnect;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DbConnect {
	
	public static Connection connectToDatabase() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/addressBook";
		String user = "root";
		String password = "password";
	
		return DriverManager.getConnection(url, user, password);
	}
	
	
}
