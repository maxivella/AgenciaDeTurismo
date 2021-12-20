<%-- 
    Document   : buscarventa
    Created on : 18-dic-2021, 1:49:50
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Buscar venta</title>
</head>
<body>
	<h1>Buscar venta</h1>

<form action="Svbuscarventa"  method="post">
	        <div >
      <label for="idventa">ID venta: </label><input type="text" name="idventa">
      <br><br>    


			
<input type="submit" value="buscar" />
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