<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test</title>
</head>
<body>
<form action="produ" method="post">
<label>Product Name:</label>
<input type="text" name="name"  id="name"/>
<br>
<label>Price</label>
<input type="number" name="price" id="price"/>
<br>
<div name="type"  id="type">
<select>Type
<option id="cloth">cloth</option>
<option id="cloth">book</option>
<option id="cloth">electricItem</option>
<option id="other">other</option>
</select>
</div>
<br>
<div>
<select name="discount">discount
<option id="dis10">10</option>
<option id="dis5">15</option>
<option id="dis7">7</option>
<option id="dis5">5</option>
</select>
</div>
<input  type="submit"/>
</form>
</body>
</html>