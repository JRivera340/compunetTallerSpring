<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.List, co.icesi.compunet_taller.model.Vehicle" %>
<html>
<head>
    <title>Listado de Vehículos</title>
</head>
<body>
<h1>Listado de Vehículos</h1>
<table border="1">
    <tr>
        <th>Placa</th>
        <th>Marca</th>
        <th>Modelo</th>
    </tr>
    <%
        List<co.icesi.compunet_taller.model.Vehicle> vehicles =
                (List<co.icesi.compunet_taller.model.Vehicle>) request.getAttribute("vehicles");
        if (vehicles != null) {
            for (co.icesi.compunet_taller.model.Vehicle v : vehicles) {
    %>
    <tr>
        <td><%= v.getPlaca() %></td>
        <td><%= v.getMarca() %></td>
        <td><%= v.getModelo() %></td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
