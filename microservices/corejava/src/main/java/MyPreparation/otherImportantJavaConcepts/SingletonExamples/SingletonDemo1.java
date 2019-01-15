package MyPreparation.otherImportantJavaConcepts.SingletonExamples;

public class SingletonDemo1 {

  private static final SingletonDemo1 instance = new SingletonDemo1();
  // private constructor to avoid client applications to initialize the class
  private SingletonDemo1() {
    System.out.println("Default Constructor Executed in singleton class");
  }

  public static SingletonDemo1 getInstance() {
    return instance;
  }
}
