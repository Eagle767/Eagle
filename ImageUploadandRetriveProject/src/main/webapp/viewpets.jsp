<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="in.codebun.DbConnect.DBConnection"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<title></title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto+Slab&display=swap" rel="stylesheet">
<style type="text/css">
.container{
border: 2px solid #fff; 
background: #fff;
border-radius:5px;
}
h1,label{
font-family: 'Roboto Slab', serif;
}
a{
font-size: 20px;
text-decoration: none;
color: #D66D75;
padding: 10px 10px ;
background-color:#fff;
border-radius:5px;
font-size: larger;
}
</style>
</head>
<body style="background: linear-gradient(#D66D75,#E29587)">
<h1 align="center" class="mt-5" style="color: white">View All Pets</h1>
<center><a href="index.jsp">Add Pets</a></center>
<div class="container mt-5">
 
 <form>
 <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Pet Image</th>
      <th scope="col">Pet Name</th>
      <th scope="col">Pet Owner</th>
      <th scope="col">Pet Breed</th>
    </tr>
  </thead>
  <tbody>
  <%
   Connection conn = DBConnection.getConn();
    String sql = "SELECT * FROM PETTABLE";
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    while(rs.next()){
     %>
  
 
    <tr>
      <th scope="row"><%=rs.getInt(1) %></th>
      <td><img src=PetServlet.do?id=<%=rs.getInt(1) %> alt="image not found" width="100px" height="100px"></td>
      <td><%=rs.getString(2) %></td>
       <td><%=rs.getString(3) %></td>
        <td><%=rs.getString(4) %></td>
    </tr>
     <%} %>
  </tbody>
</table>
 </form>
</div>
</body>
</html>