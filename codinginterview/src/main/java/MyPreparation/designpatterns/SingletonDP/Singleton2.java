package MyPreparation.designpatterns.SingletonDP;
/**
 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a Singleton class.
 *
 * <p>By making the constructor as private you are not allowing other class to create a new instance
 * of the class you want to create the Singleton. Instead, you are creating one public static method
 * (commonly name as for getInstance()) to provide the single entry point to create the new instance
 * of the class.
 */
public class Singleton2 {

  private static final Singleton2 firstInstance = new Singleton2();

  private Singleton2() {
    System.out.println("Default constructor of Singleton2");
  }

  public static Singleton2 getInstance() {
    return firstInstance;
  }
}
