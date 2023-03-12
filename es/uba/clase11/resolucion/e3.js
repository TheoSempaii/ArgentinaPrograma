function start() {
  var valor = prompt("Ingresa el valor a comprobar")
  if (isNaN(valor)) return start()
  if (valor % 2 == 0) return alert(`El valor ${valor} es par`)
  alert(`El valor ${valor} es impar`)
}
start()