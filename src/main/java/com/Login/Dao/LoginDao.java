package com.Login.Dao;

import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Login.Bean.LoginBean;
import com.DBConnect.DBConnect;

public class LoginDao {
	public String Validate(LoginBean loginBean) {
	
		String username = loginBean.getUsername(); // Assign user entered values to temporary variables.
		String password = loginBean.getPassword();

		Connection con = null;
		Statement statement = null;
		ResultSet resultSet = null;

		String userNameDB = "";
		String passwordDB = "";

		try {
			con = DBConnect.createConnection(); // Fetch database connection object
			statement = con.createStatement(); // Statement is used to write queries. Read more about it.
			resultSet = statement.executeQuery("select uname,password from login"); // the table name is users and
																					// userName,password are
																					// columns. Fetching all the
																					// records and storing in a
																					// resultSet.

			while (resultSet.next()) // Until next row is present otherwise it return false
			{
				userNameDB = resultSet.getString("uname"); // fetch the values present in database
				passwordDB = resultSet.getString("password");

				if (username.equals(userNameDB) && password.equals(passwordDB)) {
					System.out.println("Credential matched");
					return "SUCCESS"; //// If the user entered values are already present in the database, which means
										//// user has already registered so return a SUCCESS message.
				} 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Invalid Username and Password");
		return   "Invalid user credentials"; // Return appropriate message in case of failure
	}
}
