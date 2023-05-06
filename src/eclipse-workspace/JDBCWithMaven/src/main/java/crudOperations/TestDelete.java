package crudOperations;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.Connection;

public class TestDelete {
	public static void main(String[] args) {
		try {
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		FileInputStream fis = new FileInputStream("mydbinfo.properties");
		Properties properties = new Properties();
		properties.load(fis);
		
		String url = "jdbc:mysql://localhost:3306/jdbc_intro";
				 
		Connection connection = DriverManager.getConnection(url, properties);
		Statement statement = connection.createStatement();
		String query = "DELETE FROM student WHERE name = 'Yamaha'";
		int res = statement.executeUpdate(query);
		System.out.println("no. of rows deleted=" +res);
		connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
