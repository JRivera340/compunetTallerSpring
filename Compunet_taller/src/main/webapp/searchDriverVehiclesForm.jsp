<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Buscar Vehículos del Conductor</title>
</head>
<body>
<h1>Buscar Vehículos por Cédula del Conductor</h1>
<form action="searchDriverVehicles" method="post">
    Número de Identificación: <input type="text" name="numIdentificacion" required/><br/>
    <input type="submit" value="Buscar"/>
</form>
</body>
</html>
