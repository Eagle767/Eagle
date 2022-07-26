<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="muthu" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>String Token</title>
</head>
<body>
<muthu:forTokens items="Welcome hello hi" delims=" " var="vanakam">
<h1><muthu:out value="${vanakam}"></muthu:out></h1>
</muthu:forTokens>
</body>
</html>