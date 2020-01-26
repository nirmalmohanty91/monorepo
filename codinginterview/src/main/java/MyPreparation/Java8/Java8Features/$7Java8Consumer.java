package MyPreparation.Java8.Java8Features;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@Setter
@Getter
@ToString
@Builder
class Student {
  String firstName;
  int mark;
  double salary;
}

public class $7Java8Consumer {
  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    studentList.add(Student.builder().firstName("Nirmal").mark(74).build());
    studentList.add(Student.builder().firstName("Bruce").mark(100).build());
    studentList.add(Student.builder().firstName("Prophet").mark(65).build());
    studentList.add(Student.builder().firstName("Jone").mark(35).build());
    studentList.add(Student.builder().firstName("Jason").mark(25).build());

    Function<Student, String> calculateGrade =
        s -> {
          if (s.mark > 70) {
            return "A";
          } else if (s.mark > 60) {
            return "B";
          } else if (s.mark > 40) {
            return "C";
          } else if (s.mark > 30) return "D";
          else return "F";
        };
    Predicate<Student> gradeAStudents = s -> calculateGrade.apply(s) == "A";

    Consumer<Student> printStudent =
        s -> {
          System.out.println("Name: " + s.firstName);
          System.out.println("Mark: " + s.mark);
          System.out.println("Grade: " + calculateGrade.apply(s));
          System.out.println();
        };

    studentList.forEach(
        student -> {
          if (gradeAStudents.test(student)) {
            printStudent.accept(student);
          }
        });
  }
}
