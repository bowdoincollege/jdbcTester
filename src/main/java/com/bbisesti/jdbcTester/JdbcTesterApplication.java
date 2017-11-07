package com.bbisesti.jdbcTester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class JdbcTesterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcTesterApplication.class, args);
		
		
		System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;

        }

        System.out.println("Oracle JDBC Driver Registered!");

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
            		"jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=dev-oraerp.bowdoin.edu)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=TEST.bowdoin.edu)))","USER","PASSWORD");

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
	}
}
