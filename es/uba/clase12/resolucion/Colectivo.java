package es.uba.clase12.resolucion;

public class Colectivo extends Vehiculo {
  public Colectivo(String marca, String modelo, int año, float maxima) {
    super(marca, modelo, año, maxima);
  }

  @Override
  public void acelerar() {
    this.setVelocidad(this.getMaxima());
  }
}