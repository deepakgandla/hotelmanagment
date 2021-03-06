<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>update</title>
</head>
<body>
	<h1 class="text-center">Update the Hotel here</h1>
	<div class="container mt-4">
		<form:form action="${pageContext.request.contextPath }/update_hotel" modelAttribute="hotel">
		   <div class="form-group">
		   ID:
		   <form:input path="id" cssClass="form-control" value="${hotel.id}"/>
		   </div>
			<div class="form-group">
			   Name:
				<form:input path="name" cssClass="form-control"
					value="${hotel.name}" />
			</div>
			</br>
			<div class="from-group">
			    Description
				<form:textarea path="description"
					cssClass="form-control" value="${hotel.description }" />
			</div>
			</br>
			<div class="form-group">
			    Total Rooms
				<form:input path="totalRooms" cssClass="form-control" value="${hotel.totalRooms}" />
			</div>
			</br>
			<div class="container">
				<button class="btn btn-outline-success">Edit</button>
			</div>
		</form:form>
	</div>
</body>
</html>