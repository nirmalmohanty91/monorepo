package MyPreparation.Java8.Java8Features;

interface Parent1 {
  default void hello() {
    System.out.println("Parent1 Default implementation");
  }
}

interface Parent2 {
  // You will get compile time error if you make the access modifier to default. To avoid this you
  // should override this method in implementation class
  default void hello() {
    System.out.println("Parent2 Default implementation");
  }
}

class Child implements Parent1, Parent2 {
  // overriding to avoid multiple inheritance problem
  public void hello() {
    // System.out.println("Overriding default implementation.");
    // If you want to use any of the interface methods use below syntax
    //Parent1.super.hello();
    Parent2.super.hello();
  }
}

public class $6Java8Interface {
  public static void main(String[] args) {
    Child c = new Child();
    c.hello();
  }
}
