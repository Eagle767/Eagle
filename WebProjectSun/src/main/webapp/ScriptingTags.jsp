<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List,java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scripting Tags</title>
</head>
<body>
<h1>Scriptlets</h1>
<%
Date d;
List l;
ArrayList al;
%>
<% String name=request.getParameter("name"); %>
<% out.println(name); met(); %>
<h1>Expression</h1>
<%="Hello World..........." %>
<%=application.getRealPath("") %>
<h3><%=val %><%=name %></h3>
<h1>Declaration</h1>
<%!
String val="Hi............";
void met(){
	System.out.println("Calling method...........");
}
%>
</body>
</html>