<HTML>
<HEAD>
<TITLE>Time Bean </TITLE>
</HEAD>
   <BODY>
     <jsp:useBean id="b2" class="WebTest.TimeBean" />
     Hour   = <jsp:getProperty name="b2" property='hour' />  <BR>
     Minute = <jsp:getProperty name="b2" property='minute' /><BR>
     Second = <jsp:getProperty name="b2" property='second' /><BR>
     Message= <jsp:getProperty name="b2" property='message'/>
         </BODY>
</HTML>
