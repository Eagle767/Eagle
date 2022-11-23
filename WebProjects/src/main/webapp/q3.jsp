<HTML>   <HEAD>   <TITLE>  Page 3   </TITLE>  </HEAD>

  <BODY>

                       <%@ page language="java" %>

                       <%! String food="";
                        %>

                       <%
                       food = request.getParameter("food");
                       String name = (String) session.getValue("thename");
                       %>
                       Your name is <b><%= name %></b>
                       <P>
                       Your favorite food is <b><%= food %></b>

     </BODY>  </HTML>
