package MyPreparation.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionEx {
  public static void main(String[] args) {}

  public void test2()
      throws IOException { // This method should throw either the same exception or the Supertype
    test1();
  }

  public void test1() throws FileNotFoundException {}
}
