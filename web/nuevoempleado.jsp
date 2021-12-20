<%-- 
    Document   : nuevoempleado
    Created on : 18-dic-2021, 1:56:28
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Ingresar empleado</title>
</head>
<body>
	<h1>Ingresar nuevo empleado</h1>

<form action="Svnuevoempleado" method="post">
	        <div >
 



<label for="nombredeempleado">Nombre de empleado: </label><input type="text" name="nombredeempleado">
	<br><br>
<label for="apellidodeempleado">Apellido: </label><input type="text" name="apellidodeempleado">
	<br><br>
<label for="direcciondeempleado">Dirección: </label><input type="text" name="direcciondeempleado">
	<br><br>
<label for="dnideempleado">Dni: </label><input type="text" name="dnideempleado">
	<br><br>
<label for="fechadenacimientodeempleado">Fecha de nacimiento: </label><input type="text" name="fechadenacimientodeempleado">
	<br><br>
<label for="nacionalidaddeempleado">Nacionalidad: </label><input type="text" name="nacionalidaddeempleado">
	<br><br>
<label for="celulardeempleado">Celular: </label><input type="text" name="celulardeempleado">
	<br><br>
<label for="emaildeempleado">Email: </label><input type="text" name="emaildeempleado">
	<br><br>	
<label for="cargodeempleado">Cargo: </label><input type="text" name="cargodeempleado">
	<br><br>
<label for="sueldodeempleado">Sueldo: </label><input type="text" name="sueldodeempleado">
	<br><br>
<label for="codigodeempleado">Código único: </label><input type="text" name="codigodeempleado">
	<br><br>		
			
<input type="submit" value="Ingresar" />
		</div>
</form>
<button onclick="volver()">Volver</button>
<br><br>

 <script>

function volver() {
window.location.replace('index.jsp');
    
    }
</script>   

</body>
</html>