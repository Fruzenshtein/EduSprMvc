<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fruit page</title>
</head>
<body>
<h1>Fruit page</h1>
<form:form method="POST" commandName="food" action="food-result.html">
<table>
    <tr>
        <td>Apple </td>
        <td><form:checkbox path="favoriteFruit" value="apple" /></td>
    </tr>
    <tr>
        <td>Orange </td>
        <td><form:checkbox path="favoriteFruit" value="orange" /></td>
    </tr>
    <tr>
        <td>Banana </td>
        <td><form:checkbox path="favoriteFruit" value="banana" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
<br/>
<a href="${pageContext.request.contextPath}/">Main page</a>
</body>
</html>