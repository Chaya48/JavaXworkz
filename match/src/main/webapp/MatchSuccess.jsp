<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>X-workz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
  <body>
  <nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.jsp">home</a>
    <a class="navbar-brand" href="Match.jsp">Match</a>
  </div>
</nav>
    <h1 align="center">Match Information saved successfully</h1>
    <br>
    <h3>Tournament Name : ${ name}</h3>
    <br>
    <h3>Hosting Country : ${ country}</h3>
    <br>
    <h3>MatchDate : ${ date}</h3>
    <br>
    <h3>Team One : ${ team1}</h3>
    <br>
    <h3>Team Two : ${team2 }</h3>
    <br>
    <h3>Team One Captain Name : ${team1CName }</h3>
    <br>
    <h3>Team Two Captain Name  : ${team2CName }</h3>
    <br>
    <h3>Umpire Name : ${umpireName }</h3>
    <br>
    <h3>Stadium Name : ${stadiumName }</h3>
    <br>
    <h3>ThirdUmpireName : ${thirdUmpireName }</h3>
    <br>
    <h3>StadiumCapacity : ${stadiumCapacity }</h3>
    <br>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
  </body>
</html>