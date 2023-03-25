package es.uba.clase22.resolucion;

import java.util.ArrayList;

public class EjercicioArrayList {
  private ArrayList<String> lista = new ArrayList<>();

  public void almacenar(String elemento) {
    lista.add(elemento);
  }

  public void imprimir() {
    lista.forEach(elemento -> {
      System.out.println(elemento);
    });
  }
}
