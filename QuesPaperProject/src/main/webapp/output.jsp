<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OutPut Page</title>
</head>
<body>
<% int count=0,cd=0; 
for(int i=0; i<10; i++){
	count=count+1;
	String a=request.getParameter("no"+String.valueOf(count)),b=request.getParameter("ans"+String.valueOf(count));
	if(a!=null&& b!=null){
		if(a.equals(b))
		cd=cd+1;
	}
}
%>
<h1>Your Mark is : <%=cd %></h1>
</body>
</html>