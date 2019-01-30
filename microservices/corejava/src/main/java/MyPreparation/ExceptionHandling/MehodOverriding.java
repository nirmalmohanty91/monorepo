package MyPreparation.ExceptionHandling;

public class MehodOverriding {
  public static void main(String[] args) {
    Child c = new Child();
    c.m1();
  }
}

class Parent {
  public void m1() throws Exception {
    System.out.println("Parent");
  }
}

class Child extends Parent {
  @Override
  public void m1() {
    System.out.println("Child");
  }
}
// This is a valid method overriding
