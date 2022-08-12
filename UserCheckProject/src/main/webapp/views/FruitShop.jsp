<%@page import="java.sql.ResultSet"%>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruit Shop</title>
<style type="text/css">
body{
background-image: url("https://4.bp.blogspot.com/-CJg3dYFpTWQ/VBq6Z6G3Z1I/AAAAAAAAD00/NfztSwl_wy0/s1600/wxp%2B(17).jpg");
text-align: center; color: black; }
h1{ color: black; font-size: 200%;}
.sub{  text-align: center; float: right;  background-color: inherit;  padding: 1% 3%;
  font-family: Monaco;  margin: 0% 0.2%;  color:black; }
.sub:hover{ background: #03e9f4; color: purple; }
</style>
</head>
<body>
<h1>Fruit Shop</h1>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/con/shop" method="post">
<input type="hidden" name="shop" value="ToyShop">
<% rs=db.checkTable("FruitShop2"); 
while(rs.next()){ %>
<span><input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>-<%=rs.getString(2) %>
	<img alt="Image not found......" src=/con/shopimg?shopname=fruitshop2&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input class="sub" type="submit" value="Next Shop">
</form>
</body>
</html>