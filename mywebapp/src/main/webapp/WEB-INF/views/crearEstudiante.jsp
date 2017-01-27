<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Vista crear usuario</h2>

	<spring:url value="/estudiantes/add" var="addEstudianteURL" />

	<form:form method="POST" action="${addEstudianteURL}" modelAttribute="estudianteForm">
		<table>
			<tr>
				<td><form:label path="nombre">Nombre</form:label></td>
				<td><form:input path="nombre" /></td>
			</tr>
			<tr>
				<td><form:label path="apellido">Apellido</form:label></td>
				<td><form:input path="apellido" /></td>
			</tr>
			<tr>
				<td><form:label path="nivelDeEstudios">Nivel de Estudios</form:label></td>
				<td><form:select path="nivelDeEstudios" class="form-control">
						<form:option value="NONE" label="--- Select ---" />
						<form:options items="${nivelEstudios}" />
					</form:select>
				</td>
			</tr>

		</table>


		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>