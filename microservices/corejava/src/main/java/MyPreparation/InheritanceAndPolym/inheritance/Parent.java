package MyPreparation.InheritanceAndPolym.inheritance;

public class Parent {
  protected int i = 98;
  /**
   * child class in different package won't be able to access the constructor of parent if marked
   * protected
   */
  // protected Parent() {
  public Parent() {}

  protected void name() {
    System.out.println("hello Nirmal");
  }
}

class Child extends Parent {
  void methodsOfParent() {
    System.out.println(i);
    new Parent().name();
  }
}
