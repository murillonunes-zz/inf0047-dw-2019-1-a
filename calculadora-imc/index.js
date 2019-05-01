function calcularIMC() {
  var formulario = document.getElementById("formulario");  
  
  var massa = +formulario.massa.value;
  var altura = +formulario.altura.value;

  altura = altura / 100;
  var imc = massa / (altura * altura);
  
  formulario.imc.value = imc.toFixed(2);

  classificarIMC();
}

function classificarIMC() {
  var imc = formulario.imc.value;

  if (imc < 18.5) {
    var classificacao = "Abaixo do peso";
  } else if (imc >= 18.5 && imc <= 24.9) {
    var classificacao = "Peso normal";
  } else if (imc >= 25 && imc <= 29.9) {
    var classificacao = "Sobrepeso";
  } else if (imc >= 30 && imc <= 34.9) {
    var classificacao = "Obesidade grau 1";
  } else if (imc >= 35 && imc <= 39.9) {
    var classificacao = "Obesidade grau 2";
  } else {
    var classificacao = "Obesidade grau 3";
  }

  formulario.classificacao.value = classificacao;

}