<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="muthu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Out</title>
</head>
<body>
<% 
request.setAttribute("hello", "Hi");
String abc="fan"; %>
<h1>
<muthu:out value="Hello"></muthu:out></h1><h1>
<muthu:out value="Muthu......${hello}"></muthu:out></h1>
</body>
</html>