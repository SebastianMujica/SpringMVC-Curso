<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
	<link rel="stylesheet"href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<title>Contactos</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Contactos</h1>
				<p>Todos los Contactos</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<c:forEach items="${contacto}" var="contacto">
				<div class="col-sm-6 col-md-3">
					<div class="thumbnail">
						<div class="caption">
							<h3>${contacto.id}</h3>
							<h3>${contacto.nombre}</h3>
							<p>${contacto.apodo}</p>
							<h3>${contacto.fechaCreacion}</h3>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>