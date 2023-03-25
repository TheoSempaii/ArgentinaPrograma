package es.uba.clase22.resolucion;

public class EjercicioFor {
  public void pares() {
    // Considerando entre 1 y 10 no se toman incluidos estos numeros debido a que no
    // fueron especificados,"
    // si se quiere obtener el 10 inclusive solo se requiere cambiar el "<" por "<="
    for (int i = 2; i < 10; i += 2) {
      System.out.println(i);
    }
  }
}
