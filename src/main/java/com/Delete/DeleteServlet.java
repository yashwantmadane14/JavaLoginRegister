package com.Delete;

import java.io.IOException;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import com.DBConnect.DBConnect;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection con = null;
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			con = DBConnect.createConnection();
			Statement statement = con.createStatement();

			String sql = "DELETE FROM login WHERE id = " + id;
			int affectedRows = statement.executeUpdate(sql);

			if (affectedRows > 0) {
				// Record deleted successfully
				response.sendRedirect("list.jsp");
			} else {
				// Record not found or deletion failed
				response.sendRedirect("index.jsp");
			}

			statement.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
			// Handle database errors here
		}
	}
}
