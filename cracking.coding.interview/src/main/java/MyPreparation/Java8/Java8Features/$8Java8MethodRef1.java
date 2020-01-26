package MyPreparation.Java8.Java8Features;

// If the implementation is already available somewhere in your code base whose method signature is
// matching with your lambda interface method you can directly use method reference instead of
// declaring lambda implementation for that

interface Sum {
  int sum(int a, int b);
}

public class $8Java8MethodRef1 {
  // Functional interface sum method is pointing this method
  public static int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    Sum s = (a, b) -> a + b;
    Sum s1 = $8Java8MethodRef1::sum;

    System.out.println(s.sum(7, 6));
    System.out.println(s1.sum(78, 4));
  }
}
