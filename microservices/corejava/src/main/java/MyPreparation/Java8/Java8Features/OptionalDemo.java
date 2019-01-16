package MyPreparation.Java8.Java8Features;

import java.util.Optional;

// Java 8 has introduced a new class Optional in java.util package. It is used to represent a value
// is present or absent. The main advantage of this new construct is that No more too many null
// checks and NullPointerException. It avoids any runtime NullPointerExceptions and supports us in
// developing clean and neat Java APIs or Applications. Like Collections and arrays, it is also a
// Container to hold at most one value. Let us explore this new construct with some useful examples.
public class OptionalDemo {
  public static void main(String[] args) {
    Optional<String> names = Optional.ofNullable("Nirmal");
    Optional<String> names1 = Optional.of("Nirmal");

    System.out.println(names);
    System.out.println(names.get());
    System.out.println(names.isPresent());
    System.out.println(names.hashCode());
    System.out.println(Optional.empty());

    String outPut = names.orElse("Empty");
    System.out.println(outPut);

    String outPut1=names1.orElse("empty");
    System.out.println(outPut1);


  }
}
