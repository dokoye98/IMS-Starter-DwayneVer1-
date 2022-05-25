package com.qa.ims;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Stream;



public class DBConfig {
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306/ims3?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	final String USER = "root";
	final String PASSWORD = "root";
	Connection conn;
	Statement stmt;

	public Connection connect() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("connected to database");
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return conn;


	}

	
	
}
