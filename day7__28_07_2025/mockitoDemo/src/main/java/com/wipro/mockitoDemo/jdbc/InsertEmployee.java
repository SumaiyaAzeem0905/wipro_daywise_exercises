package com.wipro.mockitoDemo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmployee {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "root";

        String sql = "INSERT INTO employee (emp_name, department) VALUES (?, ?)";
        try(Connection conn = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "John");
            ps.setString(2, "HR");
            int r = ps.executeUpdate();
            System.out.println(r + " rows inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
