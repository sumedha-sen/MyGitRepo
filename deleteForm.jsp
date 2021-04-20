<%@page import="com.te.sprmvc.beans.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
<%@ include file="header.jsp" %>
<%
	String msg = (String) request.getAttribute("msg");

	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Form</title>
</head>
<body>
	<%
		if (msg!=null && !msg.isEmpty()) {
	%>
	<h2 User id:><%=msg%></h2>

	<%
		}
	%>

	<h1>
		<fieldset>
			<legend>Login</legend>
			<form action="./delete" method="">
				<tr>
					<td>Delete id</td>
					<td>:</td>
					<td><input type="text" name="id"></td>
				</tr>


				<tr>

					<td><input type="submit" value="delete"></td>
				</tr>
			</form>

		</fieldset>
	</h1>

</body>
</html>