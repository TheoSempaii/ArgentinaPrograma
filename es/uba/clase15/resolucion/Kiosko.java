package es.uba.clase15.resolucion;

import java.util.ArrayList;

public class Kiosko {
  private ArrayList<Producto> productos = new ArrayList<Producto>();
  private int ganancias;

  public void añadirProducto(Producto producto) {
    if (productos.contains(producto))
      System.out.println("Este producto ya se encuentra dentro del registro del kiosko!");
    else {
      producto.setIndex(productos.size());
      productos.add(producto);
    }
  }

  public void eliminarProducto(Producto producto) {
    if (productos.contains(producto))
      productos.remove(producto);
    else
      System.out.println("No se encuentra ese producto en el registro");
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

  public void pagar(Carrito carrito) {
    ArrayList<Producto> totalProductos = carrito.obtenerProductos();
    for (int i = 0; i < totalProductos.size(); i++) {
      Producto productoCliente = totalProductos.get(i);
      Producto productoKiosko = totalProductos.get(totalProductos.indexOf(productoCliente));
      if (productoKiosko.getStock() > 0) {
        productoKiosko.setStock(productoKiosko.getStock() - 1);
        this.ganancias += productoKiosko.getPrecio();
      }
    }
  }

  public int getGanancias() {
    return this.ganancias;
  }
}
