<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is welcome 1 add...............</h1>
<%
	String name=session.getAttribute("myname").toString();
	out.println("Name....:"+name);
%>
	<s:property value="msg"/>
</body>
</html>