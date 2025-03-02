<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Agregar Conductor</title>
</head>
<body>
<h1>Agregar Conductor</h1>
<form action="addDriver" method="post">
  ID: <input type="text" name="id" required/><br/>
  Nombre: <input type="text" name="name" required/><br/>
  Cargo: <input type="text" name="cargo" required/><br/>
  Tipo de Identificación (numérico): <input type="text" name="tipoIdentificacion" required/><br/>
  Número de Identificación: <input type="text" name="numIdentificacion" required/><br/>
  <input type="submit" value="Agregar Conductor"/>
</form>
</body>
</html>
