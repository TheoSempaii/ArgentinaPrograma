package es.uba.clase12.resolucion;

public abstract class Vehiculo {
  private String marca;
  private String modelo;
  private int año;
  private float velocidad;
  private float maxima;

  protected Vehiculo(String marca, String modelo, int año, float maxima) {
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
    this.velocidad = 0;
    this.maxima = maxima;
  }

  public void acelerar() {
  };

  public void frenar() {
    this.velocidad = 0;
  };

  public void velocidadActual() {
    System.out.println("La velocidad actual es " + this.velocidad + "km/h");
  };

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAño() {
    return año;
  }

  public void setAño(int año) {
    this.año = año;
  }

  public float getVelocidad() {
    return this.velocidad;
  }

  public void setVelocidad(float velocidad) {
    this.velocidad = velocidad;
  }

  public float getMaxima() {
    return maxima;
  }

  public void setMaxima(float maxima) {
    this.maxima = maxima;
  }
}
