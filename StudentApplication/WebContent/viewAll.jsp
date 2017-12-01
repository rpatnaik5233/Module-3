<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> 	STUDENT DETAILS	</h1>
<c:forEach var="student" items="${requestScope.studentList}">
		<table border="1">
		<tr>
			<td>${student.studentId}</td>
			<td>${student.studentName}</td>
			<td>${student.studentDob}</td>
			<td><a href="delete.obj?id=$(student.studentId)">DELETE STUDENT</a></td>
		</tr>
		</table>
	</c:forEach>
</body>
</html>