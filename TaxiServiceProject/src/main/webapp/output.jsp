<%@page import="dataBaseConnect.DBCon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thank You Page</title>
</head>
<body>
<%! DBCon con;
public void jspInit() {
	con=new DBCon();
}
%>
<center>
<h1>Taxi can be Allocated</h1>
<% String customerid=request.getParameter("customerid"); %>
<h1><%=con.findCustomerTaxi(customerid)   %> can be Alloted</h1>
<input type="hidden" name="lasttaxi" value=<%=con.findCustomerTaxi(customerid)   %>>
</center>
</body>
</html>