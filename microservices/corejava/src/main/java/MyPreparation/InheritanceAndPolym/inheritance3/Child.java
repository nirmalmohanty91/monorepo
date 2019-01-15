package MyPreparation.InheritanceAndPolym.inheritance3;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Child extends Parent {
  private int j;
  /** Note that this method can return the same class(Parent) or subclasses of Parent(child) */
  @Override
  public Parent getParent() {
    //    Parent parent = new Parent(7);
    //    return parent;
    Child child = new Child(5);
    return child;
  }
}
