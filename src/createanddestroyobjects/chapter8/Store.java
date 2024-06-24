package createanddestroyobjects.chapter8;

import java.util.ArrayList;
import java.util.List;

public class Store {

  public static void main(String[] args) {

    List<Integer> blocks = new ArrayList<>(4);
    checkedException(blocks);
  }

  private static void indexOB(List<Integer> blocks) {
    System.out.println(blocks.get(9));
  }

  private static void checkedException (List<Integer> blocks) {
    if (blocks.size() < 9) {
      throw new IndexBabyException("come on, it is not 9");
    }
  }

}
