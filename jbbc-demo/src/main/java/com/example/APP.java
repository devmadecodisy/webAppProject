package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class APP {
    public static void main(String[] args) {
        // MySQL connection information
        String url = "jdbc:mysql://localhost:3306/testdb"; // db name = testdb
        String user = "root";  
        String password = "Vijayanand2005@";
        try {
            // 1. Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected Successfully!");
            // 2. Create SQL query
            String sql = "CREATE TABLE students (" +
                         "id INT PRIMARY KEY AUTO_INCREMENT, " +
                         "name VARCHAR(50), " +
                         "age INT)";
            // 3. Execute SQL
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully!");
            // 4. Close connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}