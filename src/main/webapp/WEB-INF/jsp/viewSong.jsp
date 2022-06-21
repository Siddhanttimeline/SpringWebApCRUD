<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>View Songs</title>
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
				<h3 class="float-md-start mb-0">Top 10 Songs</h3>
				<nav class="nav nav-masthead justify-content-center float-md-end">
				</nav>
			</div>
		</header>

		<main class="px-3">
			<br>
			<table border="2" width="70%" cellpadding="2">
				<tr>
					<th>Id</th>
					<th>Song Name</th>
					<th>Date of release</th>
					<th>Artist</th>
					<th>Rating</th>
				</tr>
				<c:forEach var="sng" items="${list}">
					<tr>
						<td>${sng.id}</td>
						<td>${sng.songName}</td>
						<td>${sng.dateOfRelease}</td>
						<td>${sng.artist}</td>
						<td>${sng.rating}</td>
					</tr>
				</c:forEach>
			</table>
			<br /> <a class="btn btn-primary" href="insertSong" role="button">Add
				new song</a>

		</main>
	</div>







	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
		crossorigin="anonymous"></script>
</body>
</html>






