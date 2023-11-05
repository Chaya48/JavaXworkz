<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>test</title>
</head>
<body>
<h2>Product Name : ${name};</h2>
<br>
<h2>discount: ${(discount/100)*price}</h2>
<br>
<h2>Total Price : &{price -((discount/100)*price) </h2>

</body>
</html>