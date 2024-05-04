package createanddestroyobjects.chapter3.interfaces;

public class Printer implements Printable {

  public void print() {
    System.out.println("Hello");
  }

  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.print();
  }

}
