package es.uba.clase19.resolucion;

import java.util.ArrayList;

public class Carrito {
  private ArrayList<Producto> productos = new ArrayList<Producto>();

  public void añadirProducto(Producto producto) {
    producto.setIndex(productos.size());
    productos.add(producto);
  }

  public void eliminarProducto(Producto producto) {
    if (productos.contains(producto))
      productos.remove(producto);
    else
      System.out.println("No se encuentra ese producto en el carrito");
  }

  public void modificarProducto(Producto producto) {
    if (productos.contains(producto))
      productos.set(productos.indexOf(producto),
          producto);
  }

  public ArrayList<Producto> obtenerProductos() {
    return this.productos;
  }

  public Producto obtenerProducto(int index) {
    if (productos.size() <= index)
      return null;
    return this.productos.get(index);
  }
}