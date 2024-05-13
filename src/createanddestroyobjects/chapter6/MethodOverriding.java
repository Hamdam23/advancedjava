package createanddestroyobjects.chapter6;

public class MethodOverriding {

  public Object toObject(Integer number) {
    return number.toString();
  }

  public static void main(String[] args) {
    String child = new Child().toObject(1);
    System.out.println(child);
    Object parent = new MethodOverriding().toObject(1);
    System.out.println(parent);
  }

}

class Child extends MethodOverriding {

  @Override
  public String toObject(Integer number) {
    return number.toString();
  }
}

class AnotherChild extends MethodOverriding {

  // @Override
  // TODO remove the @Override annotation to see the compilation error
  public Object toObject(Double number) {
    return number.toString();
  }
}
