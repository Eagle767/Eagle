<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<TABLE BORDER=2>
     <TR>    <TH>Message</TH> <TH>Result</TH>   </TR>
     <TR>     <TD>SQRT of 4</TD> 
                    <TD> <%= Math.sqrt(2) %></TD>   </TR> 
     <TR>     <TD>Current time</TD> 
                    <TD> <%= new java.util.Date() %></TD>   </TR>     
     <TR>     <TD>Your hostname</TD>
                    <TD> <%= request.getRemoteHost() %></TD>  </TR>  
     <TR>     <TD>Port :</TD>
                    <TD> <%= request.getServerPort() %></TD>  </TR> 
      <TR>    <TD>Scheme </TD>
                    <TD> <%= request.getScheme() %></TD>  </TR>   
      <TR>    <TD> Address</TD>
                    <TD> <%= request.getServerName() %></TD>  </TR>  
      </TABLE>

</body>
</html>