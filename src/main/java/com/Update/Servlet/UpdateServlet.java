package com.Update.Servlet;

import java.io.IOException;

import com.Update.Bean.UpdateBean;
import com.Update.Dao.UpdateDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UpdateBean updatebean = new UpdateBean();

		updatebean.setName(name);
		updatebean.setEmail(email);
		updatebean.setPassword(password);
		updatebean.setId(id);
		UpdateDao uptetedao = new UpdateDao();
		String uservalidate = uptetedao.UpdateStudent(updatebean);
		if (uservalidate.equals("Updated")) {
			request.getRequestDispatcher("/list.jsp").forward(request, response);

		} else {
			request.getRequestDispatch	er("/welcome.jsp").forward(request, response);
		}

	}

}
