<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Table Reserve page</title>
</head>
<body>
<h1>Table Reserve page</h1>
<form:form method="POST" commandName="tableReserve" action="table-reserve-result.html">
<table>
    <tr>
        <td>Smoking</td>
        <td><form:radiobutton path="smokeZone" value="yes" /></td>
    </tr>
    <tr>
        <td>No Smoking</td>
        <td><form:radiobutton path="smokeZone" value="no" /></td>
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