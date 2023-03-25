package es.uba.clase19.resolucion;

public class Producto {
  private int stock;
  private String nombre;
  private int precio;
  private int id;

  public Producto(int stock, String nombre, int precio) {
    this.stock = stock;
    this.nombre = nombre;
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public int getIndex() {
    return id;
  }

  public void setIndex(int index) {
    this.id = index;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}