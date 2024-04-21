package createanddestroyobjects.chapter1.constructionpatterns.singleton;

/**
 * The Singleton pattern ensures that a class has only one instance and provides a global point of
 * access to that instance. It's commonly used when you need exactly one instance of a class to
 * coordinate actions across the system, such as a logger, database connection, or configuration
 * manager.
 */
public class Logger {

  private static Logger instance;

  // Private constructor to prevent instantiation from outside
  private Logger() {
  }

  public static Logger getInstance() {
    if (instance == null) {
      instance = new Logger();
    }
    return instance;
  }

  public void log(String message) {
    System.out.println(message);
  }

  public static void main(String[] args) {
    System.out.println(new Logger());

    Logger logger = Logger.getInstance();
    logger.log("goodbye world");
  }

}
