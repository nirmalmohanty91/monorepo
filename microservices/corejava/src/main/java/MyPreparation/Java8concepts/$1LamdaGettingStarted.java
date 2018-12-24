package MyPreparation.Java8concepts;

import java.util.Comparator;

/** No name,No return type,No modifiers. "->" is to identify that it is a lambda exp */
public class $1LamdaGettingStarted {

  // Java 7 way
  public static void printName() {
    System.out.println("Nirmal");
  }
  // Let's convert the above code to lambda expression
  /*
      () -> {System.out.println("Nirmal"); }
  */

  // If there is only one line you can remove the {}

  /*
      () -> System.out.println("Nirmal");   //This is nothing but lambda expression
  */

  /** ----------------------------- */
  // Java 7 way
  public static void printName(int a, int b) {
    System.out.println(a + b);
  }
  // The Equivalent lambda exp for the above code is
  /*
      (int a, int b) -> System.out.println(a+b);
  */

  // If the  Compiler can guess the variable type automatically then remove the variable type like
  // below
  /*
      (a, b) -> System.out.println(a+b);
  */
  /** ----------------------------- */
  // Java 7 way
  public int squareIt(int i) {
    return i * i;
  }

  // Equivalent lambda
  /*
      (i) -> { return i*i; }
  */
  // If only one parameter remove (). since only one line remove {}. return keyword can only be used inside {}.
  // if using {} & want to return you have to use return keyword
  /*
       i -> i*i;
  */
  /** ----------------------------- */
  // Java 7 way
  public int getLength(String s) {
    return s.length();
  }
  // Equivalent lambda
  /*
  s -> s.length();
   */
  public static void main(String[] args) {
    printName();
  }
}
