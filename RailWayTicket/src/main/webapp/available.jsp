<%@page import="dataBaseConnection.DBCon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Tickets</title>
</head>
<body>
<%!
DBCon con;
public void jspInit(){
	con=new DBCon();
}
%>
<h1>Please Select Train Name</h1>
<form>
<h1><input type="radio" name="tnames" value="Train-1" checked="checked">Train-1
<input type="radio" name="tnames" value="Train-2">Train-2
<input type="radio" name="tnames" value="Train-3">Train-3
<input type="radio" name="tnames" value="Train-4">Train-4
<input type="radio" name="tnames" value="Train-5">Train-5</h1>
<input type="submit">
</form>
<% String tname=request.getParameter("tnames"); %>
<h1><%=con.checkTickets(tname) %> Tickets are Available</h1>
<a href="index.html">Home</a>
</body>
</html>