<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.List, co.icesi.compunet_taller.model.Driver" %>

<html>
<head>
    <title>Listado de Conductores</title>
</head>
<body>
<h1>Listado de Conductores</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Cargo</th>
        <th>Tipo de Identificación</th>
        <th>Número de Identificación</th>
        <th>Vehículos</th>
    </tr>
    <%
        List<co.icesi.compunet_taller.model.Driver> drivers =
                (List<co.icesi.compunet_taller.model.Driver>) request.getAttribute("drivers");
        if (drivers != null) {
            for (co.icesi.compunet_taller.model.Driver d : drivers) {
    %>
    <tr>
        <td><%= d.getId() %></td>
        <td><%= d.getName() %></td>
        <td><%= d.getCargo() %></td>
        <td><%= d.getTipo_identifacion() %></td>
        <td><%= d.getNum_identificacion() %></td>
        <td>
            <ul>
                <%
                    if (d.getVehicles() != null) {
                        for (co.icesi.compunet_taller.model.Vehicle v : d.getVehicles()) {
                %>
                <li><%= v.getPlaca() %> - <%= v.getMarca() %> (<%= v.getModelo() %>)</li>
                <%
                        }
                    }
                %>
            </ul>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
