package InsertClass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class TestInsert3 {
	public static void main(String[] args) {
		
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			String url = "jdbc:mysql://localhost:3306/jdbc_intro"
					 + "?user = root & password = root";
			String user = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,user,password);
			Statement statement =connection.createStatement();
			
			DriverManager.getConnection(url);
			System.out.println("connected");
			String sql = "INSERT INTO Student(id,name,course,email)"+"VALUES" + "(9,'Yaha','Huay','yam_huay@gmail.com')";
			int res = statement.executeUpdate(sql);
			connection.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
