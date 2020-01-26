package MyPreparation.collectionsinjava.ComparatorAndComparable;

import java.util.Comparator;

class AgeComparator implements Comparator<Emp2> {

  @Override
  public int compare(Emp2 o1, Emp2 o2) {
    return o1.age - o2.age;
  }
}
