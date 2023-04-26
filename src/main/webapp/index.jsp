<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Datos del cliente</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

<link rel="icon" href="<c:url value="img/formulario.png"></c:url>">



</head>
<body>
<div class="container text-center">
<h1>Datos del Cliente</h1>

<form action="Controller" method="post" class="form-control needs-validation" novalidate>
<div class="row">
<div class="col-4">
<label for="nombre" class="label-group">Nombre del cliente:</label>
<input type="text" name="nombre" class="form-control" required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ ]+" 
value="${param.nombre}">
</div>


<div class="col-4">
<label for="apellidos" class="label-group">Apellidos del cliente:</label>
<input type="text" name="apellidos" class="form-control" required pattern="[a-zA-ZáéíóúñÁÉÍÓÚÑ ]+" 
value="${param.apellidos}">
</div>

<div class="col-4">
<label for="telefono" class="label-group">Teléfono cliente:</label>
<input type="tel" name="telefono" class="form-control" required pattern="[6789]{1}[0-9]{8}" >
</div>


</div>

<div class="row pt-4">
<div class="col-2">
<input type="submit" name="enviar" value="Aceptar">
</div>
</div>

</form>
</div>
<div class="container pt-4">
<c:if test="${not empty mensaje}">
	<c:out value="${mensaje}"/>
</c:if>

	
	<c:if test="${not empty clientes}">
	<table class="table table-striped">
	
	<tr>
	<th>Id del cliente</th>
	<th>Nombre del cliente</th>
	<th>Apellidos del cliente</th>
	<th>Teléfono del cliente</th>
	<th>Acciones</th>
	</tr>
	
	<c:forEach items="${clientes}" var="cliente">
	<tr>
	<td><c:out value="${cliente.idCliente}"></c:out></td>
	<td><c:out value="${cliente.nombreCliente}"></c:out></td>
	<td><c:out value="${cliente.apellidosCliente}"></c:out></td>
	<td><c:out value="${cliente.telefonoCliente}"></c:out></td>
	<td>
		<a href="#" >Editar &#9998;</a>
		<a href="#" >Eliminar &#128465;</a>		
	</td>
	
	</tr>
	</c:forEach>
	
	
	</table>
	
	</c:if>
	
	</div>
	
<script src="<c:url value="/js/script.js"/>">
</script>


</body>
</html>