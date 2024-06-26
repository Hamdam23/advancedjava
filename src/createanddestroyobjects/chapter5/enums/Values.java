package createanddestroyobjects.chapter5.enums;

public class Values {

  enum Season {
    WINTER(5), SPRING(10), SUMMER(15), FALL(20);

    private int value;

    private Season(int value) {
      this.value = value;
    }
  }

  public static void main(String[] args) {
    for (Season s : Season.values()) {
      System.out.println(s + " " + s.value + " " + s.name() + " " + s.ordinal());
    }
  }
}
