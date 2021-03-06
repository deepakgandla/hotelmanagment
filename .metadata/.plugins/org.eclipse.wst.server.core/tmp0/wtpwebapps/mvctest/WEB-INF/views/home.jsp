<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<title><c:out value="${page}"></c:out></title>
</head>
<body>
	<h1 class="text-center">Welcome Admin</h1>

	<div class="container">
		<div class="row mt-5">
			<div class="col-md-2">

				<div class="list-group">
					<a href="#" class="list-group-item list-group-item-action active"
						aria-current="true"> Menu </a> <a
						href='<c:url value='/add'></c:url>'
						class="list-group-item list-group-item-action">Add Hotel </a> <a
						href='<c:url value='/hotels'></c:url>'
						class="list-group-item list-group-item-action">View all Hotels</a>
				</div>
			</div>
			<div class="col-md-10">

				<c:if test="${page=='home'}">
					<h2 class="text-center">Progress so far</h2>
					<div class="row">
						<div class="col-sm-6">
							<div class="card">
								<div class="card-body">
									<h5 class="card-title">Collaborated with ${size} hotels so far</h5>
									<p class="card-text"></p>
									<a href="hotels" class="btn btn-primary">See Hotels</a>
								</div>
							</div>
						</div>
						<div class="col-sm-6">
							<div class="card">
								<div class="card-body">
									<h5 class="card-title">Total ${availableRooms} rooms are available </h5>
									<p class="card-text"></p>
									<a href="#" class="btn btn-primary">Add more rooms</a>
								</div>
							</div>
						</div>
					</div>
				</c:if>
				<c:if test="${page=='add'}">
					<h2 class="text-center">Add Hotel here</h2>
					<form:form action="saveHotel" method="post" modelAttribute="hotel"
						enctype="multipart/form-data">
						<div class="form-group">
							<form:input path="name" cssClass="form-control"
								placeholder="Enter hotel name here" required="required" />
						</div>
						</br>
						<div class="form-group">
							<form:textarea path="description" cssClass="form-control"
								placeholder="Enter something about hotel" required="required" />
						</div>
						</br>
						<div class="form-group">
							<h6>Total Rooms</h6>
							<form:input path="totalRooms" cssClass="form-control"
								placeholder="Total Rooms" required="required" />
						</div>
						</br>
						<div class="form-group">
							Image <input type="file" name="image1" class="form-control"
								required="required">
						</div>
						</br>
						<div class="container">
							<button class="btn btn-outline-success">Add Hotel</button>
						</div>

					</form:form>
				</c:if>
				<c:if test="${page=='hotels'}">
					<h2 class="text-center">Available Hotels</h2>
					<c:forEach items="${hotels}" var="hotel">
						<div class="card mb-3">
							<img width="400" height="250" class="card-img-top"
								src="getHotelImage/<c:out value='${hotel.id}'/>"
								alt="Card image cap">

							<div class="card-body">
								<h5 class="card-title">${hotel.name}</h5>
								<p class="card-text">${hotel.description}</p>
								<a href="update/${hotel.id}" class="btn btn-warning">Update</a>
								<a href="delete/${hotel.id}" class="btn btn-danger">Delete</a>
							</div>
						</div>
					</c:forEach>
				</c:if>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
</body>
</html>