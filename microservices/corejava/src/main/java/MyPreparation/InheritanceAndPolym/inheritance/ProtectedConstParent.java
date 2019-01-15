package MyPreparation.InheritanceAndPolym.inheritance;

public class ProtectedConstParent {
  protected int i = 98;
  private String name;
  protected ProtectedConstParent(){
    System.out.println("Default Parent constructor");
  }

  /**
   * child class in different package won't be able to access the constructor of parent if marked
   * protected
   */
  protected ProtectedConstParent(String name) {
    this.name = name;
    System.out.println("Call to parent constructor from "+this.name);
  }

  protected String name() {
    return "Protected method of Parent";
  }
}

