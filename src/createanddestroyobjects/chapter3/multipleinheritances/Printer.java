package createanddestroyobjects.chapter3.multipleinheritances;

public class Printer implements Printable, Showable {

  void print() {
    System.out.println("Printing a private printable object");
  }

  public void publicPrint() {
    System.out.println("Printing a public printable object");
  }

  public void show() {
    System.out.println("Welcome");
  }

  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.print();
    printer.publicPrint();
    printer.show();
    printer.msg();
  }
}
