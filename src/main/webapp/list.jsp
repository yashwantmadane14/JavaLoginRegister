<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.DBConnect.DBConnect"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.SQLException"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
th, td {
	padding: 10px
}
</style>
<meta charset="UTF-8">
<title>users list</title>
</head>
<body style="background-color: rgb(28, 28, 28)">
	<div style="text-align: center; color: white">
		<h1>Users List</h1>
		<div>

			<table
				style="text-align: center; margin-left: auto; margin-right: auto;"
				border=1>
				<tr>
					<th><font style="font-size: 20px"> ID</font></th>
					<th><font style="font-size: 20px"> UserName</font></th>
					<th><font style="font-size: 20px"> Email</font></th>
					<th><font style="font-size: 20px"> Password</font></th>
					<th><font style="font-size: 20px"> Action</font></th>
				</tr>
				<%
				try {
					Connection con = DBConnect.createConnection(); // Fetch database connection object
					Statement statement = con.createStatement(); // Statement is used to write queries. Read more about it.
					ResultSet resultSet = statement.executeQuery("select *from login"); // the table name is users and
					// userName,password are
					// columns. Fetching all the
					// records and storing in a
					// resultSet.

					while (resultSet.next()) // Until next row is present otherwise it return false
					{
						// fetch the values present in database
				%>
				<tbody style="border: groove">
					<tr>
						<td><%=resultSet.getString("id")%></td>
						<td><%=resultSet.getString("uname")%></td>
						<td><%=resultSet.getString("email")%></td>
						<td><%=resultSet.getString("password")%></td>
						<td><a href="update.jsp?id=<%=resultSet.getString("id")%>"><button>EDIT</button></a>
							<a href="DeleteServlet?id=<%=resultSet.getString("id")%>"><button>DELETE</button></a></td>
					</tr>

				</tbody>

				<%
				}
				} catch (SQLException e) {
				e.printStackTrace();
				}
				%>

			</table>

		</div>
	</div>
</body>
</html>