package dynamicCRUDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc_intro";
			String user = "root";
			String pass = "root";
			Connection connection = DriverManager.getConnection(url,user,pass);
			
			String query = "INSERT INTO student VALUES(?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1,101 );
			ps.setString(2, "Anie");
			ps.setString(3, "Yyy");
			ps.setString(4, "uu8990@gmail.com");
			
			int res = ps.executeUpdate();
			System.out.println(res);
			connection.close();
			} catch (ClassNotFoundException | SQLException e)
		    {
		    e.printStackTrace();
		    }
		
	}

}
