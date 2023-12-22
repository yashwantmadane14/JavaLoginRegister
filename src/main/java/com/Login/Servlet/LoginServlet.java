package com.Login.Servlet;

import java.io.IOException;

import com.Login.Bean.LoginBean;
import com.Login.Dao.LoginDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		RequestDispatcher rd;
		LoginBean loginbean = new LoginBean();

		loginbean.setUsername(username);
		loginbean.setPassword(password);
		/*
		 * we created a obj of login bean and passed the username and password values to
		 * getter and setter of private username and password
		 */
		LoginDao logindao = new LoginDao();
		String userValidate = logindao.Validate(loginbean);

		if (userValidate.equals("SUCCESS")) {
			request.setAttribute("username", username);
			rd = request.getRequestDispatcher("/welcome.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("Err measage", userValidate);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

}
