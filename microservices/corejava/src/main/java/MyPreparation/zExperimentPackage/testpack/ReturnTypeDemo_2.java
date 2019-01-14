package MyPreparation.zExperimentPackage.testpack;

public class ReturnTypeDemo_2 {

  ReturnTypeDemo_1 getA() {
    return new ReturnTypeDemo_1();
  }

  public static void main(String[] args) {
    ReturnTypeDemo_2 returnTypeDemo2 = new ReturnTypeDemo_2();
//    ReturnTypeDemo_1 x = returnTypeDemo2.getA();
//    System.out.println(x);

    int i = returnTypeDemo2.getA().function1(3);
    System.out.println(i);
  }
}

/**
 * When ever we ask JVM to execute a .class file,JVM opens the .class file and searches for the
 * static elements in the .class file and then loads all the static elements of the .class file into
 * one specific memory location inside the RAM.Now JVM searches for the main() method among these
 * static elements and then starts executing it.
 *
 * <p>NOTE: The memory space reserved in the RAM for the static contents of the .class file is known
 * as context of the class
 *
 * <p>NOTE: Whenever new operator is encountered,JVM creates an object and loads all the non static
 * members of the class into that object. This is known as instance of the class.
 */
