<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>x-workz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <style >
  .background{
  background-color:rgb(67, 141, 113);
  margin-left:50vh;
 padding-left: 20vh;
 margin-right: 55vh;
 color: white;
  }
  .design{
  text-decoration: inherit;
  font-size: large;

  
  }
  
  </style>
  </head>
  <body>
  <nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">Home</a>
    <a class="navbar-brand" href="Bakery.jsp">Bakery</a>
    </div>
</nav>
<br>
    <h1 align="center">Bakery Information....</h1>
    <br>
    <div class="background">
    <form action="bakery" method="post" onSubmit="return validateForm()">
    <span id="valid" ></span>
    <p id="Iname">
    <div class="design">
    Item Name: <input type="text" placeholder="name" id="name" name="name" onchange="handleName()" />
    </div>
    <br>
    <p id="Iprice"/>
    <div class="design">
    Item Price: <input type="number" placeholder="price" onchange="handlePrice()" id="price" name="price"/>
    </div>
    <br>
    <p id="quan"/>
    <div  class="design" >
    Quantity : <select type="form-select"  onchange="handleQuantity()" id="quantity" name="quantity">
    <option> Select</option>
  <option>1</option>
  <option>2</option>
  <option>3</option>
    <option>4</option>
    <option>5</option>
    <option>6</option>
    <option> 7</option>
    <option>8</option>
  <option>9</option>
  <option>10</option>
    </select>
     </div>
     <br>
     <p id="dis"/>
     <div  class="design">
     Discount : <select type="form-select"  onchange="handleDiscount()" id="discount" name="discount">
    <option> Select</option>
  <option>5</option>
  <option>10</option>
  <option>15</option>
    <option>20</option>
    <option>50</option>
    </select>
     </div>
     <br>
     <p id="gs"/>
     <div class="design">
     GST : <input type="number" placeholder="gst" onchange="handleGST()" id="gst" name="gst"/>
     </div>
     <br>
     <p id="mDate"/>
     <div class="design">
     Manufacture Date : <input type="date" placeholder="mnDate" onchange="handleMnDate()" id="mnDate" name="mnDate"/>
     </div>
     <br>
     <p id="eDate"/>
     <div class="design">
     Expiry Date : <input type="date" placeholder="exDate" onchange="handleExDate()" id="exDate" name="exDate"/>
     </div>
     <br>
     <div >
     <input type="Submit" value="Submit" class="btn btn-success"id="button1"/> 
     <input type="reset" value="Cancel" class="btn btn-danger" id="button2"/>
     </div>
     
   
    </form>
    <script type="text/javascript">
    function handleName() {
		var name=document.getElementById("name");
		console.log(name.value);
		var button=document.getElementById("button1");
		if(name.value.length>3 && name.value.length<30){
			document.getElementById("Iname").innerHTML = "<span style='color:blue'>Name is valid</span>";
			button.removeAttribute("disabled");
		} else {
			document.getElementById("Iname").innerHTML = "<span style='color:red'>Please enter Valid name</span>";
			button.setAttribute("disabled", "");
			return;
		}
	}
    function handlePrice() {
		var price=document.getElementById("price").value;
		var button=document.getElementById("button1");
		if(price.length >1){
			document.getElementById("Iprice").innerHTML = "<span style='color:blue'>price is valid</span>";
			button.removeAttribute("disabled");
		} else {
			document.getElementById("Iprice").innerHTML = "<span style='color:red'>Please enter Valid price</span>";
			button.setAttribute("disabled", "");
			return;
		}
	}
    function handleQuantity(){
    	var quantity = document.getElementById("quantity");
    	console.log(quantity.value)
    	var button = document.getElementById("button1");
    	 if (quantity.value !=='Select') {
    		document.getElementById("quan").innerHTML = "<span style='color:blue'>Quantity is valid</span>";
    		button.removeAttribute("disabled");
    	} else {
    		document.getElementById("quan").innerHTML = "<span style='color:red'>Please Select Valid Option</span>";
    		button.setAttribute("disabled", "");
    		return;
    	} 
    }
    function handleDiscount() {
    	var discount = document.getElementById("discount");
    	console.log(discount.value)
    	var button = document.getElementById("button1");
    	 if (discount.value !=='Select' ) {
    		document.getElementById("dis").innerHTML = "<span style='color:blue'>Discount is valid</span>";
    		button.removeAttribute("disabled");
    	} else {
    		document.getElementById("dis").innerHTML = "<span style='color:red'>Please Select Valid Option</span>";
    		button.setAttribute("disabled", "");
    		return;
    	} 
    }
    function handleGST() {
    	var gst = document.getElementById("gst");
    	console.log(gst.value)
    	var button = document.getElementById("button1");
    	 if (gst.value >=1 && gst.value <=10 ) {
    		document.getElementById("gs").innerHTML = "<span style='color:blue'>GST is valid</span>";
    		button.removeAttribute("disabled");
    	} else {
    		document.getElementById("gs").innerHTML = "<span style='color:red'>GST is invalid</span>";
    		button.setAttribute("disabled", "");
    		return;
    	} 
    }
    function handleMnDate(){
    	var mnDate=document.getElementById("mnDate").value;
    	console.log(mnDate.value);
    	var button=document.getElementById("button1");
    	if(mnDate !==" "){
    		document.getElementById("mDate").innerHTML = "<span style='color:blue'>mdate is valid</span>";
    		button.removeAttribute("disabled");
    	} else {
    		document.getElementById("mDate").innerHTML = "<span style='color:red'>Please enter Valid date</span>";
    		button.setAttribute("disabled", "");
    		return;
    	}
    }
    function handleExDate(){
    	var exDate=document.getElementById("exDate").value;
    	var button=document.getElementById("button1");
    	if(exDate !== " "){
    		document.getElementById("eDate").innerHTML = "<span style='color:blue'>edate is valid</span>";
    		button.removeAttribute("disabled");
    	} else {
    		document.getElementById("eDate").innerHTML = "<span style='color:red'>Please enter Valid date</span>";
    		button.setAttribute("disabled", "");
    		return;
    	}
    }
    function validateForm(){
    	var name=document.getElementById("name").value;
    	var price=document.getElementById("price").value;
    	var quantity=document.getElementById("quantity").value;
    	var discount=document.getElementById("discount").value;
    	var gst=document.getElementById("gst").value;
    	var mnDate=document.getElementById("mnDate").value;
    	var exDate=document.getElementById("exDate").value;
    	var button=document.getElementById("button1");
    	if(name.length>3 && name.length<30 && price.length >1 && quantity.value !=='Select' && 
    	discount.value !=='Select' && gst.value >=1 && gst.value <=10 && mnDate !== "" && exDate !== " "){
    		console.log("hi i am if");
    		document.getElementById("valid").innerHTML = "<span style='color:blue'>Item Information is valid</span>"
    			button.removeAttribute("disabled");
		} else {
			document.getElementById("valid").innerHTML = "";
			console.log("i am else");
			button.setAttribute("disabled", "");
		}
    }
    
    </script>
    
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>