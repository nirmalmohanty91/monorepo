package MyPreparation.InheritanceAndPolym.Polymorphism.MethodOverloading;

class TestingOverloading {

  static void m1(Object object) {
    System.out.println("Object");
  }

  static void m1(String string) {
    System.out.println("String");
  }
}

public class Driver {
  public static void main(String[] args) {
    TestingOverloading.m1(null);
  }
}
