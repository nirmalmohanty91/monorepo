package MyPreparation.ThreadInJava.programs;

import java.util.stream.IntStream;

// Most compact way of implementing thread with minimum code
public class ThreadDemo5 {
  public static void main(String[] args) {
    Thread t1 =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                IntStream.range(1, 6)
                    .forEach(
                        n -> {
                          System.out.println(Thread.currentThread().getName() + ": " + n);
                        });
              }
            });
    t1.start();
  }
}
