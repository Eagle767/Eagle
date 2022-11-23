<HTML>
<HEAD>
<TITLE>Simple Bean JSP</TITLE>
</HEAD>  
 <BODY>    <jsp:useBean id="simpleBean" class="WebTest.SimpleBean" />   
   <P>The result of <tt>simpleMethod()</tt>:
    <P>     <font color="#FF0000">           <%= simpleBean.simpleMethod() %>    </font>
        </BODY>
    </HTML> 
