package createanddestroyobjects.chapter4.generics;

public class Main {

  public static void main(String[] args) {
//    singleGenExample();
    multiGenExample();
  }

  private static void singleGenExample() {
    // instance of Integer type
    SingleGenerics<Integer> iObj = new SingleGenerics<>(15);
    System.out.println(iObj.getObject());

    // instance of String type
    SingleGenerics<String> sObj = new SingleGenerics<>("GeeksForGeeks");
    System.out.println(sObj.getObject());
  }

  private static void multiGenExample() {
    MultiGenerics<Integer, String> iObj = new MultiGenerics<>(87, "Giki");
    iObj.print();
  }
}
