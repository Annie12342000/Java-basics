package dynamicCRUDoperation;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;

	public class TestSelect {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String url = "jdbc:mysql://localhost:3306/jdbc_intro";
				String user = "root";
				String pass = "root";
				Connection connection = DriverManager.getConnection(url,user,pass);
				
				//String query = "SELECT * FROM student";
				String query = " SELECT * FROM student WHERE course = ?";
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setString(1, "HTML");
				ResultSet resultSet = ps.executeQuery();
				System.out.println(resultSet);
				
				
				while(resultSet.next())
				{
					System.out.println(resultSet.getInt(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString(3));
					System.out.println(resultSet.getString(4));
					System.out.println("-------------------------");
					
				}
				
				connection.close();
				} catch (ClassNotFoundException | SQLException e)
			    {
			    e.printStackTrace();
			    }
			
		}

	}



