<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String num=request.getParameter("number");
int a=Integer.parseInt(num);
if(a%2==0){
	out.println("It is even Number............");
}else{
	out.println("It is odd Number............");
}
%>
</body>
</html>