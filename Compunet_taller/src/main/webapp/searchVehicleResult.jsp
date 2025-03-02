<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado de Búsqueda</title>
</head>
<body>
<h1>Resultado de Búsqueda del Vehículo</h1>
<%
    co.icesi.compunet_taller.model.Vehicle vehicle =
            (co.icesi.compunet_taller.model.Vehicle) request.getAttribute("vehicle");
    if (vehicle != null) {
%>
<p>Placa: <%= vehicle.getPlaca() %></p>
<p>Marca: <%= vehicle.getMarca() %></p>
<p>Modelo: <%= vehicle.getModelo() %></p>
<%
} else {
%>
<p>No se encontró vehículo con la placa indicada.</p>
<%
    }
%>
</body>
</html>
