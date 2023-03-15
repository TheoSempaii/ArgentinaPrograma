package es.uba.clase14.resolucion;

import java.util.Scanner;

public class DiaDeLaSemana {
  private Scanner scanner = new Scanner(System.in);

  public void encontrarDia() {
    int dia;
    boolean validDay = true;
    String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
    System.out.println("Ingresa un numero de dia de la semana:");
    dia = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < dia; i++) {
      if (dia == 0 || dia > 7)
        validDay = false;
      else
        dia = i;
    }
    if (validDay) {
      System.out.println("El dia numero " + (dia + 1) + " es " + dias[dia]);
    } else {
      System.out.println("Por favor ingresa un valor de dia valido (1-7)");
    }
  }
}