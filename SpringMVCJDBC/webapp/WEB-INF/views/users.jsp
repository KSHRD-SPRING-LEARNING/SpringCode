<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USER MANAGEMENT</title>
</head>
<body>
	<h1>USER MANAGEMENT LIST</h1>
	<h1>${MESSAGE}</h1>
	<form action="users" method="POST">
		<input type="email" name="email"/>
		<input type="submit" name="submit" value="SUBMIT"/> 
	</form>
</body>
</html>