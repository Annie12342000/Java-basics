package connectionTrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc_intro";
			String user = "root";
			String password = "root";
			Connection connection = DriverManager.getConnection(url,user,password);
			Statement statement =connection.createStatement();
			System.out.println("connected");
			String sql = "INSERT INTO Student(id,name,course,email)"+"VALUES" + "(1,'SubhaM','Love','anni_subham@gmail.com')";
			int res = statement.executeUpdate(sql);
//			System.out.println("no of rows " );
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}

}
