package InsertClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.util.Properties;

import com.mysql.jdbc.Driver;

import java.sql.SQLException;
import java.sql.Statement;


public class TestInsert4 {
	public static void main(String[] args) {
		
		try {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		FileInputStream fis = new FileInputStream("mydbinfo.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String url = "jdbc:mysql://localhost:3306/jdbc_intro";
		Connection connection = DriverManager.getConnection(url,properties);
		System.out.println("connected");
		Statement statement =connection.createStatement();
		
		
		System.out.println("connected");
		String sql = "INSERT INTO Student(id,name,course,email)"+"VALUES" + "(0,'Yamiwjiewj','Husahsc','yshciyay@gmail.com')";
		int res = statement.executeUpdate(sql);
		connection.close();
	
		}
		catch(SQLException |IOException e)
		    {
			e.printStackTrace();
			}
		
	}

}
