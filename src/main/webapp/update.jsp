<%@page import="com.DBConnect.DBConnect"%>
<%@page import="com.Register.Dao.RegisterDao"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.Register.Bean.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Form</title>
</head>

<body style="background-color: rgb(28, 28, 28)">
	<%
RegisterDao dao = new RegisterDao();
int id = Integer.parseInt(request.getParameter("id"));
System.out.println("Hello "+id);
RegisterBean data = dao.updateData(id);
%>
	<div>
		<div style="color: white">
			<form action=UpdateServlet method=post>
			 <input type="hidden" name="id" value="<%= id %>">
				<table
					style="margin-left: auto; margin-right: auto; font-size: 20px">
					<thead>
						<tr>
							<th>Enter The Details</th>
						</tr>
					</thead>

					<tbody>
						<tr>
							<td>Email ID :</td>
							<td><input style="padding: 7px 20px" type="text"
								name="email" required="required" value="<%= data.getEmail()%>"></td>
						</tr>
						<tr>
							<td>Name/username :</td>
							<td><input style="padding: 7px 20px" type="text" name="name"
								required="required" value=<%= data.getName()%>></td>
						</tr>
						<tr>
							<td>Password :</td>
							<td><input style="padding: 7px 20px" type="text"
								name="password" value="<%=data.getPassword()%>"></td>
						</tr>
						<tr>
							<td></td>
							<td><button style="font-size: 18px">Submit</button></td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</div>
</body>
</html>