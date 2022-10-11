<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
${error}
${user}

<form action="UpdateController">
User id:
<td><input type="text" name="userid"  value="${user.userid}" readonly="readonly"></td><br>

User Name:<br>
<td><input type="text" name="username" id="username" value="${user.username}"></td><br>
User mobileno:
<br><td><input type="text" name="mobileno" value="${user.mobileno }"></td><br>
User Address:
<br><td><input type="text" name="address" value="${user.address }"></td><br>
User password:
<br><td><input type="text" name="password" value="${user.password }"></td><br>

<input   type="submit" name="update" value="update">




</form>



</body>
</html>