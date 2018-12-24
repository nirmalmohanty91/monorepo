package MyPreparation.InheritanceAndPolym;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * There is no such thing as a private class, except in a very special case is called an inner
 * class. There are 3 things that can prevent a class from being subclassed 1. A class can be
 * non-public. A non-public class can be subclassed only by classed in the same package as the
 * class. Classes in a different package won't be able to subclass non-public class 2. If a class is
 * marked as final (e.g.: String class) 3. If the class has a private constructor
 */
@AllArgsConstructor
@RequiredArgsConstructor
public class Parent {
  private int i;

  public Parent getParent() {
    return new Parent(6);
  };
}
