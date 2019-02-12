package MyPreparation.collectionsinjava.ListPrograms.programs;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorInJava8 {
  public static void main(String[] args) {

    ArrayList<Stud> arrayList = new ArrayList<>();
    arrayList.add(new Stud(101, "Zues", 26, "Hello"));
    arrayList.add(new Stud(45, "Abey", 24, "Abc"));
    arrayList.add(new Stud(80, "Vignesh", 32, "Jbp"));
    arrayList.add(new Stud(101, "Zues", 26, "Aello"));

    ComparatorInJava8 comparatorInJava8 = new ComparatorInJava8();
    comparatorInJava8.sorting(arrayList);
  }

  public void sorting(List<Stud> list) {
    System.out.println(list);
    list.sort(Comparator.comparing(Stud::getRollNo));
    System.out.println(list);
    list.sort(Comparator.comparing(Stud::getFistName).thenComparing(Stud::getLastName));
    System.out.println(list);
  }
}

@Getter
@ToString
class Stud {
  private String fistName;
  private String lastName;
  private int rollNo;
  private int studentAge;

  public Stud(int rollno, String studentname, int studentage, String lastName) {
    this.rollNo = rollno;
    this.fistName = studentname;
    this.lastName = lastName;
    this.studentAge = studentage;
  }
}
