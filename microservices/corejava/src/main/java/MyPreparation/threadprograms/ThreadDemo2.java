package MyPreparation.threadprograms;

import java.util.stream.IntStream;

// Accessing one method by two threads
public class ThreadDemo2 extends Thread {

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

  public static void main(String args[]) {
    ThreadDemo2 t1 = new ThreadDemo2();
    ThreadDemo2 t2 = new ThreadDemo2();
    System.out.println("Name of t1:" + t1.getName());
    System.out.println("Name of t2:" + t2.getName());

    t1.start();
    t2.start();

  }



}
