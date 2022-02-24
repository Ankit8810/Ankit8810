<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show page</title>
</head>
<h1>${head}</h1>
<h2>${Des}</h2>
<body>
<hr>
<h1>${user.email}</h1>
<h2> ${user.pass}</h2>
</body>
</html>