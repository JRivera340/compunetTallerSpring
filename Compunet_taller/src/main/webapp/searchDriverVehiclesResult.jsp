<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vehículos del Conductor</title>
</head>
<body>
<h1>Vehículos del Conductor</h1>
<%
    co.icesi.compunet_taller.model.Driver driver =
            (co.icesi.compunet_taller.model.Driver) request.getAttribute("driver");
    if (driver != null) {
%>
<h2>Conductor: <%= driver.getName() %> (<%= driver.getNum_identificacion() %>)</h2>
<ul>
    <%
        if (driver.getVehicles() != null) {
            for (co.icesi.compunet_taller.model.Vehicle v : driver.getVehicles()) {
    %>
    <li><%= v.getPlaca() %> - <%= v.getMarca() %> (<%= v.getModelo() %>)</li>
    <%
            }
        }
    %>
</ul>
<%
} else {
%>
<p>No se encontró un conductor con el número de identificación proporcionado.</p>
<%
    }
%>
</body>
</html>
