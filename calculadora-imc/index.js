function calcularIMC(){
  var formulario = document.getElementById("formulario");  
  
  var massa = +formulario.massa.value;
  var altura = +formulario.altura.value;
  
  var imc = massa / (altura * altura);
  
  formulario.imc.value = imc.toFixed(2);
}