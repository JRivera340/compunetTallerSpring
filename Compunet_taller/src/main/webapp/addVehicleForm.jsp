<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Agregar Vehículo</title>
</head>
<body>
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
