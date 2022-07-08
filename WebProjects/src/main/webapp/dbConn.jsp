<html>
<head>
</head>
<body>
<H3>Employee Details</H3>
<%@ page import = "java.sql.*, WebTest.dbConn" %>

<%! 
    ResultSet rs ;
    dbConn db ;
    String sConn;
    public void jspInit() {
        db = new dbConn();
        sConn = db.DBConnect();
        rs = null; 
    }
%>
<a href="EX9Start.jsp">Home</a>
<%
    String sID = request.getParameter("ID");
    if(sID.equals("Insert")) {
        String sName = request.getParameter("hName");
        String age=request.getParameter("hAge");
        int iAge = Integer.parseInt(age);
        String sInsState = null;
        if(sConn.equals("")) {
            sInsState = db.setData(sName, iAge);
        }
%>
    
<H1><%=sInsState%></H1>
<%
    } else {
        rs = db.getData();
%>
        <table border="1">
        <tr>
            <th>Name</th>
            <th>Age</th>
        </tr>
<%        
        while(rs.next()){
%>       
        <tr>
            <td><%=rs.getString(1)%></td>
            <td><%=rs.getInt(2)%></td>
        </tr>
<%        
        }
%>
        </table>
<%        
    }
    
%>

</body>
</html>
    