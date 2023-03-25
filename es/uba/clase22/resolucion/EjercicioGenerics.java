package es.uba.clase22.resolucion;

import java.util.ArrayList;
import java.util.List;

public class EjercicioGenerics<T> {
    private List<T> lista = new ArrayList<T>();

    public void guardar(T elemento){
        lista.add(elemento);
    }

    public void obtener(Integer index){
        lista.get(index);
    }
}
