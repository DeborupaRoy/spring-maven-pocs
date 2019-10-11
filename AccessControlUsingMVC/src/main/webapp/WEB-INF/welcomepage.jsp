<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME PAGE</title>
</head>
<body>
<p> HELLO ${sessionScope.username} </p>
<table>
<tr>
<td> LIST OF LINKS AVAILABLE</td>
</tr>
<tr>
<td><a href="${pageContext.servletContext.contextPath}/PAGE1/">PAGE 1</a></td>
</tr>

<tr>
<td><a href="${pageContext.servletContext.contextPath}/PAGE2/">PAGE 2</a></td>
</tr>

<tr>
<td><a href="${pageContext.servletContext.contextPath}/PAGE3/">PAGE 3</a></td>
</tr>
</table>

</body>
</html>