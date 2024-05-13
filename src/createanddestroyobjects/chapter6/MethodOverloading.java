package createanddestroyobjects.chapter6;

import java.math.BigDecimal;

public class MethodOverloading {

  public static String numberToString(Long number) {
    return Long.toString(number);
  }

  public static String numberToString(BigDecimal number) {
    return number.toString();
  }

  public static void main(String[] args) {
    System.out.println(numberToString(1L));
    System.out.println(numberToString(new BigDecimal(13)));
  }

}
