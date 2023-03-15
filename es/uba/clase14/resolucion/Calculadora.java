package es.uba.clase14.resolucion;

import java.util.Scanner;

public class Calculadora {
  private Scanner scanner;
  private long valor1, valor2, resultado;
  private char operador;

  public Calculadora() {
    this.scanner = new Scanner(System.in);
  }

  public boolean iniciarConIf() {
    System.out.println("Ingresa el primer valor");
    this.valor1 = this.scanner.nextLong();
    System.out.println("Ingresa el segundo valor");
    this.valor2 = this.scanner.nextLong();
    System.out
        .println("Por favor indica la operacion deseada: \n(*) multiplicacion\n(+) suma\n(-) resta\n(/) division");
    this.operador = this.scanner.next().charAt(0);
    if (this.operador == '*')
      this.resultado = this.valor1 * this.valor2;
    else if (this.operador == '-')
      this.resultado = this.valor1 - this.valor2;
    else if (this.operador == '+')
      this.resultado = this.valor1 + this.valor2;
    else if (this.operador == '/')
      this.resultado = this.valor1 / this.valor2;
    else {
      System.out.println("Operacion invalida");
      this.iniciarConIf();
      return false;
    }
    System.out.println("El resultado es: " + this.resultado);
    return true;
  }

  public boolean iniciarConSwitch() {
    System.out.println("Ingresa el primer valor");
    this.valor1 = this.scanner.nextLong();
    System.out.println("Ingresa el segundo valor");
    this.valor2 = this.scanner.nextLong();
    System.out
        .println("Por favor indica la operacion deseada: \n(*) multiplicacion\n(+) suma\n(-) resta\n(/) division");
    this.operador = this.scanner.next().charAt(0);
    switch (this.operador) {
      case '*':
        this.resultado = this.valor1 * this.valor2;
        break;
      case '-':
        this.resultado = this.valor1 - this.valor2;
        break;
      case '+':
        this.resultado = this.valor1 + this.valor2;
        break;
      case '/':
        this.resultado = this.valor1 / this.valor2;
        break;
      default:
        System.out.println("Operacion invalida");
        this.iniciarConIf();
        return false;
    }
    System.out.println("El resultado es: " + this.resultado);
    return true;
  }
}