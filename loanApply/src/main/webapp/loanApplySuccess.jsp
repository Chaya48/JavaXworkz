<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">Home</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation"></button>
		</div>
		<div class="container-fluid">
			<a class="navbar-brand" href="LoanApply.jsp">LoanApply</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation"></button>
		</div>
	</nav>
	<h1 align="center">LoanApplication saved Successfully.........</h1>
	<h3>Name is : ${name }</h3>
	<br>
	<h3>Amount is : ${amount }</h3>
	<br>
	<h3>Working : ${working }</h3>
	<br>
	<h3>Interest is : ${interest }</h3>
	<br>
	<h3>Surety is : ${surety }</h3>
	<br>
	<h3>Company is : ${company }</h3>
	<br>
	<h3>LoanTenure is : ${loanTenure }</h3>
	<br>
	<h3>LoanType is : ${loanType }</h3>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>
</html>