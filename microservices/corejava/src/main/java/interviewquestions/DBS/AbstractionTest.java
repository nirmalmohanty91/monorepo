package interviewquestions.DBS;

public class AbstractionTest extends A implements B {
  public static void main(String[] args) {
    B b = new AbstractionTest();
    b.m1();
    b.m2();

    A a = new AbstractionTest();
    a.m1();

  }

  @Override
  public void m1() {
    System.out.println("Implemented");
  }

  @Override
  public void m2() {
    System.out.println("M2 implemented");
  }
}

abstract class A {
  public abstract void m1();
}

interface B {
  void m1();

  void m2();
}
