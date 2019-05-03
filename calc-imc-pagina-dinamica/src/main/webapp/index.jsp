<head> 
  <meta charset="UTF-8">
  <title>Calculadora de IMC</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
  <form class="container" id="formulario">
    <div class="col-md-5">
      <fieldset class="form-group">
        <legend id="legend-calc">Calculadora de IMC - Pagina Dinamica</legend>

        <label for="massa">Massa (kg):</label>
        <input type="text" name="massa" class="form-control" />
        
        <label for="altura">Altura (cm):</label>
        <input type="text" name="altura" class="form-control" />
        <br>          
        <button class="btn btn-sm btn-success">Calcular</a>
      </fieldset>

      <div class="alert alert-success">
        
        <!-- Scriptlet. Código Java no HTML. -->
          <%
            String massaStr = request.getParameter("massa");
            String alturaStr = request.getParameter("altura");

            if (massaStr != null && alturaStr != null) {
              Double massa = Double.parseDouble(massaStr);
              Double altura = Double.parseDouble(alturaStr);

              altura = (altura) / 100;
              Double imc = massa / (altura * altura);
        
              out.print(String.format("Seu IMC: %.2f", imc));
            } else {
          %>
          <p>
            Digite os seus dados corretamente.
          </p>
          <%
            }
          %>
      </div>
    </div>
  </form>
</body>