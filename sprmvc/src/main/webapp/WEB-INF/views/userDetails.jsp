<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String name=(String)request.getAttribute("name");
    int pwd=(int)request.getAttribute("pwd");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Homepage</title>
</head>
<body>
   <h1>
   Name:
   <%=name %></h1>
   <br>
   <hr>
   <h1>
   Password:
   <%=pwd %></h1>
   

</body>
</html>