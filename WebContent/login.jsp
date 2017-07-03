<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="93d8d3">
<form action ="LoginServlet" method="post">
Email<input type="email" name="email"><br><br>
Password<input type ="password" name="password"><br><br>
<button type="submit">LOGIN</button><br><br>
<a href ="home.jsp">Go to Home</a>
</form>
</body>
</html>