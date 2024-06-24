package createanddestroyobjects.chapter8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked {

  public static void main(String[] args) throws FileNotFoundException, IncorrectFileNameException {
    checkedExceptionWithTryCatch();
    checkedExceptionWithThrows();
  }

  private static void checkedExceptionWithThrows() throws FileNotFoundException {
    File file = new File("not_existing_file.txt");
    FileInputStream stream = new FileInputStream(file);
  }

  private static void checkedExceptionWithTryCatch() throws IncorrectFileNameException {
    File file = new File("not_existing_file.txt");
    try {
      FileInputStream stream = new FileInputStream(file);
    } catch (FileNotFoundException e) {
      throw new IncorrectFileNameException("no file mister");
    }
  }
}
