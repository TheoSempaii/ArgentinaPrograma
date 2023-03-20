import java.util.ArrayList;
import java.util.List;

public class Contenedor<T> {
    private List<T> lista = new ArrayList<>();

    public void guardar(T elemento) {
        lista.add(elemento);
    }

    public void mostrarPorClase(T clase) {
        lista.forEach(e -> {
            if (e.getClass() == clase) {

                if (clase == Estudiante.class) {
                    System.out.println("Nombre: " + ((Estudiante) e).getNombre());
                    System.out.println("Calificacion: " + ((Estudiante) e).getCalificacion());
                }

                if (clase == Pareja.class) {
                    System.out.println("Elemento 1: " + ((Pareja<?, ?>) e).getElemento1());
                    System.out.println("Elemento 2: " + ((Pareja<?, ?>) e).getElemento2());
                }
                System.out.println("---------------------");
            }
        });
    }

    public double sumarNumeros() {
        final double[] total = { 0 };

        lista.forEach(e -> {
            if (e.getClass() == Byte.class)
                total[0] += (Byte) e;
            if (e.getClass() == Short.class)
                total[0] += (Short) e;
            if (e.getClass() == Integer.class)
                total[0] += (Integer) e;
            if (e.getClass() == Long.class)
                total[0] += (Long) e;
            if (e.getClass() == Float.class)
                total[0] += (Float) e;
            if (e.getClass() == Double.class)
                total[0] += (Double) e;
        });
        System.out.println(total[0]);
        return total[0];
    }

    public ArrayList<Empleado> filtrarEmpleados(ArrayList<Empleado> lista, double salarioMinimo) {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        lista.forEach(empleado -> {
            if (empleado.getSalario() > salarioMinimo)
                empleados.add(empleado);
        });

        return empleados;
    }
}
