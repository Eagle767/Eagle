<%@page import="java.sql.ResultSet"%>
<%@page import="dataBaseConnection.DBCon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chart Page</title>
</head>
<body>
<%!
DBCon con;
ResultSet rs;
public void jspInit(){
	con=new DBCon();
}
%>
<h1>Please Select Train Name</h1>
<form>
<h1><input type="radio" name="tname" value="Train-1" checked="checked">Train-1
<input type="radio" name="tname" value="Train-2">Train-2
<input type="radio" name="tname" value="Train-3">Train-3
<input type="radio" name="tname" value="Train-4">Train-4
<input type="radio" name="tname" value="Train-5">Train-5</h1>
<input type="submit">
</form>
<% String tname=request.getParameter("tname"); %>
<table border="1">
<thead><tr>
<th>Name</th>
<th>Age</th>
<th>Ticket No</th>
</tr></thead>
<% rs=con.chart(tname); 
while(rs.next()){
	%>
	<tbody><tr>
	<td><%=rs.getString(1) %></td>
	<td><%=rs.getInt(2) %></td>
	<td><%=rs.getInt(3) %></td>
	</tr></tbody>
	<%
}
%>
</table>
<a href="index.html">Home</a>
</body>
</html>