<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<center>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body style="background-color:powderblue;">

<h1 style ="color:white;font-size:60px;background-color:rgb(100,10,10);text-align:center;"> Xpert IT Institute</h1>
<br>
To visit our site:
<a href= "http://xpertitinstitute.com/" > click here</a>
<p style ="color:red;text-align:center;"> Welcome in the world of Coding!!</p><br>
<br>
<img src="https://thumbor.forbes.com/thumbor/960x0/https%3A%2F%2Fspecials-images.forbesimg.com%2Fimageserve%2F5e7cce1921695a000666cc29%2FJava-14%2F960x0.jpg%3Ffit%3Dscale" alt="image" width="150" height="108">
<br>Already member?<p style="color:blue">Login</p> 
<form action="LoginController">
<h4 style="color:red;background-color:white;">${Message}</h4><br>

User Name:<br>
<input type = "text" name ="username">
<br>
password: 
<br> 
<input type = "password" name ="password"><br>
<br>
<input type="submit" value = "login"><br><br>

<a href ="fill.jsp">Sign in </a><br>



</center>


</form>
</body>
</html>