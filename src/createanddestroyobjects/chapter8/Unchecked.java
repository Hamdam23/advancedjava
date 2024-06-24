package createanddestroyobjects.chapter8;

public class Unchecked {

  public static void main(String[] args) {
//    divide(2, 0);
    processDivision(2, 0);
    divide(2, 0);
  }

  public static void divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Cannot divide by zerooooo");
    }
    System.out.println(a / b);
  }

  public static void processDivision(int a, int b) {
    try {
      divide(a, b);
    } catch (ArithmeticException e) {
      System.err.println("Error: " + e.getMessage());
    }
  }

}
