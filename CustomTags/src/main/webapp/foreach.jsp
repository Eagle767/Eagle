<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="muthu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>For Each Loop</title>
</head>
<body>
<muthu:forEach var="i" begin="1" end="5">
<h1><muthu:out value="${i}"></muthu:out></h1>
</muthu:forEach>
</body>
</html>