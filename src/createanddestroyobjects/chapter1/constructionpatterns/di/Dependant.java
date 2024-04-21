package createanddestroyobjects.chapter1.constructionpatterns.di;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dependant {

  private final DateFormat format;

  public Dependant(DateFormat format) {
    this.format = format;
  }

  public String format(final Date date) {
    return format.format(date);
  }

  public static void main(String[] args) {
    Dependant d = new Dependant(new SimpleDateFormat("dd-MM-yyyy"));
    System.out.println(d.format(new Date(124, Calendar.APRIL, 21)));
  }

}
