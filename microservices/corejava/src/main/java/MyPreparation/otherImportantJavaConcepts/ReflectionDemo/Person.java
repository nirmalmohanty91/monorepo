package MyPreparation.otherImportantJavaConcepts.ReflectionDemo;

public class Person {
  public int id;
  private String name;

  public Person() {
    System.out.println("Default constructor accessed.");
  }

  private Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  private void getMyName() {
    System.out.println("My name is " + name);
  }

  public void getFortune(int n) {
    System.out.println("Today is your lucky day " + n);
  }

  private void callPrivate() {
    System.out.println("Private method accessed.");
  }
}
