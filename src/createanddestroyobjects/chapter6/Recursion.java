package createanddestroyobjects.chapter6;

import java.util.Arrays;

public class Recursion {

  public static void main(String[] args) {
    System.out.println(sum(new int[] {1, 2, 3, 4, 5}));
  }

  public static int sum(int[] numbers) {
    if (numbers.length == 0) {
      return 0;
    }
    if (numbers.length == 1) {
      return numbers[0];
    } else {
      return numbers[0] + sum(Arrays.copyOfRange(numbers, 1, numbers.length));
    }
  }
}
