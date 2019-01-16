package MyPreparation.Java8.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class $8Java8BiPredicate {
  public static void main(String[] args) {

    BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) > 50;
    System.out.println(biPredicate.test(12, 9));

    BiFunction<String, Integer, Student> biFunction =
        (name, mark) -> Student.builder().firstName(name).mark(mark).build();

    List<Student> students = new ArrayList<>();
    students.add(biFunction.apply("Nirmal", 60));
    students.add(biFunction.apply("Hello", 90));
    System.out.println(students);

    ArrayList<Student> l = new ArrayList<>();
    BiConsumer<Student, Double> biConsumer = (s, d) -> s.salary += d;
    populateList(l);
    l.forEach(student -> biConsumer.accept(student, 500.0));
    l.forEach(System.out::println);

    // There is no BiSupplier

  }

  public static void populateList(ArrayList<Student> l) {
    l.add(Student.builder().firstName("Nirmal").salary(1000).build());
  }
}
