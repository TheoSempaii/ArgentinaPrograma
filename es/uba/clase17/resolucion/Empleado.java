package es.uba.clase17.resolucion;

public abstract class Empleado extends Persona {

  private String empleo;

  public Empleado(String nombre, String apellido, byte edad, int documento, String cuil, String empleo) {
    super(nombre, apellido, edad, documento, cuil);
    this.empleo = empleo;
  }

  public String getEmpleo() {
    return empleo;
  }

  public void setEmpleo(String empleo) {
    this.empleo = empleo;
  }

  public void trabajar() {
  }

}
