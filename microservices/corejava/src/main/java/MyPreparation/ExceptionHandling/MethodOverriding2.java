package MyPreparation.ExceptionHandling;

public class MethodOverriding2 {
  public static void main(String[] args) {
    Child1 c = new Child1();
    c.m1();
  }
}

class Parent1 {
  public void m1()
      throws
          ArrayIndexOutOfBoundsException { // ArrayIndexOutOfBoundsException extends
                                           // IndexOutOfBoundsException
    System.out.println("Parent1");
  }
}

class Child1 extends Parent1 {
  @Override
  public void m1() throws IndexOutOfBoundsException {
    System.out.println("Child1");
  }
}

class Child2 extends Parent1 {
  @Override
  public void m1()
      throws
          StringIndexOutOfBoundsException { // StringIndexOutOfBoundsException extends
                                            // IndexOutOfBoundsException
    System.out.println("Child2");
  }
}
