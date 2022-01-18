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
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.1/css/all.css"
	integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP"
	crossorigin="anonymous">

<style>
body, html {
	margin: 0;
	padding: 0;
	height: 100%;
	background: #FFFC00 !important;
}

.user_card {
	width: 350px;
	margin-top: auto;
	margin-bottom: auto;
	background: #FFFBE4;
	position: relative;
	display: flex;
	justify-content: center;
	flex-direction: column;
	padding: 10px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
	-webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
	-moz-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
	border-radius: 25px;
}

.form_container {
	margin-top: 20px;
}

#form-title {
	color: rgb(36, 184, 176);
}

.login_btn {
	width: 100%;
	background: #33ccff !important;
	color: white !important;
}

.login_btn:focus {
	box-shadow: none !important;
	outline: 0px !important;
}

.login_container {
	padding: 0 2rem;
}

.input-group-text {
	background: #f7ba5b !important;
	color: white !important;
	border: 0 !important;
	border-radius: 0.25rem 0 0 0.25rem !important;
}

.input_user, .input_pass:focus {
	box-shadow: none !important;
	outline: 0px !important;
}
</style>
<title>Register</title>
</head>
<body>
	<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
				<div class="d-flex justify-content-center">
					<h3 id="form-title">REGISTER ACCOUNT</h3>
				</div>
				<div class="d-flex justify-content-center form_container">

					<form:form method="post" action="${pageContext.request.contextPath}/register_user"
						modelAttribute="user">

						<div class="input-group mb-3">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<form:input path="name" placeholder="Enter name...." />
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i
									class="fas fa-envelope-square"></i></span>
							</div>
							<form:input path="email" placeholder="Email...." />
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<form:password path="password" placeholder="Password.." />
						</div>
						<div class="input-group mb-2">
							<div class="input-group-append">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" name="password2"
								placeholder="Re-enter password" />
						</div>

						<div class="d-flex justify-content-center mt-3 login_container">
							<input class="btn login_btn" type="submit"
								value="Register Account">
						</div>
					</form:form>
				</div>

				<div class="mt-4">
					<div class="d-flex justify-content-center links">
						Already have an account? <a href="${pageContext.request.contextPath }/login" class="ml-2">Login</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		/* Because i didnt set placeholder values in forms.py they will be set here using vanilla Javascript
		//We start indexing at one because CSRF_token is considered and input field
		 */

		//Query All input fields
		var form_fields = document.getElementsByTagName('form:input')
		form_fields[1].placeholder = 'Username..';
		form_fields[2].placeholder = 'Email..';
		form_fields[3].placeholder = 'Enter password...';
		form_fields[4].placeholder = 'Re-enter Password...';

		for ( var field in form_fields) {
			form_fields[field].className += ' form-control'
		}
	</script>



</body>
</html>
</body>
</html>