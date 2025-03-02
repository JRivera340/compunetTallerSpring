<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado de Búsqueda</title>
    <style>
        body, h1, h2, h3, p, ul, li, table, th, td, form {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            background-color: #f4f4f4;
            font-family: Arial, sans-serif;
        }
        header {
            background-color: #333;
            color: white;
            padding: 15px;
            text-align: center;
        }
        .container {
            width: 80%;
            margin: 0 auto;
            text-align: center;
            padding: 30px 0;
        }
        h1 {
            margin-bottom: 20px;
        }
        table {
            margin: 0 auto;
            border-collapse: collapse;
            width: 80%;
        }
        table, th, td {
            border: 1px solid #ccc;
        }
        th, td {
            padding: 12px;
        }
        th {
            background-color: #eee;
        }
        /* Botones (si tuvieras alguno en esta página) */
        button {
            background-color: #4CAF50;
            color: #fff;
            border: none;
            padding: 12px 20px;
            margin: 10px;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<header>
    <h2>Gestión de Estacionamiento</h2>
</header>
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
