<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruit Shop</title>
</head>
<body><center>
<h1>Fruit Shop</h1>
<%@ page import = "java.sql.*, dBConnect.DBConnect" %>
<%! ResultSet rs ;
    DBConnect db ;
    public void jspInit() {
        db = new DBConnect();
    }
%>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="shop2">
<% rs=db.checkTable("FruitShop2"); 
while(rs.next()){ %>
<input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=ImageGet?shopname=fruitshop2&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %>
    <input type="submit" value="Next">
</form>
</center>
</body>
</html>