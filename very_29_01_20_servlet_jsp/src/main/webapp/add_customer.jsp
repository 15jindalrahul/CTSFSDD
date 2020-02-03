<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>List of Customers</title>
</head>




<body>


<form id="form-1" action="controller.do" method="post">
<table BORDER ="1" class="table">
<tbody>
<tr>
<td><label>FIRST NAME</label>
<input type="text" required="required" name="fName">
</td>

<td><label>Last NAME</label>
<input type="text" required="required" name="lName">
</td>


<td><label>EMAIL</label>
<input type="email" name="email" >
</td>
</table>
<input type="submit" value ="add" id="button-1">


</tr>
</tbody>
</form>
</body>






<a href="homecontroller.do"> Back to list</a>
</html>


