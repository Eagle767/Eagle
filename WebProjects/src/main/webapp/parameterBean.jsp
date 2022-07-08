<html>
<head></head>
<body>
<jsp:useBean id="rn" class="WebTest.RationalBean" />
<jsp:setProperty name="rn" property="*" />
<H3>Number in reduced form is : <H3>
<jsp:getProperty name="rn" property='reduced' />
</body>
</html>
