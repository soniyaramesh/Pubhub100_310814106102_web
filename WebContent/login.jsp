<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action ="LoginServlet" method="post">
Email<input type="email" name="email"><br>
Password<input type ="password" name="password"><br>
<button type="submit">LOGIN</button>
<a href ="home.jsp">Go to Home</a>
</form>
</body>
</html>