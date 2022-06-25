<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>MCM y MCD</h1>
	<p>MCM: <%=request.getAttribute("mcm") %></p>
	<p>MCD: <%=request.getAttribute("mcd") %></p>
	<p><a href="mcm_mcd.html">Otro calculo</a></p>
</body>
</html>