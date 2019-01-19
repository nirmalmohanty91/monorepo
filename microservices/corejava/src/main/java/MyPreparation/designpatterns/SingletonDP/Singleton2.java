package MyPreparation.designpatterns.SingletonDP;

public class Singleton2 {

  private static final Singleton2 firstInstance = new Singleton2();

  private Singleton2() {
    System.out.println("Default constructor of Singleton2");
  }

  public static Singleton2 getInstance() {
    return firstInstance;
  }
}
