<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employees</title>
</head>
<body>
	<table border="1px">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Mobile</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Age</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
		</tr>

		<c:forEach var="employee" items="${requestScope.employees}">
			<tr>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
				<td>${employee.email}</td>
				<td>${employee.mobile}</td>
				<td>${employee.age}</td>
				<td>${employee.gender}</td>
				<td>${employee.city}</td>
				<td>${employee.state}</td>
				<td>${employee.country}</td>
			</tr>
		</c:forEach>



	</table>
</body>
</html>