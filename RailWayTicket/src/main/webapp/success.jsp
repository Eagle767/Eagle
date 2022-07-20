<%@page import="dataBaseConnection.DBCon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket</title>
</head>
<body>
<%!
DBCon con;
public void jspInit(){
	con=new DBCon();
}
%>
<% String pname=request.getParameter("pname"); 
String uname=request.getParameter("uname");
%>
<h1>Welcome <%=pname %></h1>
<h1>Your Ticket No : <%=con.checkTicketNo(pname, uname) %></h1>
<a href="index.html">Home</a>
</body>
</html>