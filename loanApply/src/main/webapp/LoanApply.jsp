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
	<h1 align="center">LoanApplication Information.........</h1>
	<form action="loan" method="post">
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Name</span> <input
				type="text" class="form-control" placeholder="name" name="name">
		</div>
		<br>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Amount</span> <input
				type="number" class="form-control" placeholder="Amount"
				name="amount">
		</div>
		<br>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Working</span> <input
				type="text" class="form-control" placeholder="working"
				name="working">
		</div>
		<br>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Interest</span> <input
				type="number" class="form-control" placeholder="interest"
				name="interest">
		</div>
		<br>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Surety</span> <input
				type="text" class="form-control" placeholder="surety" name="surety">
		</div>
		<br>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">Company</span> <input
				type="text" class="form-control" placeholder="company"
				name="company">
		</div>
		<br>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">LoanTenure</span> <input
				type="text" class="form-control" placeholder="loanTenure"
				name="loanTenure">
		</div>
		<br>
		<div class="input-group mb-3">
			<span class="input-group-text" id="basic-addon1">LoanType</span> <input
				type="text" class="form-control" placeholder="loanType"
				name="loanType" >
		</div>
		<br>
		<fieldset class="row mb-3">
			<legend class="col-form-label col-sm-2 pt-0">Accept the
				Terms</legend>
			<div class="col-sm-10">
				<div class="form-check">
					<input class="form-check-input" type="radio" name="terms"
						id="gridRadios1" value="yes" checked> <label
						class="form-check-label" for="gridRadios1"> Yes </label>
				</div>
				<div class="form-check">
					<input class="form-check-input" type="radio" name="terms"
						id="gridRadios2" value="no"> <label
						class="form-check-label" for="gridRadios2"> No </label>
				</div>
				<button type="submit" class="btn btn-primary">Save</button>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>
</html>