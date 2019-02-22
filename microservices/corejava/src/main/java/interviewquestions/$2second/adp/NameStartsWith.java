package interviewquestions.$2second.adp;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameStartsWith {

  public static void main(String[] args) {

    List<Employee> list = new ArrayList<>();
    list.add(Employee.builder().id(1).name("Aron").build());
    list.add(Employee.builder().id(1).name("Bron").build());
    list.add(Employee.builder().id(1).name("Cron").build());
    list.add(Employee.builder().id(1).name("Dron").build());
    list.add(Employee.builder().id(1).name("Avram").build());
    list.add(Employee.builder().id(1).name("Wron").build());

    List<Employee> list1 =
        list.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());
    System.out.println(list1);
  }
}
