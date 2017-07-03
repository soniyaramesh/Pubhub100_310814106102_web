<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete</title>
</head>
<body>
<form action="DeleteServlet" method="post">
Id<input type="number" name="id"><br><br>
Book name<input type="text" name="name"><br><br>
<button type="submit">Delete</button><br><br>
<a href ="home.jsp">Go to Home</a>
</form>
</body>
</html>