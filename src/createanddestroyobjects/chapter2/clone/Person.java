package createanddestroyobjects.chapter2.clone;

public class Person implements Cloneable{

  private int age;
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "This is a person: " + name + ", age: " + age;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Person john = new Person(10, "John");
    Person clonedJohn = (Person) john.clone();
    clonedJohn.setName("Cloned John");

    System.out.println(john);
    System.out.println(clonedJohn);
  }
}
