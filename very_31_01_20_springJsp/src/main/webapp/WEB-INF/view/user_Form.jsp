<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  action="processForm" modelAttribute="user">
email<form:input path="email"/></br>
password<form:input path="password"/></br>

<%--        here we have put form:select which means u have options to select --%>
country<form:select path="country">
<form:option value="INDIA"></form:option>
<form:option value="USA"></form:option>
<form:option value="Pakistan"></form:option>
</form:select></br>
</br>

                                            

<%--Fav Language:
My Sql <form:radiobutton path="favLanguage" value="mySql"/>
Java<form:radiobutton path="favLanguage" value="java" ></form:radiobutton>
Python<form:radiobutton path="favLanguage" value="python"></form:radiobutton><br>

</br>
 --%>






		<label>favLanguage</label>
		</br>
		<INPUT TYPE="radio" NAME="radios" VALUE="radio1" CHECKED>
            mysql
            <BR>
		<INPUT TYPE="radio" NAME="radios" VALUE="radio2">
            java
            <BR>
		<INPUT TYPE="radio" NAME="radios" VALUE="radio3">
             python
            </BR>
		</br>



		<input type="submit" value="login" />

</form:form>



</body>
</html>