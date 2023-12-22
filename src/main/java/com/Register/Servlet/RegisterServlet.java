package com.Register.Servlet;

import java.io.IOException;

import com.Register.Bean.RegisterBean;
import com.Register.Dao.RegisterDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		RegisterBean regsiterbean = new RegisterBean();

		regsiterbean.setName(name);
		regsiterbean.setEmail(email);
		regsiterbean.setPassword(password);

		RegisterDao registerdao = new RegisterDao();
		String uservalidate = registerdao.regsiterStudent(regsiterbean);

		if (uservalidate.equals("ADDED")) {
			request.getRequestDispatcher("/index.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		}
	}

}
