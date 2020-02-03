<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"   %> 
 <%@  page isELIgnored="false" %>  
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form id="form-1" action="updatecontroller.do" method="post">
<input type="hidden" value="${customer.id}" name="id">
<table BORDER ="1" class="table">
<tbody>
<tr>
<td><label>FIRST NAME</label>
<input type="text" required="required" name="fName" value="${customer.firstName }" />
</td>

<td><label>Last NAME</label>
<input type="text" required="required" name="lName" value="${customer.lastName }"/>
</td>


<td><label>EMAIL</label>
<input type="email" name="email" value="${customer.email }"/ >
</td>
</table>
<input type="submit" value ="update" id="button-1">

</body>
</html>