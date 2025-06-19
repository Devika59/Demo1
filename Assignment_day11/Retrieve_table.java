package Project;

import java.sql.Connection;		
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
	import java.sql.Statement;

	public class Retrieve_table {

		public static void main(String[]args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/test_db";
			String username="root";
			String password="";
			Connection con=DriverManager.getConnection(url, username, password);
			Statement stmt=con.createStatement();
			String query="Select*from student";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+ " ");
			}
			
		}
	}
	









