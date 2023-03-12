function start() {
  var radio = prompt("Ingresa el radio")
  if (isNaN(radio)) return start()
  alert(`El area es ${(radio^2)*Math.PI}cm cuadrados`)
}
start()