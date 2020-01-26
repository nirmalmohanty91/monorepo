package MyPreparation.designpatterns.SingletonDP;
/** Lazy instantiation example. Instance gets created on demand basis */
public class Singleton1 {

  private static Singleton1 firstInstance;
  // private constructor to avoid client applications to initialize the class
  private Singleton1() {
    // Prevent form the reflection api.
    if (firstInstance != null) {
      throw new RuntimeException(
          "Use getInstance() method to get the single instance of this class.");
    }
  }
  // Making the getInstance method synchronized to avoid this issue: If two threads try to
  // initialize the Singleton class at almost the same time, what happens? Let’s test below code in
  // which two threads are created almost simultaneously and they are calling getInstance().If you
  // run this code many times, you will see sometimes both the threads creates different instances.
  // That means your Singleton class is not Thread safe. Both the threads calls out getInstance()
  // method at the same time, the firstInstance == null condition will return for both the thread.
  // So, two different instances of the same class will be created. That will break the singleton
  // principle. So make getInstance() synchronized.
  public static synchronized Singleton1 getInstance() {

    if (firstInstance == null) { // if there is no instance available... create new one
      firstInstance = new Singleton1();
    }
    return firstInstance;
  }
}
