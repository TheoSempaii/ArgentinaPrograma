import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Operador<T> {
  public LinkedList<T> invertir(LinkedList<T> lista) {
    Collections.reverse(lista);
    return lista;
  }

  public LinkedList<Integer> eliminarPares(LinkedList<Integer> lista) {
    LinkedList<Integer> aux = new LinkedList<Integer>();
    Iterator it = lista.iterator();
    while (it.hasNext()) {
      int val = (int) it.next();
      if (val % 2 != 0)
        aux.add(val);
    }
    return aux;
  }

  public boolean compararListas(LinkedList<T> lista1, LinkedList<T> lista2) {
    Iterator it;
    boolean igual = true;
    LinkedList<T> objetivo;
    int contador = 0;
    if (lista1.size() > lista2.size()) {
      it = lista2.iterator();
      objetivo = lista1;
    } else {
      it = lista1.iterator();
      objetivo = lista2;
    }

    while (it.hasNext()) {
      Object e = it.next();
      if (objetivo.get(contador) != e)
        igual = false;
    }

    return igual;
  }
}
