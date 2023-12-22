package com.Register.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DBConnect.DBConnect;
import com.Register.Bean.RegisterBean;

public class RegisterDao {
	public String regsiterStudent(RegisterBean registerBean) {

		String name = registerBean.getName();
		String email = registerBean.getEmail();
		String password = registerBean.getPassword();

		Connection con = null;
		PreparedStatement statement;
		try {
			con = DBConnect.createConnection();
			statement = con.prepareStatement("INSERT INTO login (uname, email, password) VALUES (?,?,?)");

			statement.setString(1, name);
			statement.setString(2, email);
			statement.setString(3, password);

			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "ADDED";
	}

	public RegisterBean updateData(int id) {
		RegisterBean rb = null;
		Connection con = null;
		try {
			con = DBConnect.createConnection();
			String query = "select * from login where id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				rb = new RegisterBean();
				rb.setName(rs.getString("uname"));
				rb.setEmail(rs.getString("email"));
				rb.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return rb;
	}

}
