package es.uba.clase12.resolucion;

public final class Persona {
  private String nombre;
  private String apellido;
  private String direccion;
  private int edad;

  public Persona(String nombre, String apellido, String direccion, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.edad = edad;
  }

  public void imprimirPersona() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Apellido: " + this.apellido);
    System.out.println("Edad: " + this.edad);
    System.out.println("Direccion: " + this.direccion);
  }

  public boolean esIgual(Persona persona) {
    if (persona.getDireccion() == this.direccion && persona.getApellido() == this.apellido
        && persona.getEdad() == this.edad && persona.getNombre() == this.nombre)
      return true;
    return false;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }
}