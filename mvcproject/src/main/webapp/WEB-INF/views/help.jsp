<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@page isELIgnored="false" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>List</h1>
<h2>Running...</h2>
   ${Name}
   ${f}
<c:forEach var="item" items="${f}">
     <h3>${item}</h3>
     <c:out value="${f }"></c:out>
</c:forEach>
</body>
</html>



