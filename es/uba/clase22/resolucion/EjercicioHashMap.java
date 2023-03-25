package es.uba.clase22.resolucion;

import java.util.HashMap;

public class EjercicioHashMap {
    private HashMap<String, Float> map = new HashMap<String, Float>();

    public void guardar(String producto, Float precio) {
        map.put(producto, precio);
    }

    public float obtener(String producto){
        return map.get(producto);
    }
}
