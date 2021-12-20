<%-- 
    Document   : eliminarpaquete
    Created on : 18-dic-2021, 1:52:38
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Eliminar paquete</title>
</head>
<body>
	<h1>Eliminar paquete</h1>

<form action="Sveliminarpaquete" method="post">
	       

       <label for="idpaquete">ID paquete: </label><input type="text" name="idpaquete">
      <br><br>  

<input type="submit" name="accion" value="Eliminar" />		


		
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