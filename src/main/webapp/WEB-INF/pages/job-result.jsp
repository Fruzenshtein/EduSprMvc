<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job result page</title>
</head>
<body>
	<h1>Job result page</h1>
	<c:choose>
		<c:when test="${job.parking != null}">You want job with ${job.parking}</c:when>
		<c:otherwise>You want job without parking</c:otherwise>
	</c:choose>
	<br />
	<a href="${pageContext.request.contextPath}/">Main page</a>
</body>
</html>