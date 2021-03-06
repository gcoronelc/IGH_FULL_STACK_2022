<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>TABLA DE MULTIPLICAR</title>
</head>
<body>

	<div class="container">

		<h1>TABLA DE MULTIPLIZAR</h1>

		<div class="card">
			<div class="card-header">DATOS</div>
			<div class="card-body">

				<form id="frmData" action="TablaController" method="post">
					<div class="form-group row">
						<label for="numero" class="col-sm-2 col-form-label">N?mero</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="numero" name="numero">
						</div>
					</div>
					<div class="form-group row">
						<button type="button" id="btnProcesar" class="btn btn-primary">Procesar</button>
					</div>
				</form>

			</div>



		</div>

		<div id="divResultado"></div>

	</div>

	<script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
	<script type="text/javascript">
		$("#btnProcesar").click(fnProcesar);

		function fnProcesar() {
			let data = $("#frmData").serialize();
			let URL = "TablaController?" + data;
			$("#divResultado").load(URL);
		}
	</script>

</body>
</html>