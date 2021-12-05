<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SAVE Customer</title>
</head>
<body>
	<form action="/save" method="post">

		<div>
			<label>Customer No</label><input type="text" name="cid">
		</div>
		<div>
			<label>Customer Name</label><input type="text" name="name">
		</div>
		<div>
			<label for="type">Customer Type</label> <select name="type" id="type">
				<option value="select">Select</option>
				<option value="cheap">Cheap Customer</option>
				<option value="educated">Educated Customer</option>
				<option value="driven">Driven Customer</option>
			</select>
		</div>
		<div>
			<label>Phone No</label><input type="text" name="phone">
		</div>
		<div>
			<label>Customer Address :</label><br> <label>Street</label><input
				type="text" name="street"> <br> <label>City</label><input
				type="text" name="city"><br> <label>State</label><input
				type="text" name="state"><br> <label>Country</label><input
				type="text" name="country"><br>
		</div>
		<div>
			<label>Created By</label><input type="text" name="created_by">
		</div>
		<div>
			<label>Created On</label><input type="date" name="date">
		</div>


		<div>
			<button type="submit">Save</button>
		</div>
	</form>
</body>
</html>