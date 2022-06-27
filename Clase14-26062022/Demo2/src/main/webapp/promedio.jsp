<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>PROMEDIO</h1>
	<jsp:include page="cabecera.jsp"></jsp:include>
	<div style="margin: 15px 0px;">
		<form method="post" action="PromedioController">
			<div>
				<label>Número: </label> 
				<input type="number" name="num1">
			</div>
			<div>
				<label>Número: </label> 
				<input type="number" name="num2">
			</div>
			<div>
				<label>Número: </label> 
				<input type="number" name="num3">
			</div>
			<div>
				<input type="submit" value="Procesar">
			</div>

		</form>

		<c:if test="{prom!=null}">
			<h1>RESULTADO</h1>
			<p>Número 1: ${num1}</p>
			<p>Número 2: ${num2}</p>
			<p>Número 3: ${num3}</p>
			<p>Promedio: ${prom}</p>
		</c:if>
		
		
	</div>
</body>
</html>