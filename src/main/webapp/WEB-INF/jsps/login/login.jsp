<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Login Here</h2>
	<form action="verifyLogin" method="post">
		emailid<input type="text" name="email"/>
		password<input type="text" name="password"/>
		
		<input type="submit" value="login"/>
	</form>
	${error}

</body>
</html>