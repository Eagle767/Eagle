<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="muthu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forward Page</title>
</head>
<body>
<h1><muthu:out value="The Password is :${pass}"></muthu:out></h1>
<h1><muthu:out value="The Number is :${no}"></muthu:out></h1>
<h1><muthu:out value="The Name is :${name}"></muthu:out></h1>
<h1><muthu:out value="The Roll is :${roll}"></muthu:out></h1>
<a href="set3.jsp">Next</a>
</body>
</html>