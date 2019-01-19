package MyPreparation.designpatterns.SingletonDP;

public class DriverClass {
  public static void main(String[] args) {

    Singleton1 firstInstance = Singleton1.getInstance();
    Singleton1 secondInstance = Singleton1.getInstance();
    System.out.println(firstInstance.equals(secondInstance));

    Singleton2 firstInstance2 = Singleton2.getInstance();
    Singleton2 secondInstance2 = Singleton2.getInstance();
    System.out.println(firstInstance2.equals(secondInstance2));
  }
}
