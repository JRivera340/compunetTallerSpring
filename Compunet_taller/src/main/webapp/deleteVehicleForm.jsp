<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Eliminar Vehículo</title>
</head>
<body>
<h1>Eliminar Vehículo por Placa</h1>
<form action="deleteVehicle" method="post">
    Placa: <input type="text" name="placa" required/>
    <input type="submit" value="Eliminar"/>
</form>
</body>
</html>
