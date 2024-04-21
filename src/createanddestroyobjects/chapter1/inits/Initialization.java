package createanddestroyobjects.chapter1.inits;

public class Initialization {

  static int value;

  public static void setValue(int value) {
    Initialization.value = value;
  }

  Initialization() {
    System.out.println("Value from constructor " + value);
  }

  {
    System.out.println("block N1 | init 1");
    value = 1;
  }

  {
    System.out.println("block N2 | init 2");
    value = 2;
  }

  public static void main(String[] args) {
    System.out.println("Value from main " + Initialization.value);
    new Initialization();
  }
}
