<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Table Reserve result page</title>
</head>
<body>
<h1>Table Reserve result page</h1>
Do you choose smoking table? <br/>
Answer is: [ <b>${tableReserve.smokeZone}</b> ] <br/>
<a href="${pageContext.request.contextPath}/">Main page</a>
</body>
</html>