<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="muthu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Set</title>
</head>
<body>
<muthu:set scope="page" var="pass" value="muthu123"></muthu:set>
<muthu:set scope="request" var="no" value="m123"></muthu:set>
<muthu:set scope="session" var="name" value="muthu"></muthu:set>
<muthu:set scope="application" var="roll" value="java"></muthu:set>
<h1><muthu:out value="The Password is :${pass}"></muthu:out></h1>
<h1><muthu:out value="The Number is :${no}"></muthu:out></h1>
<h1><muthu:out value="The Name is :${name}"></muthu:out></h1>
<h1><muthu:out value="The Roll is :${roll}"></muthu:out></h1>
<a href="set1.jsp">Next</a>
</body>
</html>