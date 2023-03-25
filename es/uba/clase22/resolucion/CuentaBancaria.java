package es.uba.clase22.resolucion;

public class CuentaBancaria {
  private double saldo = 0;
  private String titular;

  public CuentaBancaria(String titular, double saldo) {
    this.titular = titular;
    this.saldo = saldo;
  }

  public void depositar(double cantidad) {
    this.setSaldo(saldo + cantidad);
  }

  public void retirar(double cantidad) {
    if (cantidad > saldo)
      cantidad = saldo;
    this.setSaldo(saldo - cantidad);
  }

  public void consultarSaldo() {
    System.out.println("El saldo actual de " + getTitular());
    System.out.println("$" + getSaldo() + " (ARS)");
  }

  public double getSaldo() {
    return saldo;
  }

  public String getTitular() {
    return titular;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }
}
