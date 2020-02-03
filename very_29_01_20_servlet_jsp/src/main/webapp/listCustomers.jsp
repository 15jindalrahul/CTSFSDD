<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>




<%--     these are two annotations to learn and  always to put --%>



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page isELIgnored="false"%>





<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>List OF Customers here</title>
</head>


<body>
	<table border=1>
		<input type="button" value="Add customer" id="button-1"
			onclick="window.location.href='add_customer.jsp'; return false;">
		<thead>
			<tr>
				<td scope="col">first name</td>
				<td scope="col">first name</td>
				<td scope="col">email</td>
				<td scope="col">action</td>
			</tr>
		</thead>

		<c:forEach var="tempCustomer" items="${Customers}">
			<c:url var="updateUrl" value="updatecontroller.do ">
            < c:param name="id" value="${tempCustomer.id }"/>
    </c:url>


			<c:url var="deleteUrl" value="deletecontroller.do ">
				<c:param name="id"  value="${tempCustomer.id }"/>
 </c:url>


			<tr>
				<td>${tempCustomer.firstName}</td>
				<td>${tempCustomer.lastName}</td>
				<td>${tempCustomer.email}</td>
				<td><a href="${updateUrl}"> update </a>/<a href="${deleteUrl}">
						delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>