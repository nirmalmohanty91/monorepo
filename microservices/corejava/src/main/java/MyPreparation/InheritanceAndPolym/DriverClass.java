package MyPreparation.InheritanceAndPolym;

import MyPreparation.InheritanceAndPolym.inheritance.ChildInSamePackage;
import MyPreparation.InheritanceAndPolym.inheritance1.ChildInDifferentPackage;
import MyPreparation.InheritanceAndPolym.inheritance3.Child;
import MyPreparation.InheritanceAndPolym.inheritance3.Parent;

public class DriverClass {

  public static void main(String[] args) {
    // Testing return types in inheritance
    Parent child = new Child();
    System.out.println(child.getParent());

    // Testing protected constructor in inheritance
    ChildInDifferentPackage ch = new ChildInDifferentPackage();
    ch.parentMethods();
    System.out.println("--------------------------");
    ChildInSamePackage ch1 = new ChildInSamePackage();
    ch1.methodsOfParent();


  }
}
