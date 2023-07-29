
<%@page import="java.beans.beancontext.BeanContext"%>
<%@page import="in.co.rays.bean.Userbean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
	<%
		String str = (String) session.getAttribute("update");
	%>
	<center>
		<h1>User List</h1>


		<form action="UserListCtl.do" method="post">


			<%
				Integer pageNo = (Integer) request.getAttribute("pageNo");
				List list = (List) request.getAttribute("list");
				Iterator it = list.iterator();
				int index = ((pageNo - 1) * 5) + 1;
			%>

			<tr>
				<td><input type="text" name="firstName"
					placeholder="Enter First Name"></td>
				<td><input type="date" name="dob" value="dob"></td>
				<td><input type="submit" name="operation" value="Search"></td>
			</tr>

			<table border="1">
				<tr>
					<th>Select</th>
					<th>Serial No.</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Login Id</th>
					<th>password</th>
					<th>DOB</th>
					<th>Address</th>
					<th>Edit</th>
				</tr>
				<%
					while (it.hasNext()) {
						Userbean bean = (Userbean) it.next();
				%>
				<tr>
					<th><input type="checkbox" name="ids"
						value="<%=bean.getId()%>"></th>
					<th><%=index++%></th>
					<td><%=bean.getFirstName()%></td>
					<td><%=bean.getLastName()%></td>
					<td><%=bean.getLoginId()%></td>
					<td><%=bean.getPassword()%></td>
					<td><%=bean.getDob()%></td>
					<td><%=bean.getAddress()%></td>
					<td><a href="UserRegistrationCtl?id=<%=bean.getId()%>">edit</a></td>


				</tr>
				<%
					}
				%>
			</table>

			<th><input type="submit" name="operation" value="previous"></th>
			<th><input type="submit" name="operation" value="next"></th>
			<th><input type="submit" name="operation" value="delete"></th>
			<input type="hidden" name="pageNo" value="<%=pageNo%>">
		</form>
		<%
			if (str != null) {
		%>
		<h1><%=str%></h1>
		<%
			}
		%>
	</center>
</body>
</html>