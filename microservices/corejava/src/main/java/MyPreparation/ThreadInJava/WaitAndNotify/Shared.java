package MyPreparation.ThreadInJava.WaitAndNotify;
/** */
public class Shared {

  synchronized void methodOne() {
    System.out.println(
        Thread.currentThread().getName() + " is releasing the lock and going to wait");
    try {
      wait(); // releases the lock of this object and waits
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(
        Thread.currentThread().getName()
            + " got the object lock back and can continue with it's execution");
  }

  synchronized void methodTwo() {
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    // wakes up one thread randomly which is waiting for lock of this object
    notify();
    System.out.println(
        "A thread which is waiting for lock of this object is notified by "
            + Thread.currentThread().getName());
  }
}
