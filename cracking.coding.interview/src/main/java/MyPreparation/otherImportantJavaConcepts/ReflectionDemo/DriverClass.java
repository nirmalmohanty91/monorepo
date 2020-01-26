package MyPreparation.otherImportantJavaConcepts.ReflectionDemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Use of Reflection API in java
 * 1. For Compiler
 * ----------------
 * We know that classes can only be declared using public/default modifier but not private/protected.
 * If you declare a class with private/protected modifier you will get a compilation error. Now how
 * compiler is throwing this error. To throw the error compiler should get the information about the
 * class and check if the modifiers are allowed or not. Here compiler uses the Reflection API.
 * 2. JVM
 * -------
 * While creating object of the class JVM checks if no 0-arg & non-private constructor is available.
 * JVM checks the .class file while using Class.forName() in 3 diff locations:
 * 1. Current Location
 * 2. java predefined library
 * 3. location referred by class path variable
 * */
public class DriverClass {
  public static void main(String[] args)
          throws NoSuchMethodException, InvocationTargetException, IllegalAccessException,
          NoSuchFieldException, ClassNotFoundException, InstantiationException {
    // There are 3 ways to create object of a class
    // 1. using Class.forName()
    Class c1 = Class.forName("MyPreparation.otherImportantJavaConcepts.ReflectionDemo.Person");
    Person person1 = (Person) c1.newInstance();
    // 2. using .class
    Class c2 = Person.class;
    // 3. using .getClass()
    Person person = new Person();
    Class c3 = person.getClass();
    System.out.println("Name of the class: " + c3.getName());

    System.out.println("Printing public variables(Can't access private variables):");
    Field[] fields = c3.getFields();
    Arrays.stream(fields).forEach(x -> System.out.println(x + " "));

    System.out.println("Printing constructor:");
    Constructor constructor = c3.getConstructor();
    System.out.println(constructor.getName());

    System.out.println("Get all Public methods of the class:");
    Method[] methods = c3.getMethods();
    // Arrays.stream(methods).forEach(x -> System.out.println(x + " "));

    System.out.println("Accessing public method: ");
    Method methodcall1 = c3.getDeclaredMethod("getFortune", int.class);
    methodcall1.invoke(person, 19);

    System.out.println("Accessing private variable:");
    Field field = c3.getDeclaredField("name");
    field.setAccessible(true);
    field.set(person, "Nirmal");

    System.out.println("Accessing private method: ");
    Method methodcall2 = c3.getDeclaredMethod("getMyName");
    methodcall2.setAccessible(true);
    methodcall2.invoke(person);

    Method methodcall3 = c3.getDeclaredMethod("callPrivate");
    methodcall3.setAccessible(true);
    methodcall3.invoke(person);

    // Creating object of abstract class

//    Class abstractClass = AbstractClass.class;
//    AbstractClass abs = (AbstractClass) abstractClass.newInstance();
//    Method m1 = abstractClass.getDeclaredMethod("getName");
//    m1.invoke(abs);



  }
}
