package MyPreparation.InheritanceAndPolym.inheritance;

public class ChildInSamePackage extends ProtectedConstParent {

  public void methodsOfParent() {
    System.out.println("Child in same pkg accessing Parent's Protected variable: " + i);
    System.out.println("Child in same pkg accessing Parent's Protected method: " + name());
    // Protected constructor can be access for child classes within the same package.
    ProtectedConstParent protectedConstParent = new ProtectedConstParent("Child in same package.");
  }
}
