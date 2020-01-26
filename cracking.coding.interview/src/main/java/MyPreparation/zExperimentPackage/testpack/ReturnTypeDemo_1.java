package MyPreparation.zExperimentPackage.testpack;

public class ReturnTypeDemo_1 {

  int i, j; // ------------>Instance variable

  int function1(int i) { // ------->call by value here "i" become local to function
    int j = 0; // ------>Here j becomes local to function1
    j = i * i;
    return (j); // Returning a value is must
  }

  public static void main(String[] args) {
    ReturnTypeDemo_1 returnType =
        new ReturnTypeDemo_1(); // -->Instance of a class which loads all the non-static members
    returnType.function1(9); // Not assigned to any variable
    int x = returnType.function1(4);
    System.out.println(x);
    System.out.println(returnType.function1(4));
    System.out.println(
        returnType.function1(4) + 4); // We can even pass expressions,not alone arguments
  }
}
/*NOTE
 * -----
 * As we can design functions to return a primitive data type, we can design functions to return object of a class
 * */
