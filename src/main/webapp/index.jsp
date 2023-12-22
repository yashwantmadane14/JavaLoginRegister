<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<!--    -->
<body style="background-color: rgb(28, 28, 28)">

	<div style="text-align: center; color: white">
		<h1>Login Page</h1>
		<div>
			<form action="LoginServlet" method="post">
				<table
					style="text-align: center; margin-left: auto; margin-right: auto; " >
					<tr>
						<td><font style="font-size: 20px"> User-name :</font></td>
						<td><input type="text" name="username"
							style="padding: 7px 20px"></td>
					</tr>
					<tr>
						<td><font style="font-size: 20px"> Password :</font></td>
						<td><input type="text" name="password"
							style="padding: 7px 20px"></td>
					</tr>
					<tr>
						<td><a href="register.jsp">Register</a></td>
						<td><button style="font-size: 18px">Login</button></td>
					</tr>
					<tr>
						<td><a href="list.jsp">Users List</a></td>
						<td></td>
					</tr>
				</table>
			</form>
		</div>
	</div>


</body>
</html>