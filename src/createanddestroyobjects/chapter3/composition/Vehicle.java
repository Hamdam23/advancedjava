package createanddestroyobjects.chapter3.composition;

public class Vehicle {

  private Engine engine;
  private Wheel[] wheels;

  public Vehicle(Engine engine, int wheelCount, int wheelSize) {
    this.engine = engine;
    this.wheels = new Wheel[wheelCount];
    for (int i = 0; i < wheelCount; i++) {
      this.wheels[i] = new Wheel(wheelSize);
    }
  }

  public void start() {
    engine.start();
  }

  public void printWheelSizes() {
    for (Wheel wheel : wheels) {
      System.out.println("Wheel size: " + wheel.getSize());
    }
  }

}
