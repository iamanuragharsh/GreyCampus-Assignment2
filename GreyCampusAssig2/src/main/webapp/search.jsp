<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search</title>
</head>
<body>
	<form action="/search" method="post">
		<div>
			<label>Cid</label><input type="text" name="cid">
		</div>
		<div>
			<label>Customer Name</label><input type="text" name="name">
		</div>
		<div>
			<label>Phone</label><input type="text" name="phone">
		</div>
		<div>
			<button type="submit">Seach</button>
		</div>
	</form>
</body>
</html>