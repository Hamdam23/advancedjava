package createanddestroyobjects.chapter5.enums;

/**
 * https://habr.com/ru/articles/575208/
 */

public enum Pine {
  FIR, CEDAR;

  static {
    System.out.println("Static block");
  }

  {
    System.out.println("Code block");
  }

  Pine() {
    System.out.println("Constructor");
  }

  /**
   * public class PineIsNotEnum extends Enum<PineIsNotEnum> {
   *
   *     public static final PineIsNotEnum FIR;
   *     public static final PineIsNotEnum CEDAR;
   *
   *     protected PineIsNotEnum(String name, int ordinal) {
   *         super(name, ordinal);
   *         System.out.println("Code block");
   *         System.out.println("Constructor");
   *     }
   *
   *     static {
   *         FIR = new PineIsNotEnum("FIR", 0);
   *         CEDAR = new PineIsNotEnum("CEDAR", 1);
   *         System.out.println("Static block");
   *     }
   * }
   */

  /**
   * output
   */

  /**
   * Code block
   * Constructor
   * Code block
   * Constructor
   * Static block
   * FIR
   */

}

class A {
  public static void main(String[] args) {
//    Pine p = Pine.FIR;
    System.out.println(Pine.FIR);
  }
}
