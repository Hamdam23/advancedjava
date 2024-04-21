package createanddestroyobjects.chapter1.constructionpatterns.utilityhelper;

/**
 * This is not a formal design pattern but rather a common practice.
 * Utility/helper classes contain static methods that perform common tasks and operations,
 * such as string manipulation, date formatting, or mathematical calculations.
 * They provide reusable functionality throughout the application without the need to create instances.
 */
public class StringUtils {

  public static boolean isEmpty(String str) {
    return str == null || str.isEmpty();
  }

  public static String capitalize(String str) {
    if (isEmpty(str)) {
      return str;
    }
    return str.substring(0, 1).toUpperCase() + str.substring(1);
  }

  public static void main(String[] args) {
    System.out.println(isEmpty("Hello World!"));
    System.out.println(capitalize("Goodbye World!"));
  }
}
