package com.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static Connection createConnection() {
		Connection con = null;

		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); // loading mysql driver
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", ""); // attempting to
																									// connect to MySQL
																									// database
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
