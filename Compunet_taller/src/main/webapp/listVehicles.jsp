<%@ page contentType="text/html;charset=UTF-8" language="java"
         import="java.util.List, co.icesi.compunet_taller.model.Vehicle" %>
<html>
<head>
    <title>Listado de Vehículos</title>
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
<div class="container">
    <h1>Listado de Vehículos</h1>
    <table>
        <tr>
            <th>Placa</th>
            <th>Marca</th>
            <th>Modelo</th>
        </tr>
        <%
            List<Vehicle> vehicles = (List<Vehicle>) request.getAttribute("vehicles");
            if (vehicles != null) {
                for (Vehicle v : vehicles) {
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
</div>
</body>
</html>
