package MyPreparation.ThreadInJava.programs;

import java.util.stream.IntStream;

// In-line declaration of run method. 2 threads performing a single task
public class ThreadDemo4 {
  public static void main(String[] args) throws InterruptedException {
    // Code without lambda
    Runnable taskWithoutLambda =
        new Runnable() {

          @Override
          public void run() {
            IntStream.range(1, 6)
                .forEach(n -> System.out.println(Thread.currentThread().getName() + ": " + n));
          }
        };

    // Now lets write the equivalent lambda for the above code
    Runnable taskWithLambda =
        () ->
            IntStream.range(1, 6)
                .forEach(n -> System.out.println(Thread.currentThread().getName() + ": " + n));

    Thread t1 = new Thread(taskWithoutLambda);
    t1.start();
    Thread.sleep(1000);
    Thread t2 = new Thread(taskWithoutLambda);
    t2.start();
  }
}
