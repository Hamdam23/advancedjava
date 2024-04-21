package createanddestroyobjects.chapter2.objmethods;

import java.util.Objects;

public class Person {

  private int age;
  private String name;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Person person = (Person) obj;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
  }

  @Override
  public String toString() {
    return "This is " + name + " at age of " + age;
  }

  public static void main(String[] args) {
    System.out.println(new Person(10, "John"));

    Person martin = new Person(13, "Martin");
    Person silvia = new Person(9, "Silvia");
    System.out.println("Is Martin equal to Silvia " + martin.equals(silvia));
    System.out.println("No need to teach gender equality");
    System.out.println("Is Martin equal to Martin " + martin.equals(new Person(13, "Martin")));

    System.out.println("\nMartin's hashcode " + martin.hashCode());
    System.out.println("Silvia's hashcode " + silvia.hashCode());
    System.out.println("Bob's hashcode " +  new Person(45, "Bob").hashCode());
  }
}
