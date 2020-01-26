package MyPreparation.collectionsinjava.ComparatorAndComparable;

import java.util.Comparator;

public class FirstNameAndLastNameComparator implements Comparator<Emp2> {
  @Override
  public int compare(Emp2 o1, Emp2 o2) {
    return o1.getFirstName().compareTo(o1.getFirstName())
        - o1.getLastName().compareTo(o2.getLastName());
  }
}
