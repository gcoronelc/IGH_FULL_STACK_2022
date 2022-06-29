<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>FACTORIAL</h1>
<jsp:include page="cabecera.jsp"></jsp:include>
<div style="margin: 15px 0px;">
<form method="post" action="FactorialController">
	<div>
		<label>Número: </label>
		<input type="number" name="numero">
	</div>
	<div>
		<input type="submit" value="Procesar">
	</div>
	
</form>

<% if(request.getAttribute("numero") != null){ %>

<h1>RESPUESTA</h1>

<p>Número: <%=request.getAttribute("numero")%></p>
<p>Factorial: <%=request.getAttribute("factorial")%></p>

<% } %>
</div>

</body>
</html>