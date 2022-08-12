<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

	<head>
    <title>Name Collector</title>
	</head>

	<body>
	    <hr>
		<h4>Enter your name so that we can customize a greeting just for you!</h4> 	
		<s:form action="helloworld5" enctype="multipart/form-data" method="POST">
			<!-- s:hidden name="formid" value="names"/ -->
			<s:token/>
			<s:fielderror name="invaliduser"/>
	    	<s:textfield name="user.uname" label="Your name"/>
	    	<s:password name="user.upass" label="Your password"/>
	    	<s:file name="pic" label="Your Picture"/>
    		<s:submit/>
		</s:form>
	    <hr>
	    
	    <hr>
	   <hr>	
	</body>
	
</html>
