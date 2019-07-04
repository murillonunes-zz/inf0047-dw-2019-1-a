<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Calculadora IMC</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
    <br>
        <form class="container" id="formulario">
            <div class="col-md-5">
                <fieldset class="form-group">
                    <legend>Calculadora IMC</legend>
                    <label for="massa">Massa (kg):</label>
                    <input type="number" name="massa" class="form-control" />
                    <label for="altura">Altura (cm):</label>
                    <input type="number" name="altura" class="form-control" />
                    <br>
                    <button type="submit" class="btn btn-primary">Calcular</button>
                    <br>
                    <br>
                    <div class="panel-body">
                        <%if ((Boolean)request.getAttribute("paramVazios")) {%>
                          <!-- Sem resultado a exibir -->
                        <%} else if ((Boolean)request.getAttribute("ocorrenciaDeErro"))  {%>
                          <p class="alert alert-danger" role="alert">Erro: ${msgErro}.</p>
                        <%} else {%>
                          <p class="alert alert-success" role="alert"><b>IMC:</b> ${imc} - <b>Classifica&ccedil;&atilde;o:</b> ${faixaDoIMC}.</p>
                        <%}%>
                </fieldset>
            </div>
        </form>
</body>
</html>