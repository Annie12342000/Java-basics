package connectionTrial;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlDeveloper {
	public static void main(String[] args) {
		try {
			Class.forName("com.oracle.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection
		              ("jdbc:oracle:thin:@myhost:1521:orcl", "scott", "tiger");

			System.out.println("connected");
				}catch(Exception e) {
					e.printStackTrace();
				}
			
	}

}
