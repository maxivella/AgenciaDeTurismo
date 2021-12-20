<%-- 
    Document   : eliminarventa
    Created on : 18-dic-2021, 1:52:19
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Eliminar venta</title>
</head>
<body>
	<h1>Eliminar venta</h1>

<form action="Sveliminarventa" method="post">

       <label for="idventa">ID venta: </label><input type="text" name="idventa">
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