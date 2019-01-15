package MyPreparation.InheritanceAndPolym;

import MyPreparation.InheritanceAndPolym.inheritance1.ChildForTestingProtectedParentConstructor;
import MyPreparation.InheritanceAndPolym.inheritance3.Child;
import MyPreparation.InheritanceAndPolym.inheritance3.Parent;

public class DriverClass {

  public static void main(String[] args) {
    // Testing return types in inheritance
    Parent child = new Child();
    System.out.println(child.getParent());

    // Testing protected constructor in inheritance
    ChildForTestingProtectedParentConstructor ch = new ChildForTestingProtectedParentConstructor();
    ch.parentMethods();
  }
}
