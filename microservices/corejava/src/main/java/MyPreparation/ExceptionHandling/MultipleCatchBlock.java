package MyPreparation.ExceptionHandling;

public class MultipleCatchBlock {

  public static void main(String[] args) {

    int i = 1;
    int result = 0;

    try {
      try {
        result = 1 / 0;
      } catch (Exception e) {
        System.out.println("1: " + e.fillInStackTrace());
      }
      result = i / 0;
      try {
        result = 1 / 0;
      } catch (Exception e) {
        System.out.println("2: " + e.fillInStackTrace());
      }
    } catch (NumberFormatException e) {
      System.out.println("3: " + e.fillInStackTrace());

    } catch (ArithmeticException ae) {
      try {
        result = 1 / 0;
      } catch (Exception e) {
        System.out.println("4: " + e.fillInStackTrace());
      }
      System.out.println("5: " + ae.fillInStackTrace());
      try {
        result = 1 / 0;
      } catch (Exception e) {
        System.out.println("6: " + e.fillInStackTrace());
      }
    } catch (Exception e) {
      System.out.println("7: " + e.fillInStackTrace());

    } finally {
      System.out.println("Finally");
    }
  }
}
