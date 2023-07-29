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
	<%@include file="Header.jsp"%>
	<center>
		<form action="LoginCtl" method="post">


			<%
				String msg = (String) request.getAttribute("msg");
				String uri = (String) request.getAttribute("uri");
			%>
			<table>
				<h1>Login</h1>
				<%
					if (msg != null) {
				%>

				<%=msg%>
				<%
					}
				%>
				<tr>
					<th>loginId:</th>
					<td><input type="text" name="loginId"></td>
				</tr>
				<tr>
					<th>password:</th>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<th></th>
					<th><input type="submit" name="operation" value="signIn">
						<input type="submit" name="operation" value="signUp"></th>
					<td>
				</tr>
			</table>
			<input type="hidden" name="uri" value="<%=uri%>">

		</form>
	</center>
	<%@include file="Footer.jsp"%>

</body>
</html>