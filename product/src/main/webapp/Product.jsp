<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>

	<nav class="navbar bg-dark border-bottom border-body"
		data-bs-theme="dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Home</a>
		</div>
	</nav>
	<h1 align="center">Product Information.</h1>
	
	<form action="product" method="post">
	<h2 align="center" style="color: red">${errorMsg }</h2>
	<span id="valid" style="padding-left:80px"></span>
		<div
			style="background-color: rgba(204, 210, 11, 0.629); color: black; border-radius: 2vh; margin-left: 70vh; padding-left: 20vh; border: 2px solid; width: 70vh; height: auto;">
			<lable>Name :</lable>
			<input type="text" name="name" onchange="handleName()" id="name" /><br>
			<br> <label>Type :</label><select name="type" id="type"
				onchange="handleType()">Type:
				<option>Choose...</option>
				<option>Jeans</option>
				<option>Shirt</option>
				<option>Kurti</option>
				<option>Jacket</option>
				<option>Shoes</option>
			</select><br> <br>
			<lable>Price :</lable>
			<input type="number" name="price" onchange="handlePrice()" id="price"
				placeholder="price" /><br> <br> <label>Brand :</label><select
				name="brand" id="brand" onchange="handleBrand()" >Brand:
				<option>Choose...</option>
				<option>Puma</option>
				<option>Levi's</option>
				<option>Nike</option>
				<option>PeterEngland</option>
				<option>adidas</option>
			</select><br> <br>
			<lable>Quantity :</lable>
			<input type="number" name="quantity" onchange="handleQuantity()"
				id="quantity" placeholder="quantity" /><br> <br>
			<lable>Desc :</lable>
			<input type="text" name="desc" onchange="handleDesc()" id="desc"
				placeholder="desc" /><br> <br> <input type="submit"
				id="button" value="send" class="btn btn-success" />
		</div>
	</form>
	<script type="text/javascript">
		function handlePrice(event) {
			var price = document.getElementById("price");
			console.log(price.value)
			if (price.value > 2 && price.value < 50) {
				document.getElementById("valid").innerHTML = "<span style='color:blue'>Price is valid</span>";
			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter the valid price</span>";
			}
		}

		function handleType() {
			var disabled = true;
			var type = document.getElementById("type");
			console.log(type.value)
			var button = document.getElementById("button");

			if (type.value == 'Choose...') {
				document.getElementById("valid").innerHTML = disabled;

				document.getElementById("valid").innerHTML = "<span style='color:blue'>Please select the valid option</span>";
				button.setAttribute("disabled", "");
			} else {
				button.removeAttribute("disabled");
				return;
			}
		}
		function handleName(event) {
			var name = document.getElementById("name");
			console.log(name.value)
			if (name.value.length >= 3 && name.value.length < 8) {
				document.getElementById("valid").innerHTML = "<span style='color:blue'>Name is valid</span>";
			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter the valid name</span>";
				return;
			}
		}
		function handleQuantity(event) {
			var quantity = document.getElementById("quantity");
			console.log(quantity.value)
			if (quantity.value > 0 && quantity.value < 50) {
				document.getElementById("valid").innerHTML = "<span style='color:blue'>quantity is valid</span>";
			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter the valid quantity</span>";
				return;
			}
		}
		function handleDesc(event) {
			var desc = document.getElementById("desc");
			console.log(desc.value)
			if (desc.value.length > 30) {
				document.getElementById("valid").innerHTML = "<span style='color:blue'>Description is valid</span>";
			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'> Description is invalid</span>";
				return;
			}
		}
		function handleBrand() {
			var disabled = true;
			var type = document.getElementById("brand");
			console.log(type.value)
			var button = document.getElementById("button");

			if (type.value === 'Choose...') {
				document.getElementById("valid").innerHTML = disabled;

				document.getElementById("valid").innerHTML = "<span style='color:blue'>Please select the valid option</span>";
				button.setAttribute("disabled", "");
			} else {
				button.removeAttribute("disabled");
				return;
			}
		}
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>