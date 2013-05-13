<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sport page</title>
</head>
<body>
<h1>Sport page</h1>
<form:form method="POST" commandName="sport" action="sport-result.html">
<table>
    <tr>
    <td>
	    <ul>
	    	<form:radiobuttons element="li" path="favSport" items="${sportList}"/>
	    </ul>
    </td>
    </tr>
    <tr>
        <td>
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
<br/>
<a href="${pageContext.request.contextPath}/">Main page</a>
</body>
</html>