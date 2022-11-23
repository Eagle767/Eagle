<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="muthu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catch and IF</title>
</head>
<body>
<muthu:set scope="session" var="amt" value="${30*4/2}"></muthu:set>
<h1>int i=2/2;</h1>
<muthu:catch var="Exceptions">
<% int i=2/2; %>
</muthu:catch>
<muthu:if test="${Exceptions!=null}">
<p>The Error Message is :${Exceptions}<br>
"${Exceptions.message}"
</p>
</muthu:if>
<h1>int i=2/0;</h1>
<muthu:catch var="Exceptions">
<% int i=2/0; %>
</muthu:catch>
<muthu:if test="${Exceptions!=null}">
<p>The Error Message is :${Exceptions}<br>
"${Exceptions.message}"
</p>
</muthu:if>
<muthu:if test="${amt<100}">
<h1>The Amount is Low</h1>
</muthu:if>
<muthu:if test="${amt>100}">
<h1>The Amount is High</h1>
</muthu:if>
</body>
</html>