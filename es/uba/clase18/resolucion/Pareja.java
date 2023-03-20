public class Pareja<T, U> {
  private T elemento1;
  private U elemento2;

  public Pareja(T elemento1, U elemento2) {
    this.elemento1 = elemento1;
    this.elemento2 = elemento2;
  }

  public T getElemento1() {
    return elemento1;
  }

  public void setElemento1(T elemento1) {
    this.elemento1 = elemento1;
  }

  public U getElemento2() {
    return elemento2;
  }

  public void setElemento2(U elemento2) {
    this.elemento2 = elemento2;
  }
}
