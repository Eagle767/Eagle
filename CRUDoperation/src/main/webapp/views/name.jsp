<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="muthu" %>
<h1>Hello Jsp</h1>
<muthu:forTokens items="${names}" delims="," var="vanakam">
<h1><muthu:out value="${vanakam}"></muthu:out></h1>
</muthu:forTokens>
${names}