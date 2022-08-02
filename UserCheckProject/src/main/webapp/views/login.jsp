<h1>Welcome Login</h1>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/con/forms1" method="POST" modelAttribute="user">
UserName:<form:input type="text" path="name" required="required"/>
UserName:<form:input type="text" path="pass" required="required"/>
	<input type="submit" value="click...">
	
</form:form>