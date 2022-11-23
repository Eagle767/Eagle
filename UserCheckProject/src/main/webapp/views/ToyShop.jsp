<!DOCTYPE html>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Toy Shop</title>
<style type="text/css">
body{
background-image: url("https://i0.wp.com/caps.pictures/201/2-toystorypartysaurus/full/partysaurus-animationscreencaps.com-38.jpg?strip=all");
text-align: center; color: black; }
h1{ color: black; font-size: 200%;}
.sub{  text-align: center; float: right;  background-color: inherit;  padding: 1% 3%;
  font-family: Monaco;  margin: 0% 0.2%;  color:black; }
.sub:hover{ background: #03e9f4; color: purple; }
</style>
</head>
<body bgcolor="orange">
<h1>Toy Shop</h1>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/con/shop" method="post">
<span><input type="hidden" name="shop" value="Invoice">
<% rs=db.checkTable("toyshop2"); 
while(rs.next()){ %>
<input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>-<%=rs.getString(2) %>
	<img alt="Image not found......" src=/con/shopimg?shopname=toyshop2&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %></span>
    <input class="sub" type="submit" value="Next Shop">
</form>

</body>
</html>