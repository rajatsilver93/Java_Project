<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="Header.jsp"%>
	<center>
	
		<%
			String msg = (String) request.getAttribute("msg");
		%>
		<form action="UserRegistrationCtl" method="post">
			
			<tr>
				<%
					if (msg != null) {
				%>
				<%=msg%>
				<%
					}
				%>
			</tr>
			<table>
				<h1>User Registration</h1>
				<tr>
					<th>firstName:</th>
					<td><input type="text" name="firstName"></td>
				</tr>
				<tr>
					<th>lastName:</th>
					<td><input type="text" name="lastName"></td>
				</tr>
				<tr>
					<th>loginId:</th>
					<td><input type="text" name="loginId"></td>
				</tr>
				<tr>
					<th>password:</th>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<th>DOB:</th>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<th>address:</th>
					<td><input type="text" name="address"></td>
				</tr>
				<td></td>
				<td><input type="submit" name="operation" value="register"></td>
			</table>
		</form>
	</center>
</body>
</html>