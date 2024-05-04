package createanddestroyobjects.chapter3.multipleinheritances;

public interface Showable {

  void show();

  default void msg() {
    System.out.println("default method");
  }

}
