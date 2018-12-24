package MyPreparation.Java8concepts;
// Java does type inference with lambdas

public class TypeInferenceExample {

  public static int printLength(StringLength stringLength) {
    return stringLength.length("Hello World");
  }

  public static void main(String[] args) {
    // Option-1:
    StringLength stringLength =
        (String s) -> s.length(); // This is call type inference. Here the lambda figures out
    // Option-2:
    StringLength stringLength1 = s -> s.length();
    System.out.println(stringLength1.length("wow"));
    // Method-1:
    System.out.println(stringLength.length("Hello World"));
    // Method-2:
    System.out.println(TypeInferenceExample.printLength((String s) -> s.length()));
    System.out.println(TypeInferenceExample.printLength(s -> s.length()));
  }

  interface StringLength {
    int length(String s);
  }
}
