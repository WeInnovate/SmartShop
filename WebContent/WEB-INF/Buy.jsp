<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#E6E6FA">
<form action="" method="POST">
<center>
<table style="weidth:30%">
<tr>
<td>Item Name:</td>
</tr>
<tr>
<td>Item ID:</td>
</tr>
<tr>
<td> Item Description:</td>
</tr>
<tr>
<td>Quantity</td>
<td><input type="text" name="quantity" value=""/>
</td>
</tr>
<tr>
<td>Price:</td>
</tr>
<tr>
<td>Address:</td>
<td><input type="text" name="address" /></td>
<!-- <td><input type="text" name="address" value=""/></td> -->
</tr>
<tr>
<td></td>
<td><select>
  <option value="Bangalore">Bangalore</option>
  <option value="Pune">Pune</option>
  <option value="Gurgaon">Gurgaon</option>
  <option value="Agra">Agra</option>
</select></td>
</tr>
<tr>
<td><input type="submit" value="Enter"/></td>
</tr>
</table>
</center>
</form>
</body>
</html>