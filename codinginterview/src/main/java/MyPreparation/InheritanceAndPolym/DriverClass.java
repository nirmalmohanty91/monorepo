package MyPreparation.InheritanceAndPolym;

import MyPreparation.InheritanceAndPolym.Polymorphism.MethodOverriding.SubClass;
import MyPreparation.InheritanceAndPolym.Polymorphism.MethodOverriding.SuperClass;
import MyPreparation.InheritanceAndPolym.inheritance.ChildInSamePackage;
import MyPreparation.InheritanceAndPolym.inheritance1.ChildInDifferentPackage;
import MyPreparation.InheritanceAndPolym.inheritance3.Child;
import MyPreparation.InheritanceAndPolym.inheritance3.Parent;

public class DriverClass {

  public static void main(String[] args) {
    // Testing return types in inheritance
    Parent child = new Child();
    System.out.println(child.getParent());
    System.out.println("--------------------------");

    // Testing protected constructor in inheritance
    ChildInDifferentPackage ch = new ChildInDifferentPackage();
    ch.parentMethods();
    System.out.println("--------------------------");
    ChildInSamePackage ch1 = new ChildInSamePackage();
    ch1.methodsOfParent();
    System.out.println("--------------------------");

    // Testing Method Overriding
    SuperClass superclass = new SuperClass();
    superclass.methodOfSuperClass();
    superclass.staticMethod();

    SubClass subclass = new SubClass();
    subclass.methodOfSuperClass();
    subclass.staticMethod();

    SuperClass superclass1 = new SubClass();
    superclass1.methodOfSuperClass();
    superclass1.staticMethod();


  }
}
