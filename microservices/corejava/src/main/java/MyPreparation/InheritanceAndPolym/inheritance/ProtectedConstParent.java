package MyPreparation.InheritanceAndPolym.inheritance;

public class ProtectedConstParent {
  protected int i = 98;
  /**
   * child class in different package won't be able to access the constructor of parent if marked
   * protected
   */
  protected ProtectedConstParent() {
    System.out.println("Parent constructor");
  }

  protected String name() {
    return "Protected method of Parent";
  }
}

class Child extends ProtectedConstParent {

  void methodsOfParent() {
    System.out.println(i);
    new ProtectedConstParent().name();
  }
}
