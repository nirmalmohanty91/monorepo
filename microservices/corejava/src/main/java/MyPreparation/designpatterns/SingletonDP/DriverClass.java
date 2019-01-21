package MyPreparation.designpatterns.SingletonDP;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DriverClass {
  public static void main(String[] args)
      throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
          InstantiationException {

    Singleton1 firstInstance = Singleton1.getInstance();
    Singleton1 secondInstance = Singleton1.getInstance();
    System.out.println(firstInstance.hashCode() + " : " + secondInstance.hashCode());
    System.out.println("Comparing two singleton objects: " + firstInstance.equals(secondInstance));
    // Using Reflection to break singleton Pattern
    Class<Singleton1> clazz = Singleton1.class;
    Constructor<Singleton1> cons = clazz.getDeclaredConstructor();
    cons.setAccessible(true);
    Singleton1 thirdInstance = cons.newInstance();
    System.out.println(
        firstInstance.hashCode()
            + " : "
            + secondInstance.hashCode()
            + " : "
            + thirdInstance.hashCode());

    System.out.println(
        "Comparing Reflection Object and normal instance: " + firstInstance.equals(thirdInstance));

    Singleton2 firstInstance2 = Singleton2.getInstance();
    Singleton2 secondInstance2 = Singleton2.getInstance();
    System.out.println(firstInstance2.equals(secondInstance2));
  }
}
