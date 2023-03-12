function start() {
  var nombre = prompt("Ingresa tu nombre")
  var edad = prompt("Ingresa tu edad")
  if (isNaN(edad)) return start()
  alert(`Hola ${nombre} tu edad es ${edad}`)
}
start()