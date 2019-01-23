package MyPreparation.InheritanceAndPolym.Polymorphism.MethodOverloading;
/** 1. MethodOverloading is also know as Static-Polymorphism/static binding/Early Binding
 *  2. Compiler checks method signature for duplicate methods for method overloading.
 *     method signature consist of three things, 1) Method Name   2) Number Of Arguments   3) Types of arguments.
 *  3. ‘+’ is the only operator in java which is used for operator overloading
 *     Ex: Operator ‘+’ can be used to add two numbers and also can be used to concatenate two strings.
 *  */

public class MethodOverloading {

  public int getNumber(Integer i) {
    return i;
  }

  public int getNumber(int i) {
    return i;
  }

  // Compilation error because return type has no effect on method overloading
  /**
    public String getNumber(Integer i){
      return Integer.toString(i);
    }
   */

  public String getString(int i, String s){
      return "";
  }

  public String getString(String s, int i){
      return "";
  }

  public static int add(int a, int b){
    return a+b;
  }

  public static int add(int a, int b, int c){
    return a+b+c;
  }


}
