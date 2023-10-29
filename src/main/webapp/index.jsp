<html>
<body bgcolor="#c5dec9">
<h2 align="center">Registrar Empleado</h2>


<form method="post" action="ControlaorProducto">
<table border="2" align="center">
<tr>
	<td>Nombre</td>
	<td><input type="text" name="nombre"></td>	
</tr>

<tr>
	<td>Precio</td>
	<td><input type="text" name="precio"></td>	
</tr>

<tr>
	<td>PrecioVen</td>
	<td><input type="text" name="precioven"></td>	
</tr>

<tr>
	<td align="center">Estado<td>
	<select name="estado">
		<option>Seleccione Estado</option>
		<option>Vigente</option>
		<option>Agotado</option>
	</select>
	</td>
</tr>

<tr>
	<td>Descrip</td>
	<td><input type="text" name="descrip"></td>	
</tr>

<tr>
	<td colspan="3" ></td>
	<td align="center"><input type="submit" name="Registra Producto" value="Registrar"></td>
</tr>

</table>
</form>



</body>
</html>
