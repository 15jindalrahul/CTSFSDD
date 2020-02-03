<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form  action="processForm" modelAttribute="student"></form>
First name<form:input path="FirstName"/>
<form;errors  path="FirstName"/>
</br>
lastname<form:input path="LastName"/>
<form;errors path="lastName"/>
</br>
email<form:input path="email"/>
</br>
</BR>
country:
<form:select path="country">
<form:options items="${student.countryOptions}"/>
</form:select>
</br>
</br>
favLanguage:
<form:radiobutton path="favLanguage">
mysql<form:radiobutton path="favLanguage"/>
java<form:radiobutton path="favLanguage"/>
python<form:radiobutton path="favLanguage"/>
sql<form:radiobutton path="favLanguage"/>
</form:radiobutton>
</BR>
</BR>
operatingSystems:
<form:radiobutton path="operatingSystems">
os<form:radiobutton path="operatingSystems"/>
MAC<form:radiobutton path="operatingSystems"/>
</form:radiobutton>



<input type="submit" value="login"/>


</form:form>
</body>
</html>