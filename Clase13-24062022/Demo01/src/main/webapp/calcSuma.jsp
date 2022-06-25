<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	// Variables
	int num1, num2, suma;
	// Datos
	num1 = Integer.parseInt(request.getParameter("num1"));
	num2 = Integer.parseInt(request.getParameter("num2"));
	// Proceso
	suma = num1 + num2;
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>SUMA</h1>
	<p>Número 1: <%=num1%> </p>
	<p>Número 2: <%=num1%> </p>
	<p>Suma: <%=suma%> </p>
	<a href="suma.html">Otra operación</a>
</body>
</html>