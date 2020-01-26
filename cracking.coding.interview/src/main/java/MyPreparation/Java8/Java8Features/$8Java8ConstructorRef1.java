package MyPreparation.Java8.Java8Features;

import lombok.ToString;

@ToString
class Sample {
  int salary;
  String name;

  Sample() {
    System.out.println("Sample class constructor called");
  }

  Sample(int salary, String name) {
    this.salary = salary;
    this.name = name;
  }
}

interface Interface1 {
  // Sample get();

  Sample get(int Sal, String name);
}

public class $8Java8ConstructorRef1 {

  public static void main(String[] args) {
    Interface1 interface1 =
        Sample::new; // here interface get() is referring to Sample class constructor
    // Sample s = interface1.get();
    Sample s = interface1.get(300, "Nirmal");
    System.out.println(s);
  }
}
