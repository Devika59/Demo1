package Project;

	import java.sql.Connection;	
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class insert_rows {
		public static void main(String[]args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test_db";
			String username="root";
			String password="";
			Connection con=DriverManager.getConnection(url, username, password);
			Statement stmt=con.createStatement();
			String query="insert into student values(1,'Devika',20),(2,'Manisha',19),(3,'Sahana',18),(4,'Narmatha',21) ";
			stmt.executeUpdate(query);
			System.out.println("inserted sucessfully");
		}
	}
	


