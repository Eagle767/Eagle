<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>window.alert("Please Enter Valid Deatails")</script>
<style>
body{
background-image: url("https://www.zastavki.com/pictures/2560x1600/2009/Creative_Wallpaper_Door_015997_.jpg");
color: #00FF00; background-size: 100%; font-weight: bolder; font-size: 100%;
}
 .sub{  text-align: center;  background-color: inherit;  padding: 0.5% 3%;
  font-family: Monaco;  margin: 0% 0.2%;  color:white;  font-size: 100%; }
.sub:hover{ background: #03e9f4; color: purple; }
</style>
<center><h1>Welcome to Register Page</h1>
<form:form action="/con/forms" method="POST" modelAttribute="user">
	<label>UserName</label><br><form:input class="sub" type="text" path="name"/><br>
	<form:errors style="color:red;" path="name"></form:errors><br>
	<label>PassWord</label><br><form:input class="sub" type="text" path="pass"/><br><br>
	<label>Re-Enter PassWord</label><br><input class="sub" type="password" name="pass1" required="required"/><br>
	<form:errors style="color:red;" path="pass"></form:errors><br>
	<label>Age</label><br><form:input class="sub" type="number" path="age"/><br>
	<form:errors style="color:red;"  path="age"></form:errors><br>
	<label>Phone</label><br><form:input class="sub" path="mno"/><br>
	<form:errors style="color:red;" path="mno"></form:errors><br>
	<label>Address</label><br><form:input class="sub" type="text" path="address"/><br>
	<form:errors style="color:red;" path="address"></form:errors><br>
	<label>City</label><br><form:input class="sub" type="text" path="city"/><br>
	<form:errors style="color:red;" path="city"></form:errors><br>
	<label>Image</label><br><form:input class="sub" type="file" path="img"/><br>
	<form:errors style="color:red;" path="img"></form:errors><br>
	<input class="sub" type="submit" value="SAVE">
</form:form></center>