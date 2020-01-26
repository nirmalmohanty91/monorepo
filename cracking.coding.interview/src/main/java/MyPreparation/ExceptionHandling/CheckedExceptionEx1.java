package MyPreparation.ExceptionHandling;

import java.io.IOException;

/**
 * If you throw a checked exception from a catch clause, you must also declare that exception! In
 * other words, you must handle and declare, as opposed to handle or declare.
 */
public class CheckedExceptionEx1 {

  public static void main(String[] args) throws IOException {

    doStuff();
  }

  public static void doStuff() throws IOException { // we must declare the exception
    try {
      throw new IOException();
    } catch (IOException ex) {
      // can't handle it
      throw ex; // Can't throw it unless you declare it
    }
  }
}
