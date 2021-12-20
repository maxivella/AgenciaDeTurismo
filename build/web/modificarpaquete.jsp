<%-- 
    Document   : modificarpaquete
    Created on : 18-dic-2021, 1:55:13
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Modificar paquete</title>
</head>
<body>
	<h1>Modificar paquete</h1>

<form action="Svmodificarpaquete" method="post">
	        <div >
      <label for="idpaquete">ID paquete: </label><input type="text" name="idpaquete">
      <br><br>    

       
      <label for="costodepaquete">Costo: </label><input type="text" name="costodepaquete">
      <br><br>

            <label for="nombreunicodepaquete">Nombre único: </label><input  type="text" name="nombreunicodepaquete">
            <br ><br>


    <label for="idservicios">Id servicios: </label><input type="text" name="idservicios">
      <br><br>   

	<br>		

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