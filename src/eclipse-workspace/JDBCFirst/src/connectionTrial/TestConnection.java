package connectionTrial;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

public class TestConnection {
	public static void main(String[] args) {
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection
	("jdbc:mysql://localhost:3306/JDBC_intro","root","root");
	System.out.println("connected");
		}catch(Exception e) {
			e.printStackTrace();
		}
	
}
}
