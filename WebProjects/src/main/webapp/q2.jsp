<HTML>   <HEAD>   <TITLE>   Page 2   </TITLE>    </HEAD>
 <BODY>
                       <%@ page language="java" %>
                       <%! String name=""; %>
                       <% 
                       name = request.getParameter("thename");
                       session.putValue("thename", name); 
                       %>

                       The name is <%= name %>
                       <p>

                       <FORM METHOD=POST ACTION="q3.jsp">

                       What is your favorite food? 
                       <INPUT TYPE=TEXT NAME="food">
                       <P>
                       <INPUT TYPE=SUBMIT VALUE="SUBMIT">
                       </FORM>
         </BODY>  </HTML>
