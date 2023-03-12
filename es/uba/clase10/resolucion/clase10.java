package es.uba.clase10.resolucion;

import java.util.Scanner;

public class clase10 {
  private Scanner scanner = new Scanner(System.in);

  public void ejercicio2() {
    int actual = 0;
    int total = 0;
    do {
      System.out.println("Ingresa un valor " + (actual + 1) + "/5");
      total += scanner.nextInt();
      actual++;
    } while (actual < 5);
    System.out.println("La suma de los 5 valores es: " + total);
  }

  public void ejercicio4() {
    int actual = 0;
    int vocales = 0, consonantes = 0;
    String listaVocales = "aeiou";
    String listaConsonantes = "bcdfghjklmnñopqrstvwxyz";
    do {
      System.out.println("Ingresa un valor " + (actual + 1) + "/10");
      String letra = scanner.nextLine();
      if (letra.length() != 1 || (!listaVocales.contains(letra) &&
          !listaConsonantes.contains(letra))) {
        System.out.println("Ingresa unicamente una letra");
      } else {
        if (listaVocales.contains(letra))
          vocales++;
        else
          consonantes++;
        actual++;
      }
    } while (actual < 10);
    System.out.println("En total hay " + vocales + " vocales y " +
        consonantes + " consonantes");
  }

  public void ejercicio5() {
    int actual = 0;
    do {
      System.out.println("Ingresa un valor " + (actual + 1) + "/10");
      int valor = scanner.nextInt();
      String mayorADiez = valor > 10 ? " es mayor a diez" : " es menor a diez";
      String entreDiezYCien = valor > 10 && valor < 100 ? " y esta entre 10 y 100" : " y no esta entre 10 y 100";
      String mayorACien = valor > 100 ? " y es mayor a 100" : " y es menor a 100";
      System.out.println("El valor " + valor + mayorADiez +
          entreDiezYCien + mayorACien);
      actual++;
    } while (actual < 10);
  }

  public void ejercicio6() {
    for (int i = 0; i < 10; i++) {
      System.out.println((i + 1) + ". 4 x " + (i + 1) + " = " + ((i +
          1) * 4));
    }
  }

  public void ejercicio7() {
    System.out.println("Ingesa el valor del cual mostrar la tabla");
    int valor = scanner.nextInt();
    for (int i = 0; i < 10; i++) {
      System.out.println((i + 1) + ". " + valor + " x " + (i + 1) + " = " + ((i + 1) * valor));
    }
  }

  public void ejercicio8() {
    int actual = 0;
    int mayor = 0;
    int ordenMayor = 0;
    int total = 0;
    do {
      System.out.println("Ingrese un valor para sumar al promedio " +
          (actual + 1) + "/10");
      int valor = scanner.nextInt();
      if (mayor < valor) {
        mayor = valor;
        ordenMayor = actual + 1;
      }
      total += valor;
      actual++;
    } while (actual < 10);
    System.out.println("Ël mayor valor es el numero " + mayor + " ingresado en la posicion " + ordenMayor
        + " y el promedio de los valores es "
        + total / 10);
  }

  public void ejercicio9() {
    int actual = 0;
    int total = 0;
    do {
      System.out.println("Ingrese un valor para sumar. Valores ingresados: " + actual + ", total acumulado: " + total
          + " [SOLO SE SUMAN PARES]");
      int valor = scanner.nextInt();
      if (valor % 2 == 0)
        total++;
      actual++;
    } while (total <= 100);
    System.out.println("Total de valores ingresados: " + actual + ", valor final obtenido: " + total);
  }

  public void ejercicio10() {
    int valor = 0, impares = 0, pares = 0;
    do {
      System.out.println("Ingrese ultimo numero de patente (-1 para finalizar)");
      valor = scanner.nextInt();
      if (valor == -1) {
        System.out.println("Finalizando...");
      } else if (valor < 0 || valor > 9) {
        System.out.println("Ingresa un ultimo digito de patente valido (0-9)");
      } else {
        if (valor % 2 == 0)
          pares++;
        else
          impares++;
      }
    } while (valor != -1);
    System.out.println("En total se ingresaron " + impares + " patentes finalizadas en numeros impares y " + pares
        + " patentes finalizadas en numeros pares");
  }

  public void ejercicio11() {
    System.out.println("Ingresa un valor para obtener sus numeros impares y su suma total");
    boolean noFinalizado = true;
    int total = 0;
    int valor = 0;
    do {
      valor = scanner.nextInt();
      if (valor > 0) {
        System.out.println("Valores impares hasta el numero " +
            valor);
        for (int i = 1; i <= valor; i += 2) {
          System.out.println(i);
          total += i;
        }
        noFinalizado = false;
      } else {
        System.out.println("Ingrese un valor positivo");
      }
    } while (noFinalizado);
    System.out.println("Suma total de valores impares hasta " + valor +
        ": " + total);
  }
}