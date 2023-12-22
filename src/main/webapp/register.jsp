<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body style="background-color: rgb(28, 28, 28)">
	<div>
		<div style="color: white">
			<form action=RegisterServlet method=post>
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
								name="email" required="required"></td>
						</tr>
						<tr>
							<td>Name/username :</td>
							<td><input style="padding: 7px 20px" type="text" name="name" required="required"></td>
						</tr>
						<tr>
							<td>Password :</td>
							<td><input style="padding: 7px 20px" type="text"
								name="password"></td>
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