
<%@page import="in.co.rays.bean.Userbean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Userbean bean = (Userbean) request.getAttribute("bean");
	%>
	<center>
		<form action="UserRegistrationCtl" method="post">
			<%@include file="Header.jsp"%>
			<h1>Update User</h1>
			<table>
				<tr>

					<th><input type="hidden" name="id" value="<%=bean.getId()%>"></th>
				</tr>
				<tr>
					<th>First Name</th>
					<th><input type="text" name="firstName"
						value="<%=bean.getFirstName()%>"></th>
				</tr>
				<tr>
					<th>Last Name</th>
					<th><input type="text" name="lastName"
						value="<%=bean.getLastName()%>"></th>
				</tr>
				<tr>
					<th>Login ID</th>
					<th><input type="text" name="loginId"
						value="<%=bean.getLoginId()%>"></th>
				</tr>
				<tr>
					<th>DOB</th>
					<th><input type="date" name="dob" value="<%=bean.getDob()%>"></th>
				</tr>
				<tr>
					<th>Address</th>
					<th><input type="text" name="address"
						value="<%=bean.getAddress()%>"></th>
				</tr>
				<tr>
					<th>Password</th>
					<th><input type="text" name="password"
						value="<%=bean.getPassword()%>"></th>
				</tr>
				<tr>
					<td></td>
					<th><input type="submit" name="operation" value="update"></th>
					<th><input type="submit" name="operation" value="list"></th>
				</tr>
			</table>
		</form>

	</center>
</body>
</html>