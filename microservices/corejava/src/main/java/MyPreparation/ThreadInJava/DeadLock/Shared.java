package MyPreparation.ThreadInJava.DeadLock;
/**
 *
 * */
public class Shared {

  synchronized void methodOne(Shared objectTwo) {
    try {
      System.out.println(
          Thread.currentThread().getName() + " is going to sleep for 2sec in methodOne");
      Thread.sleep(2000);
      System.out.println(
          "State of "
              + Thread.currentThread().getName()
              + " is "
              + Thread.currentThread().getState());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    objectTwo.methodTwo(this);
  }

  synchronized void methodTwo(Shared objectOne) {
    try {
      System.out.println(
          Thread.currentThread().getName() + " is going to sleep for 2secs in methodTwo");
      Thread.sleep(2000);
      System.out.println(
          "State of "
              + Thread.currentThread().getName()
              + " is "
              + Thread.currentThread().getState());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    objectOne.methodOne(this);
  }
}
