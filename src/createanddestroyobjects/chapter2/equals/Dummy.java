package createanddestroyobjects.chapter2.equals;

public class Dummy {

  public static void main(String[] args) {

    /**
     * This line creates a string literal "hellou" and assigns it to the variable hellou.
     * String literals are stored in the <b>string pool</b>,
     * which is a special area in the Java heap memory for storing unique string literals.
     */
    String hellou = "hellou";

    /**
     * This line creates a new string object using the new keyword and
     * assigns it to the variable newString. Unlike string literals,
     * objects created with new are stored in the regular heap memory,
     * not in the string pool.
     */
    String newString = new String("hellou");

    System.out.println("Checking with equals - " + hellou.equals("hellou"));
    System.out.println("Checking with equals - " + newString.equals("hellou"));

    /**
     * Here, you're comparing hellou (a reference to a string literal)
     * with the string literal "hellou" using the == operator.
     * Since both operands refer to the same string literal in the string pool,
     * the result of this comparison is true.
     * This comparison works because string literals are interned by the compiler,
     * meaning that identical string literals in the code point to the same memory location.
     */
    System.out.println("Checking with == - " + (hellou == "hellou"));

    /**
     * This line compares newString (a reference to an object created with new)
     * with the string literal "hellou" using the == operator.
     * Even though the content of newString is the same as the string literal,
     * they are stored in different memory locations.
     * Therefore, the result of this comparison is false.
     */
    System.out.println("Checking with creating new String - " + (newString == "hellou"));

    /**
     * Here, you're comparing newString (a reference to an object created with new)
     * with hellou (a reference to a string literal) using the == operator.
     * Since they are stored in different memory locations, the result of this comparison is false.
     */
    System.out.println("Checking with creating new String - " + (newString == hellou));
  }
}
