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
width: 50%;
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
button[type=submit] {
background-color: #D66D75;
border-radius:5px;
font-size: larger;
}
</style>
</head>
<body style="background: linear-gradient(#D66D75,#E29587)">
<h1 align="center" class="mt-5" style="color: white">Pet Registration Form</h1>
<center><a href="viewpets.jsp">View Pets</a></center>
<div class="container mt-5">
 
 <form action="PetServlet.do" method="post" enctype="multipart/form-data">
 <span style="color: #000; font-style: inherit; font-weight: bolder;"><%=(request.getAttribute("success") == null) ? "" : request.getAttribute("success")%></span>
 <div class="mb-3">
   <label for="exampleFormControlInput1" class="form-label">Pet Name</label>
   <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter Pet Name" name="petName">
 </div>
 <div class="mb-3">
   <label for="exampleFormControlInput1" class="form-label">Pet Owner</label>
   <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter Pet Owner" name="petOwner">
 </div>
 <div class="mb-3">
   <label for="exampleFormControlInput1" class="form-label">Pet Breed</label>
   <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Enter Pet Name" name="petBreed">
 </div>
 <div class="mb-3">
   <label for="exampleFormControlInput1" class="form-label">Pet Photo</label>
   <input type="file"  id="exampleFormControlInput1" placeholder="Enter Pet Name" name="photo">
 </div>
 <div class="container text-center">
 <button type="submit" >Submit</button>
 </div>
 
 </form>
</div>
</body>
</html>