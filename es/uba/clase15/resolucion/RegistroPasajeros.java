package es.uba.clase15.resolucion;

import java.util.ArrayList;

public class RegistroPasajeros {
  private ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();

  public void añadirPasajero(Pasajero pasajero) {
    if (pasajeros.contains(pasajero))
      System.out.println("Este pasajero ya se encuentra dentro del colectivo!");
    else if (pasajeros.size() < 6)
      pasajeros.add(pasajero);
    else
      System.out.println("No se pueden subir mas pasajeros!");
  }

  public void removerPasajero(Pasajero pasajero) {
    if (pasajeros.contains(pasajero))
      pasajeros.remove(pasajero);
    else
      System.out.println("No se encuentra ese pasajero");
  }

  public void mostrarInformePasajeros() {
    for (int i = 0; i < pasajeros.size(); i++) {
      Pasajero pasajero = pasajeros.get(i);
      System.out.println("Nombre: " + pasajero.getNombre());
      System.out.println("Apellido: " + pasajero.getApellido());
      System.out.println("Edad: " + pasajero.getEdad());
      System.out.println("Domicilio: " + pasajero.getDomicilio());
      System.out.println("Provincia: " + pasajero.getProvincia());
      System.out.println("Ciudad: " + pasajero.getCiudad());
      System.out.println("DNI: " + pasajero.getDocumento());
      System.out.println("-----------------------");
    }
  }

  public void mostrarInformeDeMenoresDeEdad() {
    for (int i = 0; i < pasajeros.size(); i++) {
      Pasajero pasajero = pasajeros.get(i);
      if (pasajero.getEdad() < 18) {
        System.out.println("Nombre: " + pasajero.getNombre());
        System.out.println("Apellido: " + pasajero.getApellido());
        System.out.println("Edad: " + pasajero.getEdad());
        System.out.println("Domicilio: " + pasajero.getDomicilio());
        System.out.println("Provincia: " + pasajero.getProvincia());
        System.out.println("Ciudad: " + pasajero.getCiudad());
        System.out.println("DNI: " + pasajero.getDocumento());
        System.out.println("-----------------------");
      }
    }
  }

  public void mostrarInformeDeMayoresDeEdad() {
    for (int i = 0; i < pasajeros.size(); i++) {
      Pasajero pasajero = pasajeros.get(i);
      if (pasajero.getEdad() >= 18) {
        System.out.println("Nombre: " + pasajero.getNombre());
        System.out.println("Apellido: " + pasajero.getApellido());
        System.out.println("Edad: " + pasajero.getEdad());
        System.out.println("Domicilio: " + pasajero.getDomicilio());
        System.out.println("Provincia: " + pasajero.getProvincia());
        System.out.println("Ciudad: " + pasajero.getCiudad());
        System.out.println("DNI: " + pasajero.getDocumento());
        System.out.println("-----------------------");
      }
    }
  }
}
