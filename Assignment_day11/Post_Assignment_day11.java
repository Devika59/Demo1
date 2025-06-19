package Project;

import java.sql.*;
import java.util.Scanner;

public class Post_Assignment_day11 {
    static final String URL = "jdbc:mysql://localhost:3306/test_db";
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT DATABASE MENU =====");
            System.out.println("1. Insert Records");
            System.out.println("2. Delete Record by ID");
            System.out.println("3. Retrieve All Records");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insert();
                    break;
                case 2:
                    System.out.print("Enter student ID to delete: ");
                    int id = sc.nextInt();
                    delete(id);
                    break;
                case 3:
                    retrieve();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }

    public static void insert() throws SQLException {
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement stmt = con.createStatement();
        String query = "INSERT INTO student VALUES (1, 'Devika', 20), " +
                "(2, 'Manisha', 19), " +
                "(3, 'Sahana', 18), " +
                "(4, 'Narmatha', 21)";
        stmt.executeUpdate(query);
        System.out.println("Records inserted successfully.");
        con.close();
    }

    public static void delete(int id) throws SQLException {
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement stmt = con.createStatement();
        String query = "DELETE FROM student WHERE id=" + id;
        int rowsAffected = stmt.executeUpdate(query);

        if (rowsAffected > 0) {
            System.out.println("Record with ID " + id + " deleted successfully.");
        } else {
            System.out.println("No record found with ID " + id);
        }

        con.close();
    }

    public static void retrieve() throws SQLException {
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        System.out.println("\n--- Student Records ---");
        System.out.printf("%-5s %-15s %-5s\n", "ID", "Name", "Age");
        System.out.println("-------------------------------");

        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.printf("%-5d %-15s %-5d\n", id, name, age);
        }

        con.close();
    }
}
