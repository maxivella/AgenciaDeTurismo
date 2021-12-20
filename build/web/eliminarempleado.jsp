<%-- 
    Document   : eliminarempleado
    Created on : 18-dic-2021, 1:52:06
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Eliminar empleado</title>
</head>
<body>
	<h1>Eliminar empleado</h1>

<form action="Sveliminarempleado" method="post">
	        <div >

       <label for="idempleado">ID empleado: </label><input type="text" name="idempleado">
      <br><br>  
	
<input type="submit" name="accion" value="Eliminar" />		


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