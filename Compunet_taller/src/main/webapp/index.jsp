<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Página de Inicio</title>
  <style>
    /* Ejemplo de estilos CSS embebidos */
    body {
      background-color: #f4f4f4;
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
    }

    header {
      background-color: #333;
      color: white;
      padding: 15px;
      text-align: center;
    }

    .container {
      width: 80%;
      margin: 0 auto; /* Centra el contenedor */
      text-align: center; /* Centra el contenido dentro */
      padding: 30px 0;
    }

    h1 {
      margin-bottom: 20px;
    }

    /* Estilos para los botones */
    .menu button {
      background-color: #4CAF50;
      color: #fff;
      border: none;
      padding: 12px 20px;
      margin: 10px;
      cursor: pointer;
      font-size: 16px;
      border-radius: 5px;
    }

    .menu button:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
<header>
  <h2>Gestión de Estacionamiento</h2>
</header>

<div class="container">
  <h1>Bienvenido</h1>
  <p>Seleccione una opción:</p>
  <div class="menu">
    <button onclick="location.href='listVehicles'">Listado de Vehículos</button>
    <button onclick="location.href='searchVehicleForm.jsp'">Buscar Vehículo por Placa</button>
    <button onclick="location.href='deleteVehicleForm.jsp'">Eliminar Vehículo por Placa</button>
    <button onclick="location.href='addDriverForm.jsp'">Agregar Conductor</button>
    <button onclick="location.href='addVehicleForm.jsp'">Agregar Vehículo</button>
    <button onclick="location.href='listDrivers'">Listado de Conductores</button>
    <button onclick="location.href='searchDriverVehiclesForm.jsp'">Buscar Vehículos de Conductor</button>
  </div>
</div>
</body>
</html>
