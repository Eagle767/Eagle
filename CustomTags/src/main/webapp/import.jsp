<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="muthu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Import Page</title>
</head>
<body>
<muthu:import url="https://www.oracle.com/in" var="oracle" />
<muthu:out value="${oracle}"></muthu:out>
</body>
</html>