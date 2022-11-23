<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Tickets</title>
<script type="text/javascript">
window.alert("Please Enter Valid UserName,Password...........");
</script>
</head>
<body>
<h1>Please Select Train Name</h1>
<form action="book.do" method="post">
<input type="hidden" name="action" value="booking">
<input type="text" name="uname" placeholder="Enter User Name" required="required">
<input type="text" name="upass" placeholder="Enter Password" required="required">
<input type="text" name="pname" placeholder="Enter Name" required="required">
<input type="number" name="age" placeholder="Enter Age" required="required">
<h1><input type="radio" name="tname" value="Train-1" checked="checked">Train-1
<input type="radio" name="tname" value="Train-2">Train-2
<input type="radio" name="tname" value="Train-3">Train-3
<input type="radio" name="tname" value="Train-4">Train-4
<input type="radio" name="tname" value="Train-5">Train-5</h1>
<input type="submit" value="Book Ticket">
</form>
<a href="index.html">Home</a>
</body>
</html>