<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saved Successfully</title>
</head>
<body>
	Saved Successfully ${customer.cid }
	<br> ${customer.name }
	<br> ${customer.type }
	<br> ${customer.phone}
	<br> ${customer.street }
	<br> ${customer.city }
	<br> ${customer.state }
	<br> ${customer.country }
	<br> ${customer.created_by }
	<br> ${customer.created_on }
	<br>
	<a href="save">Add New Customer</a>
</body>
</html>