package es.uba.clase15.resolucion;

public class Pasajero {
  private String apellido;
  private String nombre;
  private String domicilio;
  private String ciudad;
  private String provincia;
  private int documento;
  private byte edad;

  public Pasajero(String apellido, String nombre, int documento, byte edad, String domicilio, String provincia,
      String ciudad) {
    this.apellido = apellido;
    this.nombre = nombre;
    this.documento = documento;
    this.edad = edad;
    this.domicilio = domicilio;
    this.provincia = provincia;
    this.ciudad = ciudad;
  }

  public String getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
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

  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
}