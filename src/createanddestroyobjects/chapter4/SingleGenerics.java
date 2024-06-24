package createanddestroyobjects.chapter4;

public class SingleGenerics<T> {

  T obj;

  SingleGenerics(T obj) {
    this.obj = obj;
  }

  public T getObject() {
    return this.obj;
  }

}
