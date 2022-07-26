<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/WEB-INF/simplecustomtag.tld" prefix="mytaglib" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Odd or Even</title>
</head>
<body>
<mytaglib:checknumber n="<%=request.getParameter(\"num\") %>" />
</body>
</html>