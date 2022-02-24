<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h2>Called by home Controller</h2>
<h3>url/home</h3>


<%
    String s=(String)request.getAttribute("name");
    Integer s1=(Integer)request.getAttribute("id");
%>
<%   List<String> list=(List<String>)request.getAttribute("f"); 
%>

<h3> Name is:<%= s %></h3>
<h2> Secound Name is:<%= s1 %></h2>
<<c:out value="${list}"></c:out>

</body>
</html>