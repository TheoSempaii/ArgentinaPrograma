Algoritmo ejercicio09
	Definir valor1 Como Real
	valor1 <- 8
	Dimension dim(7)
	dim[1] <- "Lunes"
	dim[2] <- "Martes"
	dim[3] <- "Miercoles"
	dim[4] <- "Jueves"
	dim[5] <- "Viernes"
	dim[6] <- "Sabado"
	dim[7] <- "Domingo"
	Mientras valor1 > 7
		Imprimir "Ingresa un numero de dia (1-7): "
		Leer valor1
	FinMientras
	Imprimir "El dia numero " valor1 " de la semana es " dim(valor1)
FinAlgoritmo