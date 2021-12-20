<%-- 
    Document   : nuevopaquete
    Created on : 18-dic-2021, 1:55:55
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Ingresar paquete</title>
</head>
<body>
	<h1>Ingresar nuevo paquete</h1>

<form action="Svnuevopaquete" method="post">
	        <div >
           
			<!--<label for="costodepaquete">Costo: </label><input type="text" name="costodepaquete">-->
			<!--<br><br>-->

            <label for="nombreunicodepaquete">Nombre único: </label><input  type="text" name="nombreunicodepaquete">
            <br ><br>



<label for="idserviciosdepaquete">Servicios del paquete:</label><input  type="text" name="idserviciosdepaquete">
  


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