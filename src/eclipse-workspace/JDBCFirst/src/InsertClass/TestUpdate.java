package InsertClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (
		Connection connection = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/jdbc_intro"+ "?user = root & password = root");)
		{
		System.out.println("connected");
		Statement statement = connection.createStatement();
		String query = "UPDATE student SET name = 'Ram' WHERE " +"name = 'lily'";
		int res = statement.executeUpdate(query);
		System.out.println("no.of rows updated=" +res);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();		}
	}

}
