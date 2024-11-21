package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        String host = "database-1.cluster-czjohtpyuadz.us-east-1.rds.amazonaws.com";
        String dbName = "database1"; // Replace with your actual database name
        String url = "jdbc:mysql://" + host + ":3306/" + dbName;

        Properties properties = new Properties();
        properties.setProperty("user", "admin");
        properties.setProperty("password", "administrador"); // Your actual password
        properties.setProperty("useSSL", "true");
        properties.setProperty("serverTimezone", "UTC");
        properties.setProperty("connectTimeout", "30000");
        properties.setProperty("allowPublicKeyRetrieval", "true");

        try {
            System.out.println("Attempting to connect to the database...");
            System.out.println("URL: " + url);

            Connection connection = DriverManager.getConnection(url, properties);
            System.out.println("Database connected successfully!");

            connection.close();
            System.out.println("Connection closed successfully!");

        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}




