package MyPreparation.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 * New Features in Java 7: More readable code and easy to write. Automatic resource management.
 * Number of lines of code is reduced. No need of finally block just to close the resources. We can
 * open multiple resources in try-with-resources statement separated by a semicolon. When multiple
 * resources are opened in try-with-resources, it closes them in the reverse order to avoid any
 * dependency issue. You can extend my resource program to prove that.
 */
public class TryWithResource {
  public static void main(String[] args) {

    try (BufferedReader br = new BufferedReader(new FileReader("nm.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("nm1.txt"))) {
      System.out.println(br.readLine());
      System.out.println(br1.readLine());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
