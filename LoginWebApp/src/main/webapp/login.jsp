<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${logOnError}
<form action="login" method="post">
<label>UserName:</label>
<input type="text" name="userName"><br>
<label>Password: </label>
<input type="password" name="password"><br>
<input type="submit" value="Login">
</form>
</body>
</html>