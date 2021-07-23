<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	<p>The Student is Confirmed: ${ student.firstName } ${ student.lastName } </p>
	<br>
	<p>Country: ${ student.country }</p>
	<br>
	<p>Favorite Language: ${ student.favoriteLanguage }</p>
	Operating Systems: 
	<ul>
		<c:forEach var="temp" items="${ student.operatingSystems }">
			<li> ${ temp }</li>
		</c:forEach>
	</ul>
</body>
</html>