package MyPreparation.designpatterns.SingletonDP;
/** Lazy instantiation example. Instance gets created on demand basis */
public class Singleton1 {

  private static Singleton1 firstInstance = null;
  // private constructor to avoid client applications to initialize the class
  private Singleton1() {
    System.out.println("Default Constructor of Singleton1");
  }

  public static Singleton1 getInstance() {

    if (firstInstance == null) {
      firstInstance = new Singleton1();
    }
    return firstInstance;
  }
}
