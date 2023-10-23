<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>X_workz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <title>Google Recaptcha, How to use the “I'm not a Robot”</title>
  <style>
    .fb9 {
      border: 1px solid #3366FF;
      background-color: #B3C6FF;
      width:150px;
      height:30px;
    }
    footer{
    background-color: black;
    text-align: center;
    color: white;
    padding: 20px
    }
  </style>
  <script src='https://www.google.com/recaptcha/api.js'></script>
  
  </head>
  <body>
    <nav class="navbar navbar-dark bg-dark">
 <div class="container-fluid">
    <a class="navbar-brand" href="#">
      <img src="logo.jpg" alt="Logo" width="50" height="50" class="d-inline-block align-text-top">
    </a>
    <a class="navbar-brand">Navbar</a>
    <a class="navbar-brand">Home</a>
    <a class="navbar-brand">AboutUs</a>
    <a class="navbar-brand">Galary</a>
    <a class="navbar-brand">Contat</a>
    <form class="d-flex" role="search">
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
    <a class="nav-link active" style="color: white" aria-current="page" href="Profile.jsp">Profile</a>
  </div>
  </nav>
  <form action="profile" method="post" 
  class="bg-success p-2" style="--bs-bg-opacity: .5;" onSubmit="return validateForm()">
  
  <h1 align="center">Profile Information</h1>
  <span id="valid" style="padding-left: 90px"></span>
  <p id="nam">
  <div>
  Name : <input type="text" placeholder="name" name="name" onchange="handleName()"id="name">
  </div>
  <br>
  <p id="no">
  <div>
  Mobile NO: <input type="number" placeholder="mobileNo" name="mobileNo" onchange="handleMobileNo()" id="mobileNo">
  </div>
  <br>
  <p id="emailId">
  <div>
  Email : <input type="email" placeholder="email" name="email" onchange="handleEmail()" id="email">
  </div>
  <br>
  <p id="date">
  <div>
  DOB : <input type="date" placeholder="date" name="dob" onchange="handleDOB()" id="dob">
  </div>
  <br>
  <p id="loc">
  <div>
    Location:<select type="form-select" placeholder="location" name="location" onchange="handleLocation()" id="location">
 <option>Select</option>
  <option>Hassan</option>
  <option>Mysore</option>
  <option>Bengaluru</option>
    <option>Davanagere</option>
    <option>Chikmangaluru</option>
    <option>Kolar</option>
    <option>Mandya</option>
  </select>
 </div>
 <br>
 <p id="pass">
 <div>
 Password :<input type="password"placeholder="password" name="password" onchange="handlePassword()" id="password"/>
 </div>
 <br>
 <p id="pass">
 <div>
 Confirm Password :<input type="password" placeholder="confirm password"name="confirm" onchange="handlePassword()" id="confirm"/>
 </div>
 <br>
 <p id="robot"/>
 <div>
 <div  class="g-recaptcha" data-sitekey="6LeIxAcTAAAAAJcZVRqyHh71UMIEGNQ_MXjiZKhI" name="captcha" onclick="handleRobot()" ></div>
</div>
 <br>
 <div><input type="Submit" value="Submit" class="btn btn-success"id="button1"/> 
  <input type="reset" value="Cancel" class="btn btn-danger" id="button2"/>
   </div> 

  
  </form>
  <script type="text/javascript">
  
 function handleName() {
		var name=document.getElementById("name").value;
		var button=document.getElementById("button1");
		if(name.length>3 && name.length<30){
			document.getElementById("nam").innerHTML = "<span style='color:blue'>Name is valid</span>";
			button.removeAttribute("disabled");
		} else {
			document.getElementById("nam").innerHTML = "<span style='color:red'>Please enter Valid name</span>";
			button.setAttribute("disabled", "");
			return;
		}
	}
function handleMobileNo(){
	var mobileNo=document.getElementById("mobileNo").value;
	var button=document.getElementById("button1");
	if(mobileNo.length==10){
		document.getElementById("no").innerHTML = "<span style='color:blue'>MobileNumber is valid</span>";
		button.removeAttribute("disabled");
	} else {
		document.getElementById("no").innerHTML = "<span style='color:red'>Please enter Valid MobileNumber</span>";
		button.setAttribute("disabled", "");
		return;
	}
}
function handleEmail(){
	var email=document.getElementById("email").value;
	var button=document.getElementById("button1");
	if(email.length>3 && email.length<30){
		document.getElementById("emailId").innerHTML = "<span style='color:blue'>Email is valid</span>";
		button.removeAttribute("disabled");
	} else {
		document.getElementById("emailId").innerHTML = "<span style='color:red'>Please enter Valid Email</span>";
		button.setAttribute("disabled", "");
		return;
	}
} 
function handleDOB(){
	
	var dob=document.getElementById("dob").value;
	var button=document.getElementById("button1");
	if(dob !== " "){
		document.getElementById("date").innerHTML = "<span style='color:blue'>date is valid</span>";
		button.removeAttribute("disabled");
	} else {
		document.getElementById("date").innerHTML = "<span style='color:red'>Please enter Valid date</span>";
		button.setAttribute("disabled", "");
		return;
	}
}
function handleLocation() {
	var location = document.getElementById("location");
	console.log(location.value)
	var button = document.getElementById("button1");
	 if (location.value.length >=3 && location.value.length <=30) {
		document.getElementById("loc").innerHTML = "<span style='color:blue'>location is valid</span>";
		button.removeAttribute("disabled");
	} else {
		document.getElementById("loc").innerHTML = "<span style='color:red'>Please Select Valid Option</span>";
		button.setAttribute("disabled", "");
		return;
	} 
}
function handlePassword(){
	var password=document.getElementById("password").value;
	var confirm=document.getElementById("confirm").value;
	var button=document.getElementById("button1");
	if(password.length>=8 && password.length<15 && confirm===password){
		document.getElementById("pass").innerHTML = "<span style='color:blue'>password is valid</span>";
		button.removeAttribute("disabled");
	} else {
		document.getElementById("pass").innerHTML = "<span style='color:red'>Please enter Valid password</span>";
		button.setAttribute("disabled", "");
		return;
	}
}
function  validateForm(){
	var name=document.getElementById("name").value;
	var mobileNo=document.getElementById("mobileNo").value;
	var email = document.getElementById("email").value;
	var dob = document.getElementById("dob").value;
	var location = document.getElementById("location").value;
	var password=document.getElementById("password").value;
	var confirm=document.getElementById("confirm").value;
	var response = grecaptcha.getResponse();
	console.log(response.length)
	var button=document.getElementById("button1");
	if(name.length>=3 && name.length<30 && mobileNo.length==10 && email.length>3 && 
			email.length<40 && dob !== " " && location != '' && 
		 password.length>=8 && password.length<15 && password===confirm && response.length!=0){
console.log('hi im in if');
		document.getElementById("robot").innerHTML = "<span style='color:blue'>info is valid</span>";
		button.removeAttribute("disabled");
		return true;
	} else {
		console.log('hi im in else');
		document.getElementById("robot").innerHTML = "";
		button.setAttribute("disabled", "");
		return false;
	}
}
  
  </script>  
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
  <footer>
  <span>Copyright@2023</span>
  </footer>
  
</html>