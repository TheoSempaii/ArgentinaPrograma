package es.uba.clase13.resolucion;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    // Declarar el objeto e inicializar con
    // el objeto de entrada estándar predefinido
    Scanner sc = new Scanner(System.in);
    // entrada de una cadena
    String name = sc.nextLine();
    // entrada de un carácter
    char gender = sc.next().charAt(0);
    // Entrada de datos numéricos
    // byte, short y float
    int age = sc.nextInt();
    long mobileNo = sc.nextLong();
    double average = sc.nextDouble();
    // Imprima los valores para verificar si la entrada
    // fue obtenida correctamente.
    System.out.println("Nombre: " + name);
    System.out.println("Género: " + gender);
    System.out.println("Edad: " + age);
    System.out.println("Teléfono: " + mobileNo);
    System.out.println("Promedio: " + average);
  }
}