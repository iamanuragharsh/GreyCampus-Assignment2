<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update successful</title>
</head>
<body>
	Updated Successfully ${customer.cid }
	<br> ${customer.name }
	<br> ${customer.type }
	<br> ${customer.phone }
	<br> ${customer.street }
	<br> ${customer.city }
	<br> ${customer.state }
	<br> ${customer.country }
	<br> ${customer.modified_by }
	<br> ${customer.modified_on }
	<a href="update">Update more Customer</a>
</body>
</html>