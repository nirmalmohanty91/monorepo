package MyPreparation.threadprograms.programs;

import java.util.stream.IntStream;

// Thread Implementation using Runnable interface
public class ThreadDemo3 implements Runnable {

  @Override
  public void run() {
    IntStream.range(1, 6)
        .forEach(
            n -> {
              System.out.println(Thread.currentThread().getName() + ": " + n);
              try {
                Thread.sleep(500);
              } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
            });
  }

  public static void main(String[] args) {
    System.out.println(Thread.currentThread());
    Runnable r1 = new ThreadDemo3();
    Runnable r2 = new ThreadDemo3();
    Thread t1 = new Thread(r1);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();
  }
}
