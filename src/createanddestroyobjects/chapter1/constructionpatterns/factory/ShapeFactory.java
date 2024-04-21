package createanddestroyobjects.chapter1.constructionpatterns.factory;

/**
 * The Factory pattern defines an interface for creating objects, but it allows subclasses to alter
 * the type of objects that will be created. It's useful when you want to encapsulate object
 * creation logic and decouple the client code from the concrete implementation of the objects.
 * There are different variations of the Factory pattern, such as Factory Method and Abstract
 * Factory.
 */
public class ShapeFactory {

  public static Shape createShape(String type) {
    if ("circle".equalsIgnoreCase(type)) {
      return new Circle();
    } else if ("square".equalsIgnoreCase(type)) {
      return new Square();
    }
    throw new IllegalArgumentException("Invalid shape type: " + type);
  }

  public static void main(String[] args) {
    createShape("circle").draw();
    createShape("square").draw();
    createShape("triangle").draw();
  }
}
