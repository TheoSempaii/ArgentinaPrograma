import java.util.Scanner;

public class clase8 {
  public Scanner scanner = new Scanner(System.in);

  public void esPrimo() {
    double valor;
    boolean primo = true;
    System.out.println("Ingresa un valor:");
    valor = scanner.nextDouble();
    scanner.nextLine();
    double i = 0;
    do {
      if ((i != 1 && i != valor && i != 0) && valor % i == 0 ||
          Double.toString(valor).contains("."))
        primo = false;
      i++;
    } while (i < valor);
    if (primo)
      System.out.println("Es primo");
    else
      System.out.println("No es primo");
  }

  public void verificarPares() {
    int numerosTotal = 0, contador = 0, pares = 0, impares = 0, ingresado = 0;
    System.out.println("Cuantos numeros vas a ingresar: ");
    numerosTotal = scanner.nextInt();
    scanner.nextLine();
    while (contador < numerosTotal) {
      System.out.println("Ingresa el numero " + (contador + 1) + " de " +
          numerosTotal);
      ingresado = scanner.nextInt();
      scanner.nextLine();
      if (ingresado % 2 == 0)
        pares++;
      else
        impares++;
      contador++;
    }
    System.out.println("Numeros pares: " + pares + "\nNumeros impares: " + impares);
  }

  public void diaDeLaSemana() {
    int dia;
    boolean validDay = true;
    System.out.println("Ingresa un numero de dia de la semana:");
    dia = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < 1; i++) {
      if (dia == 0 || dia > 7)
        validDay = false;
    }
    if (validDay) {
      switch (dia) {
        case 1:
          System.out.println("El dia numero " + dia + " de la semana es Lunes");
          break;
        case 2:
          System.out.println("El dia numero " + dia + " de la semana es Martes");
          break;
        case 3:
          System.out.println("El dia numero " + dia + " de la semana es Miercoles");
          break;
        case 4:
          System.out.println("El dia numero " + dia + " de la semana es Jueves");
          break;
        case 5:
          System.out.println("El dia numero " + dia + " de la semana es Viernes");
          break;
        case 6:
          System.out.println("El dia numero " + dia + " de la semana es Sabado");
          break;
        case 7:
          System.out.println("El dia numero " + dia + " de la semana es Domingo");
          break;
      }
    } else {
      System.out.println("Por favor ingresa un valor de dia valido (1-7)");
    }
  }
}