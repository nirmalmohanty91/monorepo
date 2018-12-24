package MyPreparation.Java8concepts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8Flatmap {

  public static void main(String[] args) {
    List<User> userList =
        Arrays.asList(
            new User("Nirmal", 12, Arrays.asList("1", "2", "5")),
            new User("Batman", 30, Arrays.asList("78", "9", "0")));

    Optional<User> stringOptional =
        userList
            .stream().filter(user -> user.getPhoneNumbers().contains("5")).findAny();
            //.map(user -> user.getPhoneNumbers().stream())
            //.flatMap(p -> p.filter(phoneNumber -> phoneNumber.equalsIgnoreCase("50")))
            //.findAny();

    stringOptional.ifPresent(System.out::println);
  }
}
@ToString
@Setter
@Getter
@AllArgsConstructor
class User {
  private String firstName;
  private int age;
  private List<String> phoneNumbers;
}
