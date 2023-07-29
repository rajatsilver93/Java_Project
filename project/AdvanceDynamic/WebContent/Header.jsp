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
		Userbean bean1 = (Userbean) session.getAttribute("user");

		if (bean1 != null) {
	%>
	<h4>
		<a href="LoginCtl?operation=logout">Logout</a>
	</h4>


	<%
		} else {
	%>
	<!-- <a href="LoginCtl">Login</a> -->

	<%
		}
	%>

	<tr>
		<td>
			<%
				if (bean1 != null) {
			%>
			<h3>
				Hii,
				<%=bean1.getFirstName()%></h3> <a href="UserRegistrationCtl"><b>Add
					User</b></a> | <a href="UserListCtl.do"><b>User List</b></a> <%
 	} else {
 %>
			<h3>Hi, Guest</h3> <%
 	}
 %>
		</td>
	</tr>
	<hr>
</body>
</html>