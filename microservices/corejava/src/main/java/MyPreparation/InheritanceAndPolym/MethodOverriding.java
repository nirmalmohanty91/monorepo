package MyPreparation.InheritanceAndPolym;

public class MethodOverriding {

  // Notice that the return type should be the Class itself or it's subclasses
  public Parent getCount() {
    Child c = new Child(5);
    return c;
  }
}
