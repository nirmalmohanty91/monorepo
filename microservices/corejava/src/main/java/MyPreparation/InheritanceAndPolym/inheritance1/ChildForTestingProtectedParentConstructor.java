package MyPreparation.InheritanceAndPolym.inheritance1;

import MyPreparation.InheritanceAndPolym.inheritance.ProtectedConstParent;

public class ChildForTestingProtectedParentConstructor extends ProtectedConstParent {

  public void parentMethods() {
    System.out.println("You can access protected variables from Parent: " + i);
    System.out.println("You can access protected methods from Parent: " + name());
    // We can't access protected constructor of Parent.
    // So NOTE that constructor is not part of inheritance concept.
    // It is only applicable for variables and methods
    // ProtectedConstParent p = new ProtectedConstParent();
  }
}
