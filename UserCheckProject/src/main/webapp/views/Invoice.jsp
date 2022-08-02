
<!DOCTYPE html>
<%@page import="java.util.Enumeration"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invoice</title>
</head>
<body bgcolor="pink">
<h1>Invoice</h1>
<%
Enumeration<String> em=session.getAttributeNames();
while(em.hasMoreElements()){
	String a=em.nextElement().toString();
	String b=session.getAttribute(a).toString();
	if(a.equals("shop")){}
	else{out.println("<h1>"+a+":"+b+"<h1>");}
}
%>
<a href="../index.html">Home</a>
</body>
</html>