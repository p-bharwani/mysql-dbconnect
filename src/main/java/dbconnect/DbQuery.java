package dbconnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class DbQuery {
	public static void main(String[] args){
		try(Connection connection = DbConnect.connectToDatabase();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT firstName, email FROM contact WHERE firstname=\"Marouane\"")){
			System.out.println("fName \t\temail");
			while(resultSet.next()){
				System.out.println(resultSet.getString("firstName") +"\t"
						+ resultSet.getString("email"));
			}
		}catch(SQLException e){
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
