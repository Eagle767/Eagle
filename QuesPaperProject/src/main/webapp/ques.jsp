<%@page import="xel.XelToSql"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Question Page</title>
</head>
<body>
<%!ResultSet rs;
XelToSql xl;
int count=0,cd=0;
int min=1,max=100;
public void jspInit(){
	xl=new XelToSql();
}
%>
<% if(count<=10){
	count=0;
} %>
<h1>Questions</h1>
<% 
for(int i=0;i<10;i++) {
	int b = (int)(Math.random()*(max-min+1)+min); 
rs=xl.values(b);
while(rs.next()){
	count=count+1;
%><form action="output.jsp" method="post">
<h1><%=count %>.<%=rs.getString(2) %></h1>
<h2><input type="radio" name=<%="no"+String.valueOf(count) %> value="a"><%=rs.getString(3) %>
<input type="radio" name=<%="no"+String.valueOf(count) %> value="b"><%=rs.getString(4) %>
<input type="radio" name=<%="no"+String.valueOf(count) %> value="c"><%=rs.getString(5) %>
<input type="radio" name=<%="no"+String.valueOf(count) %> value="d"><%=rs.getString(6) %><% String sst=rs.getString(7); %>
</h2><input type="hidden" name=<%="ans"+String.valueOf(count) %> value=<%=rs.getString(7) %> >
<% } }%>
<h2><input type="submit" value="save" ></h2>
</form>
</body>
</html>