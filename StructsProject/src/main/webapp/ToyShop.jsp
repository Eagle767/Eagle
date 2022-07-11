<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Toy Shop</title>
</head>
<body bgcolor="orange"><center>
<h1>Fruit Shop</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="shop3">
<input type="radio" name="Bike" value="T1">Bike
<input type="radio" name="Car" value="T2">Car
<input type="radio" name="Cycle" value="T3">Cycle
<input type="submit" value="Next">
</form>
</center>
</body>
</html>