package MyPreparation.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InheritanceInException {

  public static void main(String[] args) throws IOException {
      doStuff();
  }

  public static void doStuff()
      throws IOException { // This method should through the same exception or its supertype
    noStuffing();
  }

  public static void noStuffing() throws FileNotFoundException {}
}
