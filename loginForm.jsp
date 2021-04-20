<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    String msg=(String)request.getAttribute("errMsg");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>

   <h1>
   <fieldset>
   <legend>Login</legend>
   <form action="./loginform" method="post">
   <tr>
      <td>Enter user name</td>
      <td>:</td>
      <td><input type="text" name="id"></td>
   </tr>

   
    <tr>
      <td>Enter password</td>
      <td>:</td>
      <td><input type="password" name="pwd"></td>
   </tr>
   <tr>
      
      <td><input type="submit" value="login"></td>
   </tr>
   </form>
  
   </fieldset>
   </h1>

</body>
</html>