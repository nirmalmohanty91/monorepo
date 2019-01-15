package MyPreparation.threadprograms;

import java.util.Arrays;
/**
 * 1. wait(): Thread goes into WAITING state after releasing the lock it holds.
 * 2. sleep(): Thread goes into TIMED_WAITING state without releasing the lock it holds.
 * 3. A thread which is in WAITING state can be woken up by other threads by calling notify() or notifyAll()
 *    methods on the same lock.
 * 4. But, a thread which is in TIMED_WAITING state can not be woken up.  If any threads interrupt sleeping thread,
 *    InterruptedException will be raised.
 * 5. wait() method along with notify() and notifyAll() are used for inter thread communication where as sleep()
 *    method is used to pause the execution of current thread for specific period of time.
 * 6. notify(), notifyAll(), wait() are in Object class. Where are sleep() is in Thread class.
 * 7. wait() method along with notify() and notifyAll() are used for inter thread communication where as
 *    sleep() method is used to pause the execution of current thread for specific period of time.
 * 8. wait() method is called on objects. Whenever it is called by a thread on a particular object,
 *    thread releases the lock of that object and waits until other threads call either notify() or notifyAll()
 *    methods on the same object. Where as sleep() method is called on threads.
 * 9. To call wait() method, calling thread must hold the lock of the object on which it is calling wait() method.
 *    That means, wait() method must be called within the synchronized block. Where as to call sleep() method,
 *    thread need not to hold the object lock. That means, sleep() method can be called outside the synchronized block also.
 */
public class ThreadFunctions {

  public static void main(String[] args) {
    Thread.State[] states = Thread.State.values();
    Arrays.stream(states).forEach(x -> System.out.println(x));
    System.out.println("Creating thread:");
    Thread t = new Thread();
    System.out.println("Current state after thread created & before started: " + t.getState());
    t.start();
    System.out.println("Status after thread starts: " + t.getState());

    final Shared s1 = new Shared();
    final Shared s2 = new Shared();

    Thread t1 =
        new Thread() {
          @Override
          public void run() {
            System.out.println("Call from main method:");
            s1.methodOne(s2);
          }
        };

    Thread t2 =
        new Thread() {
          @Override
          public void run() {
            System.out.println("Call from main method: ");
            s2.methodTwo(s1);
          }
        };
    System.out.println("Starting t1 & t2: ");
    t1.start();
    t2.start();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("State of t1: " + t.getState());
    System.out.println("State of t2: " + t2.getState());

  }
}
