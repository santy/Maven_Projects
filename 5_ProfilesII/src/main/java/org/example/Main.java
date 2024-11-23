package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();

            try (InputStream input = Main.class.getClassLoader()
                    .getResourceAsStream("db.properties")) {

                if (input == null) {
                    System.out.println("Sorry, unable to find db.properties");
                    return;
                }

                properties.load(input);

                System.out.println("Database Configuration:");
                System.out.println("Driver: " + properties.getProperty("driverClassName"));
                System.out.println("URL: " + properties.getProperty("url"));
                System.out.println("Username: " + properties.getProperty("username"));
                System.out.println("Password: " + properties.getProperty("password"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

