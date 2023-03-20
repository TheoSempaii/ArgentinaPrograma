package es.uba.clase17.resolucion;

public class Persona {
  private String nombre;
  private String apellido;
  private byte edad;
  private int documento;
  private String cuil;

  public Persona(String nombre, String apellido, byte edad, int documento, String cuil) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.documento = documento;
    this.cuil = cuil;
  }

  public static void saludar() {
    System.out.println("Hola!");
  }

  public static void despedirse() {
    System.out.println("Adios!");
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

  public byte getEdad() {
    return edad;
  }

  public void setEdad(byte edad) {
    this.edad = edad;
  }

  public int getDocumento() {
    return documento;
  }

  public void setDocumento(int documento) {
    this.documento = documento;
  }

  public String getCuil() {
    return cuil;
  }

  public void setCuil(String cuil) {
    this.cuil = cuil;
  }
}
