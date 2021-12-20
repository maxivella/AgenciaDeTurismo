<%-- 
    Document   : modificarcliente
    Created on : 18-dic-2021, 1:53:53
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Modificar cliente</title>
</head>
<body>
	<h1>Modificar cliente</h1>

<form action="Svmodificarcliente" method="post">
	        <div >
      <label for="idcliente">ID cliente: </label><input type="text" name="idcliente">
      <br><br>    

<label for="nombredecliente">Nombre de cliente: </label><input type="text" name="nombredecliente">
	<br><br>
<label for="apellidodecliente">Apellido: </label><input type="text" name="apellidodecliente">
	<br><br>
<label for="direcciondecliente">Dirección: </label><input type="text" name="direcciondecliente">
	<br><br>
<label for="dnidecliente">Dni: </label><input type="text" name="dnidecliente">
	<br><br>
<label for="fechadenacimientodecliente">Fecha de nacimiento: </label><input type="text" name="fechadenacimientodecliente">
	<br><br>
<label for="nacionalidaddecliente">Nacionalidad: </label><input type="text" name="nacionalidaddecliente">
	<br><br>
<label for="celulardecliente">Celular: </label><input type="text" name="celulardecliente">
	<br><br>
<label for="emaildecliente">Email: </label><input type="text" name="emaildecliente">
	<br><br>	

			
<input type="submit" name="accion" value="Guardar cambios" />
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