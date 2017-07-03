<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view by name </title>
</head>
<body>
<table border=1>
<thead>
<tr>
<th>id</th>
<th>bookName</th>
<th>authorName</th>
<th>price</th>
</tr>
</thead>
<tbody>
<c:forEach var="book"  items="${books}">
<tr>
<td>${book.id}</td>
<td>${book.bookName}</td>
<td>${book.authorName}</td>
<td>${book.price}</td>

</tr>
</c:forEach>
</tbody>



</table>
</body>
</html>