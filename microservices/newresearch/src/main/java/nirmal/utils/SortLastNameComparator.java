package nirmal.utils;

import java.util.Comparator;

import nirmal.domain.Person;
import org.springframework.stereotype.Component;

@Component
public class SortLastNameComparator implements Comparator<Person> {

  @Override
  public int compare(Person o1, Person o2) {
    return o1.getLastName().compareTo(o2.getLastName());
  }
}
