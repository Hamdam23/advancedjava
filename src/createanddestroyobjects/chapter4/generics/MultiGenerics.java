package createanddestroyobjects.chapter4.generics;

public class MultiGenerics<T, U> {

  T obj;
  U obj2;

  public MultiGenerics(T obj, U obj2) {
    this.obj = obj;
    this.obj2 = obj2;
  }

  public T getObj() {
    return obj;
  }

  public U getObj2() {
    return obj2;
  }

  void print() {
    System.out.println(obj);
    System.out.println(obj2);
  }
}
