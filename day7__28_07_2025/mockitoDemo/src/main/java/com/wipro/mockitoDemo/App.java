package com.wipro.mockitoDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class App 
{
    public static void main( String[] args )
    {
    	 String url = "jdbc:mysql://localhost:3306/wiprodemo"; 
         String user = "root";
         String password = "root";
         String sql = "INSERT INTO employee (emp_name, department) VALUES (?, ?)";
         try {
           
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.setString(1, "John Doe");
             pstmt.setString(2, "HR");
             int rowsInserted = pstmt.executeUpdate();
             if (rowsInserted > 0) {
                 System.out.println("Record inserted successfully!");
             }
             pstmt.close();
             conn.close();
         } catch (ClassNotFoundException e) {
             System.out.println("MySQL JDBC Driver not found.");
             e.printStackTrace();
         } catch (SQLException e) {
             System.out.println("Database error occurred.");
             e.printStackTrace();
         }
   
    }
}
