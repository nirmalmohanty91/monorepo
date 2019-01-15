package MyPreparation.InheritanceAndPolym.inheritance1;

import MyPreparation.InheritanceAndPolym.inheritance.ProtectedConstParent;

public class ChildInDifferentPackage extends ProtectedConstParent {


  public ChildInDifferentPackage(){
    //super();
    super("Child in different package.");
    System.out.println("Constructor of Subclass in diff package");
  }


  public void parentMethods() {
    System.out.println("Child in diff pkg accessing Parent's Protected variable: " + i);
    System.out.println("Child in diff pkg accessing Parent's Protected method: " + name());
    // Because, we can’t instantiate a class outside the package which has only protected constructors.
    // ProtectedConstParent p = new ProtectedConstParent("Child in different package.");
  }
}
