package createanddestroyobjects.chapter5.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(value = ElementType.TYPE_USE)
public @interface Doc {

  String author();
  String date();
}
