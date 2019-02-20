package MyPreparation.ExceptionHandling;

public class MultipleCatchBlock {

  public static void main(String[] args) {
    try {
      int i = 1 / 0;
    } catch (ArithmeticException | IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
  }
}
