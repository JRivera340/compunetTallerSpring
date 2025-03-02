<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Buscar Vehículo</title>
</head>
<body>
<h1>Buscar Vehículo por Placa</h1>
<form action="searchVehicle" method="post">
    Placa: <input type="text" name="placa" required/>
    <input type="submit" value="Buscar"/>
</form>
</body>
</html>