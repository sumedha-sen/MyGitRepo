<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String name=(String)request.getAttribute("username");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Homepage</title>
</head>
<body>
   <h1>
   Welcome
   <%
   if(name!="" && name!=null){
 %>
   <%=name%>
   <%
     }
   %>
   </h1>

</body>
</html>