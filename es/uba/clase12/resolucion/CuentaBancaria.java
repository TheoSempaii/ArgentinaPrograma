package es.uba.clase12.resolucion;

public class CuentaBancaria {
  private int numeroCuenta;
  private float saldo;
  private String titular;

  public CuentaBancaria(int numeroCuenta, float saldo, String titular) {
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    this.titular = titular;
  }

  public void imprimirCuenta() {
    System.out.println("Titular: " + this.titular);
    System.out.println("Saldo: " + this.saldo);
    System.out.println("Numero de Cuenta: " + this.numeroCuenta);
  }

  public boolean depositar(float valor) {
    this.saldo += valor;
    return true;
  }

  public boolean retirar(float valor) {
    if (this.saldo < valor) {
      return false;
    }
    this.saldo -= valor;
    return true;
  }

  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }
}
