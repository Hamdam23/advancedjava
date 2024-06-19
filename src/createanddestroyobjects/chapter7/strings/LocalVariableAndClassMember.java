package createanddestroyobjects.chapter7.strings;

public class LocalVariableAndClassMember {

  private long value;

  public long calculateMethodValue(final long initial) {
    long value = initial;
    value *= 10;
    value += value;
    return value;
  }

  public long calculateValue( final long initial ) {
    long value = initial;
    value *= 10;
    value += this.value;
    return value;
  }
}

class LocalVariableAndClassMemberTest {

  public static void main(String[] args) {
    LocalVariableAndClassMember localVariableAndClassMember = new LocalVariableAndClassMember();
    System.out.println("calculating method scope" + localVariableAndClassMember.calculateMethodValue(10));
    System.out.println("calculating class scope" + localVariableAndClassMember.calculateValue(10));
  }
}