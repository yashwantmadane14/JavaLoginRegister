package com.Update.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.DBConnect.DBConnect;

import com.Update.Bean.UpdateBean;

public class UpdateDao {
	public String UpdateStudent(UpdateBean updatebean) {
		
		int id = Integer.parseInt(updatebean.getId());
		String name = updatebean.getName();
		String email = updatebean.getEmail();
		String password = updatebean.getPassword();
		Connection con = null;
		PreparedStatement statement;
		System.out.println("from dao "+id);
		try {
			con = DBConnect.createConnection();
			statement = con.prepareStatement("UPDATE login SET uname = ?, email = ?, password = ? WHERE id ="+id);
		
			statement.setString(1, name);
			statement.setString(2, email);
			statement.setString(3, password);
			

			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Updated";
	}
}
