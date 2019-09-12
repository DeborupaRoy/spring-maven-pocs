<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STUDENT FORM</title>
</head>
<body>
	<h3> STUDENT INFORMATION</h3>
	<form:form method="POST" action="addStudent" >
	 <form:label path="name">NAME :</form:label>
	 <form:input path="name" ></form:input>
	 
	 <form:label path="age">AGE :</form:label>
	 <form:input path="age" ></form:input>
	 
	 <form:label path="id">ID :</form:label>
	 <form:input path="id" ></form:input>
	 
	 <input type="submit" value="SUBMIT">
	</form:form>
</body>
</html>