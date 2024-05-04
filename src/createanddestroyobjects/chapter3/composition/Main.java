package createanddestroyobjects.chapter3.composition;

public class Main {

  public static void main(String[] args) {
    Engine engine = new Engine();
    Vehicle car = new Vehicle(engine, 4, 18); // A car with 4 wheels of size 18
    car.start(); // Start the car's engine
    car.printWheelSizes(); // Print the size of each wheel
  }
}
