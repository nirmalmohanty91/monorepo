package MyPreparation.InheritanceAndPolym;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class Child extends Parent {
  private int j;

  @Override
  public Parent getParent() {
    Parent p = new Parent(7);
    return p;
  }
}
