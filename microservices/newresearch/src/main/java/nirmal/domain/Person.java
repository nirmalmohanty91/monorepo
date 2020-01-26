package nirmal.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    // public static Comparator<Person> lastNameComparator = new Comparator<Person>() {
    //
    // @Override
    // public int compare(Person p1, Person p2) {
    // return p1.getLastName().compareTo(p2.getLastName());
    // }
    // };

}
