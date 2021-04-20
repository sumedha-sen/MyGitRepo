<%@page import="com.te.sprmvc.beans.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp"%>
<%
	String msg = (String) request.getAttribute("msg");

	EmployeeBean bean=(EmployeeBean)request.getAttribute("data");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Form</title>
</head>
<body>
	<%
		if (bean!=null) {
	%>
	<h2 User id:><%=bean.getId()%></h2>
	<h2 Name:><%=bean.getName()%></h2>
	<h2 Dob:><%=bean.getDob()%></h2>
	<%
		}
	%>

	<h1>
		<fieldset>
			<legend>Login</legend>
			<form action="./search" method="">
				<tr>
					<td>Search</td>
					<td>:</td>
					<td><input type="text" name="id"></td>
				</tr>


				<tr>

					<td><input type="submit" value="search"></td>
				</tr>
			</form>

		</fieldset>
	</h1>

</body>
</html>