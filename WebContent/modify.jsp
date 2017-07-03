<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update</title>
</head>
<body>
<form action="UpdateServlet" method="post">
Book name<input type="text" name="name"><br>
Price<input type ="text" name="price"><br>
<button type="submit"> Edit</button>
<a href="home.jsp">Go to Home</a>
</form>

</body>
</html>