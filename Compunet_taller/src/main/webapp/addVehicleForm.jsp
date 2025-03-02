<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Agregar Vehículo</title>
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
<h1>Agregar Vehículo</h1>
<form action="addVehicle" method="post">
  ID: <input type="text" name="id" required/><br/>
  Placa: <input type="text" name="placa" required/><br/>
  Cilindraje: <input type="text" name="cilindraje" required/><br/>
  Tipo de Combustible: <input type="text" name="tipoCombustible" required/><br/>
  Número de Motor: <input type="text" name="numeroMotor" required/><br/>
  Marca: <input type="text" name="marca" required/><br/>
  Modelo (año): <input type="text" name="modelo" required/><br/>
  Conductor (ingresar el id): <input type="text" name="conductorId" required/><br/>
  <input type="submit" value="Agregar Vehículo"/>
</form>
</body>
</html>
