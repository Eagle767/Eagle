<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Odd or Even</title>
</head>
<body>
<% int a=Integer.parseInt(request.getParameter("num"));if(a%2==0){out.println("Even Number.............");}
else{out.println("Odd Number.........");}%>
</body>
</html>