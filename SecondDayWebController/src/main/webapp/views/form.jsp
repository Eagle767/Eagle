<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/form/forms" method="POST" modelAttribute="user">
	UserName:<form:input path="name"/><br>
	<form:errors path="name"></form:errors><br>
	PassWord:<form:input path="pass"/><br>
	Email:<form:input path="email"/><br>
	Phone:<form:input path="no"/><br>
	
	<input type="submit" value="click...">
	
</form:form>