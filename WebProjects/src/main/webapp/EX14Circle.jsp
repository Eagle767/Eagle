<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<BODY>
     <jsp:useBean id="cb" class="WebTest.CircleBean" />

     <jsp:setProperty name="cb" property="radius" value="2.0" />  
    
     Reduced Form: <jsp:getProperty name="cb" property='area' />  
     
 </BODY>

</body>
</html>