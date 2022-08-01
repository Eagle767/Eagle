<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>Welcome to Register...</h1>
<form:form action="/con/forms" method="POST" modelAttribute="user">
	UserName:<form:input type="text" path="name" required="required"/><br>
	PassWord:<input type="password" name="pass1" required="required"/><br>
	Re-Enter PassWord:<input type="password" name="pass2" required="required"/><br>
	Age:<form:input type="number" path="age" required="required"/><br>
	Phone:<form:input path="mno" required="required"/><br>
	Address:<form:input type="text" path="address" required="required"/><br>
	City:<form:input type="text" path="city" required="required"/><br>
	image:<form:input type="file" path="img" required="required"/><br>
	<input type="submit" value="click...">
</form:form>