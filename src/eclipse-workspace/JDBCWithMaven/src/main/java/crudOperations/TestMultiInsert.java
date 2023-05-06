package crudOperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMultiInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = " jdbc:mysql://localhost:3306/jdbc_intro";
			String user = "root";
			String pass = "root";
			Connection connection = DriverManager.getConnection(url,user,pass);
			Statement s = connection.createStatement();
			s.addBatch("INSERT INTO student VALUES(1,'lily','a','si')");
			s.addBatch("INSERT INTO student VALUES(2,'lily','a','si1')");
			s.addBatch("INSERT INTO student VALUES(3,'lily','a','si2')");
			s.addBatch("INSERT INTO student VALUES(4,'lily','a','si3')");
			s.addBatch("INSERT INTO student VALUES(5,'lily','a','si4')");
			int [] res = s.executeBatch();
		//	s.clearBatch();
			System.out.println(res.length);
			connection.close();
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
