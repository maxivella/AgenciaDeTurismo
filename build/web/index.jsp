<%-- 
    Document   : index
    Created on : 01-dic-2021, 20:14:00
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Agencia de turismo</title>
</head>
<body>
	<h1>SOFTWARE DE GESTIÓN DE AGENCIA DE TURISMO</h1>

<table>
	<tr>
		<td> Ventas: </td>
	    <td> <a href="nuevaventa.jsp"> <img src="imagenes/iconoingresar.jpg" alt="I" style="width:62px;height:62px;"> </a> </td>     
	    <td> <a href="eliminarventa.jsp"> <img src="imagenes/iconoeliminar.jpg" alt="E" style="width:62px;height:62px;"> </a>  </td>     
	    <td> <a href="modificarventa.jsp"> <img src="imagenes/iconomodificar.jpg" alt="M" style="width:62px;height:62px;"> </a>  </td>    
	    <td> <a href="buscarventa.jsp"> <img src="imagenes/iconobuscar.jpg" alt="B" style="width:62px;height:62px;"> </a>  </td>
	</tr>

	<tr>
		<td> Servicios:  </td>
		<td> <a href="nuevoservicio.jsp"> <img src="imagenes/iconoingresar.jpg" alt="I" style="width:62px;height:62px;"> </a> </td>     
	    <td> <a href="eliminarservicio.jsp"> <img src="imagenes/iconoeliminar.jpg" alt="E" style="width:62px;height:62px;"> </a>  </td>     
	    <td> <a href="modificarservicio.jsp"> <img src="imagenes/iconomodificar.jpg" alt="M" style="width:62px;height:62px;"> </a>  </td>    
	    <td> <a href="buscarservicio.jsp"> <img src="imagenes/iconobuscar.jpg" alt="B" style="width:62px;height:62px;"> </a>  </td>
	</tr>

	<tr>
		<td> Paquetes: </td>
		<td> <a href="nuevopaquete.jsp"> <img src="imagenes/iconoingresar.jpg" alt="I" style="width:62px;height:62px;"> </a> </td>     
	    <td> <a href="eliminarpaquete.jsp"> <img src="imagenes/iconoeliminar.jpg" alt="E" style="width:62px;height:62px;"> </a>  </td>     
	    <td> <a href="modificarpaquete.jsp"> <img src="imagenes/iconomodificar.jpg" alt="M" style="width:62px;height:62px;"> </a>  </td>    
	    <td> <a href="buscarpaquete.jsp"> <img src="imagenes/iconobuscar.jpg" alt="B" style="width:62px;height:62px;"> </a>  </td>
	</tr>

	<tr>
		<td> Clientes: </td>      
		<td> <a href="nuevocliente.jsp"> <img src="imagenes/iconoingresar.jpg" alt="I" style="width:62px;height:62px;"> </a> </td>     
	    <td> <a href="eliminarcliente.jsp"> <img src="imagenes/iconoeliminar.jpg" alt="E" style="width:62px;height:62px;"> </a>  </td>     
	    <td> <a href="modificarcliente.jsp"> <img src="imagenes/iconomodificar.jpg" alt="M" style="width:62px;height:62px;"> </a>  </td>    
	    <td> <a href="buscarcliente.jsp"> <img src="imagenes/iconobuscar.jpg" alt="B" style="width:62px;height:62px;"> </a>  </td>
	</tr>

	<tr>
		<td> Empleados: </td>      
		<td> <a href="nuevoempleado.jsp"> <img src="imagenes/iconoingresar.jpg" alt="I" style="width:62px;height:62px;"> </a> </td>     
	    <td> <a href="eliminarempleado.jsp"> <img src="imagenes/iconoeliminar.jpg" alt="E" style="width:62px;height:62px;"> </a>  </td>     
	    <td> <a href="modificarempleado.jsp"> <img src="imagenes/iconomodificar.jpg" alt="M" style="width:62px;height:62px;"> </a>  </td>    
	    <td> <a href="buscarempleado.jsp"> <img src="imagenes/iconobuscar.jpg" alt="B" style="width:62px;height:62px;"> </a>  </td>
	</tr>
    <tr>
        <td >
           <!--<a href="verganancias.jsp">Ganancias</a> -->
        </td>	
    </tr>

</table>
<br>

<br><br>

<table>
<tr>

<td>	
<img src="imagenes/iconoingresar.jpg" alt="I"  style="width:22px;height:22px;">
</td>
<td>
:
</td>
<td>
 Ingresar nuevo
</td>

</tr>

<tr>
<td>	
<img src="imagenes/iconoeliminar.jpg" alt="E"  style="width:22px;height:22px;">
</td>
<td>
:
</td> 
<td>
Eliminar
</td>

</tr>

<tr>
<td>	
<img src="imagenes/iconomodificar.jpg" alt="M"  style="width:22px;height:22px;">
</td>
<td>
:
</td>
<td>
Modificar 
</td>
</tr>

<tr>
<td>
<img src="imagenes/iconobuscar.jpg" alt="B"  style="width:22px;height:22px;">
</td>
<td>
:
</td>
<td>
Buscar
</td> 
</tr>

</table>
</body>
</html>