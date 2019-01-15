package MyPreparation.threadprograms;

public class Shared {

  synchronized void methodOne(Shared s) {
    System.out.println("Inside methodOne()...");
    try {
      System.out.println(
          Thread.currentThread().getName() + ":" + Thread.currentThread().getState());
      Thread.sleep(2000);
      System.out.println(
          Thread.currentThread().getName() + ":" + Thread.currentThread().getState());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    s.methodTwo(this);
  }

  synchronized void methodTwo(Shared s) {
    System.out.println("Inside methodTwo()...");

    try {
      System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping");
      Thread.sleep(2000);
      System.out.println("Thread " + Thread.currentThread().getName() + " resumed");

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    s.methodOne(this);
  }
}
