package MyPreparation.ThreadInJava.DeadLock;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadLockProgram {

  public static void main(String[] args) {

    final Shared objectOne = new Shared();
    final Shared objectTwo = new Shared();

    Thread t1 =
        new Thread(
            () -> {
              System.out.println("Call from main method by " + Thread.currentThread().getName());
              objectOne.methodOne(objectTwo);
            });

    Thread t2 =
        new Thread(
            () -> {
              System.out.println("Call from main method by " + Thread.currentThread().getName());
              objectTwo.methodTwo(objectOne);
            });
    System.out.println("Starting t1 & t2: ");
    t1.start();
    t1.setName("T1");
    t2.start();
    t2.setName("T2");

    try {
      System.out.println(Thread.currentThread().getName() + " is going to sleep for 3 seconds...");
      Thread.sleep(3000);
      System.out.println(
          "State of "
              + Thread.currentThread().getName()
              + " is "
              + Thread.currentThread().getState());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(
        Thread.currentThread().getName() + ": State of " + t1.getName() + " : " + t1.getState());
    System.out.println(
        Thread.currentThread().getName() + ": State of " + t2.getName() + " : " + t2.getState());

    // Detecting the dead locked threads
    ThreadMXBean bean = ManagementFactory.getThreadMXBean();
    long[] ids = bean.findMonitorDeadlockedThreads();
    if (ids != null) {
      ThreadInfo[] threadInfo = bean.getThreadInfo(ids);
      for (ThreadInfo threadInfo1 : threadInfo) {
        System.out.println("----------------");
        System.out.println(threadInfo1.getThreadId());
        System.out.println(threadInfo1.getThreadName());
        System.out.println(threadInfo1.getLockName());
        System.out.println(threadInfo1.getLockOwnerId());
        System.out.println(threadInfo1.getLockOwnerName());
      }
    } else {
      System.out.println("No Deadlocked Threads");
    }
  }
}
