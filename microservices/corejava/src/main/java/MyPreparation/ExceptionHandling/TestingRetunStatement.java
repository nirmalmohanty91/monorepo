package MyPreparation.ExceptionHandling;

public class TestingRetunStatement {

  public static void main(String[] args) {
    System.out.println(getValue());
  }

  public static int getValue() {
    try {
      int i = 1 / 0;
      return 1;
    } catch (ArithmeticException e) {
      return 2;

    } finally {
      System.exit(0);
      return 3;
    }
  }
}
