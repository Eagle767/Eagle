<html>
<head>
</head>
<body>
<%@ include file = 'Header.jsp' %>
<H3>Parameter Demo</H3>
<form name="param" method="get" action="parameterBean.jsp">
<table>
    <tr>
        <td>Enter Numerator</td>
        <td><input type = "text" name = "num" size="3"></td>
    </tr>    
    <tr>
        <td>Enter Denominator</td>
        <td><input type = "text" name = "den" size="3"></td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <input type = "submit" >
        </td>
    </tr>
</table>
</form>
<%@ include file = 'Footer.jsp' %>
</body>
</html>
