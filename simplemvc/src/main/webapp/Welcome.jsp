<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <p>WELCOME :${username} </p>
  <p>LOGIN TIME : ${time}  </p>
  <form action="LogoutServlet" method=post>
  	<input type="submit" value="LOGOUT">
  </form>
</body>
</html>