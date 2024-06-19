package createanddestroyobjects.chapter7.strings;

public class MethodArguments {

  public String sanitize(String str) {
    if (!str.isEmpty()) {
      str = str.trim();
    }
    str = str.toLowerCase();
    return str;
  }

  public String sanitizeFinal(final String str) {
    String sanitized = str;

    if (!str.isEmpty()) {
      sanitized = str.trim();
    }
    sanitized = sanitized.toLowerCase();
    return sanitized;
  }

  public static void main(String[] args) {
    MethodArguments methodArguments = new MethodArguments();
    System.out.println(methodArguments.sanitize("  Hello World  "));
    System.out.println(methodArguments.sanitizeFinal("  Hello World  "));
  }

}
