<%-- 
    Document   : modificarservicio
    Created on : 18-dic-2021, 1:54:57
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Modificar servicio</title>
</head>
<body>
	<h1>Modificar servicio</h1>

<form action="Svmodificarservicio" method="post">
	        <div >
      <label for="idservicio">ID servicio: </label><input type="text" name="idservicio">
      <br><br>    

<label for="nombredeservicio">Nombre: </label><input type="text" name="nombredeservicio">
  <br><br>
<label for="descripciondeservicio">Descripcion: </label><br><textarea  name="descripciondeservicio" rows="4" cols="50">

</textarea> 
  <br><br>

<label for="destinodeservicio">Destino: </label><input type="text" name="destinodeservicio">
  <br><br>
<label for="fechadeservicio">Fecha: </label><input type="text" name="fechadeservicio">
  <br><br>
<label for="costodeservicio">Costo: </label><input type="text" name="costodeservicio">
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