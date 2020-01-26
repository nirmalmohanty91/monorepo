package MyPreparation.ThreadInJava.programs;

import java.util.stream.IntStream;

// Implementing threading using lambda
public class ThreadUsingLambda {
  public static void main(String[] args) {
    // Lambda Runnable
    Runnable task1 =
        () ->
            IntStream.range(1, 6)
                .forEach(
                    n -> {
                      System.out.println(Thread.currentThread().getName() + ": " + n);
                    });
    // Starting a thread
    new Thread(task1).start();
  }
}
