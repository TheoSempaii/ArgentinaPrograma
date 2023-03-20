import java.util.ArrayList;
import java.util.List;

public class ContenedorString {
  private List<String> lista = new ArrayList<String>();

  public void guardar(String elemento) {
    lista.add(elemento);
  }

  public void mostrarPorLongitud(int limite) {
    lista.forEach(elemento -> {
      if (elemento.length() > limite)
        System.out.println(elemento);
    });
  }
}
