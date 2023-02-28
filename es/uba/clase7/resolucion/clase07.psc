Algoritmo clase07
	
	Definir ingresado Como Entero
	Definir encontrado Como Logico
	Dimension matriz[3,3]
	Definir txt Como Caracter
	Imprimir "Ingresa un numero para ver si se encuentra en la matriz (0 al 10):"
	Leer ingresado
	encontrado <- Falso
	
	Para columna <- 1 Hasta 3 Con paso 1 Hacer
		Para Fila <- 1 Hasta 3 Con paso 1 Hacer
			matriz[columna,fila] <- azar(9) + 1
			Si matriz[columna,fila] = ingresado
				encontrado <- Verdadero
				Imprimir "El valor ingresado se encuentra en la columna " columna " en la fila " fila
			FinSi
		FinPara
	FinPara
	
	Si encontrado = Falso
		Imprimir "El valor ingresado no se encontro en la tabla"
	FinSi
	
	Para columna <- 1 Hasta 3 Con paso 1 Hacer
		txt <- ""
		Para Fila <- 1 Hasta 3 Con paso 1 Hacer
			txt <- Concatenar(txt,ConvertirATexto(matriz[columna,fila]) + " ")
		FinPara
		Imprimir txt
	FinPara
	
FinAlgoritmo
