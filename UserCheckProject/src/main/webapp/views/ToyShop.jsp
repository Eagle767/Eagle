<!DOCTYPE html>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Toy Shop</title>
</head>
<body bgcolor="orange">
<h1>Fruit Shop</h1>
<%! ResultSet rs ;
    DbCon db ;
    public void jspInit() {
        db = new DbCon();
    }
%>
<form action="/con/shop" method="post">
<input type="hidden" name="shop" value="Invoice">
<% rs=db.checkTable("toyshop2"); 
while(rs.next()){ %>
<input type="checkbox" name=<%=rs.getString(1) %> value=<%=rs.getString(2) %> >
	<%=rs.getString(1) %>
	<img alt="Image not found......" src=/con/shopimg?shopname=toyshop2&name=<%=rs.getString(1) %> width="100px" height="100px">
	 <% } %>
    <input type="submit" value="Next">
</form>

</body>
</html>