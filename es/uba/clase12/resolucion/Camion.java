package es.uba.clase12.resolucion;

public class Camion extends Vehiculo {
  public Camion(String marca, String modelo, int año, float maxima) {
    super(marca, modelo, año, maxima);
  }

  @Override
  public void acelerar() {
    this.setVelocidad(this.getMaxima());
  }
}