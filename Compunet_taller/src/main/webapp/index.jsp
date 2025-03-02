<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Página de Inicio</title>
  <style>
    button {
      margin: 5px;
      padding: 10px;
      font-size: 16px;
    }
  </style>
</head>
<body>
<h1>Bienvenido a la Gestión de Estacionamiento</h1>
<p>Seleccione una opción:</p>
<!-- Cada botón redirige a la URL correspondiente -->
<button onclick="location.href='listVehicles'">Listado de Vehículos</button>
<button onclick="location.href='searchVehicleForm.jsp'">Buscar Vehículo por Placa</button>
<button onclick="location.href='deleteVehicleForm.jsp'">Eliminar Vehículo por Placa</button>
<button onclick="location.href='addDriverForm.jsp'">Agregar Conductor</button>
<button onclick="location.href='addVehicleForm.jsp'">Agregar Vehículo</button>
<button onclick="location.href='listDrivers'">Listado de Conductores</button>
<button onclick="location.href='searchDriverVehiclesForm.jsp'">Buscar Vehículos de Conductor</button>
</body>
</html>
