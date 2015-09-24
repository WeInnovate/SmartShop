<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register.spring" method="post">
<h1>Enter Details</h1>
<table style="width:20%">
<tr>
<td>Name:</td>
<td><input type="text" name="name" value="name"/></td>
</tr>
<tr>
<td>User Name:</td>
<td><input type="text" name="userName" value=""/></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password" value=""/></td>
</tr>
<tr>
<td>Mobile:</td>
<td><input type="text" name="mobile" value=""/></td>
</tr>
</table>
<input type="submit" name="Enter" value="Enter"/>
<input type="reset" name="Clear"/>
</form>
<form action="login.spring" method="post">
<h1>Login here</h1>
<table style="width:20%">
<tr>
<td>User Name:</td>
<td><input type="text" name="userName" value=""/></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password" value=""/></td>
</tr>
</table>
<input type="submit" name="Enter" value="Enter"/>
<input type="reset" name="Clear"/>
</form>
</body>
</html>