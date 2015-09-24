<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<a href="Login_Signup.jsp">Login</a>


<c:forEach var="item" items="${key.items}">
					<span>	${item.itemName}&nbsp;<a href="Login_Signup.jsp">Buy</a></span> <br />
</c:forEach>							