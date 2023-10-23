<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>X-workz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-primary">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
          <a class="nav-link active" aria-current="page" href="day.jsp">Day</a>
   </div>
</nav>
<h1 align="center">Day Information saved</h1>
<h3>Date is: ${date}</h3>
<br>
<h3>Month is : ${month }</h3>
<br>
<h3>Year is : ${year }</h3>
<br>
<h3>Day is : ${day }</h3>
</body>
</html>