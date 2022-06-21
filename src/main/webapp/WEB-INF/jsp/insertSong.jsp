<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add Song</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">
</head>
<body class="d-flex h-100 text-center text-white bg-dark"
	data-new-gr-c-s-check-loaded="14.1063.0" data-gr-ext-installed="">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		<header class="mb-auto">
			<div>
				<h3 class="float-md-start mb-0">Spotify Clone</h3>
				<nav class="nav nav-masthead justify-content-center float-md-end">
				</nav>
			</div>
		</header>
		<main class="px-3">


			<h1>Add New Song</h1>
			<form:form method="post" action="save">
				<table>
					<tr>
						<td>Song Name</td>
						<td><form:input path="songName" /></td>
					</tr>
					<tr>
						<td>Date of release</td>
						<td><form:input path="dateOfRelease" /></td>
					</tr>
					<tr>
						<td>Artist</td>
						<td><form:input path="artist" /></td>
					</tr>
					<tr>
						<td>Rating</td>
						<td><form:input path="rating" /></td>
					</tr>

					<tr>
						<td></td>

						<td><input type="submit" value="Save" /></td>
					</tr>
				</table>
			</form:form>
		</main>
	</div>








	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>
</html>




