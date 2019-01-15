package MyPreparation.InheritanceAndPolym.Polymorphism.MethodOverriding;
/** 1. Also known as dynamic-polymorphism
 *  2. The return type of the overrided method must be compatible with super class method.
 *  3. You can keep same visibility or increase the visibility of overrided method but you can’t
 *     reduce the visibility of overrided methods in the subclass.*/
public class SubClass extends SuperClass {
  @Override
  public void methodOfSuperClass() {
    // SuperClass method is overrided
    // We can keep any tasks here according to our requirements.
    System.out.println("From Sub Class");
    //staticMethod();
  }
  // Static methods are not recognized in subclass. so you can override it
  /**
  @Override
  public static void staticMethod() {
    System.out.println("Static Method in super class");
  }
  */
  // Cann't change data type of the arguments
  /**
  @Override
  public void getNumber(int i){
    System.out.println(i);
  }
  */
}
