<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VALIDACIÓN DE FORMULARIO</title>
</head>
<body>
	<h1>VALIDACIÓN DE FORMULARIO</h1>
	<form:form modelAttribute="empleado" action="/verificar" method="post">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><form:input id="nombre" path="nombre" /></td>
				<td style="color: red;"><form:errors path="nombre" /></td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td><form:input id="edad" path="edad" /></td>
				<td style="color: red;"><form:errors path="edad" /></td>
			</tr>
			<tr>
				<td>Correo:</td>
				<td><form:input id="correo" path="correo" /></td>
				<td style="color: red;"><form:errors path="correo" /></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">Procesar</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>