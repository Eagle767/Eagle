<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="muthu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mini Switch Case</title>
</head>
<body>
<muthu:set var="amt" scope="page" value="${(2*12)-5}"></muthu:set>
<muthu:choose>
<muthu:when test="${amt<10}">
<h1>It is Lower Then 10</h1>
</muthu:when>
<muthu:when test="${amt<20}">
<h1>It is Lower Then 20</h1>
</muthu:when>
<muthu:when test="${amt<30}">
<h1>It is Lower Then 30</h1>
</muthu:when>
<muthu:otherwise>
<h1>It is Higher Then 30</h1>
</muthu:otherwise>
</muthu:choose>
</body>
</html>