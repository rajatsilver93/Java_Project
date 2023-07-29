<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Welcome.jsp" method="post">
		<table>
			<tr>
				<th>firstName:</th>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<th>lastName:</th>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<th>logInId:</th>
				<td><input type="text" name="logInId"></td>
			</tr>
			<tr>
				<th>password:</th>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<th>address:</th>
				<td><input type="text" name="address"></td>
			</tr>
			<td></td>
			<td><input type="submit" value="submit"></td>
		</table>
	</form>
</body>
</html>