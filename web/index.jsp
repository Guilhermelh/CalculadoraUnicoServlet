
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculadora</title>
  </head>
  <body>

  <form action="Operacao">
    <h2>INSIRA OS VALORES E OPERAÇÃO DESEJADA:</h2>
    <label for="a">Primeiro Valor:</label>
    <input type="text" name ="a" id="a" />
    <br/><br/>

    <label for="op">Operação:</label>
    <select id=op name="op">
      <option>+</option>
      <option>-</option>
      <option>*</option>
      <option>/</option>
    </select>
    <br/><br/>
    <label for="b">Segundo Valor:</label>
    <input type="text" name ="b" id="b" />
    <br>
    <br>
    <input type="submit" value="Ver Resultado"/>
  </form>

  </body>
</html>
