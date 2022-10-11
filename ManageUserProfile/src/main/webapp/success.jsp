<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<form action="ShowDataController">
<body style="background-color:white">
<center>
<p style="background-color:orange">Welcome!!</p>
<h1 style="color:black;background-color:green">Xpert IT Institute</h1>
Represents :
<input type="submit" name ="data" value="getdata"><br>

<table class="tblAlign" border="1">
<tr>
<th>userid</th>
<th>usrename</th>
<th>mobileno</th>
<th>address</th>
<th>password</th>

</tr>
<c:forEach var="userb" items="${data}">
<tr>

	<td><c:out value="${userb.userid}"></c:out></td>
	<td><c:out value="${userb.username}"></c:out></td>
		<td><c:out value="${userb.password}"></c:out></td>
	
	<td><c:out value="${userb.mobileno}"></c:out></td>
	<td><c:out value="${userb.address}"></c:out></td>
	
	<td>
<a href="DeleteDataController?userid=<c:out value="${userb.userid}"></c:out>&username=<c:out value ="${userb.username}"></c:out>">delete</a>
</td>

<td>


<a href="UpdateController?userid=<c:out value="${userb.userid}"></c:out>">update</a>
</td>
			
</tr>
</c:forEach>

</table>

</form>
</center>
</body>
</html>