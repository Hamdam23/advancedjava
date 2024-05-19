package createanddestroyobjects.chapter7.strings;

public class Strings {

  public static void main(String[] args) {
    String s1 = "Hello"; //It creates a new instance(e.g: hashcode = 69609650)
    String s2 = "Hello"; //It doesn't create a new instance(e.g: hashcode = 69609650)
    String s3 = "Bye"; //It creates a new instance(e.g: hashcode = 67278)

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
  }

}
