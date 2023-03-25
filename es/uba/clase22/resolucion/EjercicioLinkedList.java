package es.uba.clase22.resolucion;

import java.util.LinkedList;

public class EjercicioLinkedList {
  LinkedList temp = new LinkedList();

  public LinkedList limpiar(LinkedList<String> lista) {
    lista.forEach(element -> {
      if (!temp.contains(element)) {
        temp.add(element);
      }
    });
    return temp;
  }

}
