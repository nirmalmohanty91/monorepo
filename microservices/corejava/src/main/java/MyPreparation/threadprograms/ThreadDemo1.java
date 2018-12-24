package MyPreparation.threadprograms;

// Two threads accessing two methods in parallel
public class ThreadDemo1 {
  public static void main(String[] args) {

    System.out.println(
        "Name: "
            + Thread.currentThread().getName()
            + " Priority: "
            + Thread.currentThread().getPriority()
            + " Id: "
            + Thread.currentThread().getId());
    Thread1 thread1 = new Thread1();
    thread1.setName("Batman");
    thread1.start();

    Thread2 thread2 = new Thread2();
    thread2.setName("Superman");
    thread2.start();
  }
}

class Thread1 extends Thread {
  public void run() {
    for (int i = 0; i <= 5; i++) {
      System.out.println(
          "Name: "
              + Thread.currentThread().getName()
              + " Priority: "
              + Thread.currentThread().getPriority()
              + " Id: "
              + Thread.currentThread().getId());
      System.out.println("Hi");

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class Thread2 extends Thread {
  public void run() {

    for (int i = 0; i <= 5; i++) {
      System.out.println(
          "Name: "
              + Thread.currentThread().getName()
              + " Priority: "
              + Thread.currentThread().getPriority()
              + " Id: "
              + Thread.currentThread().getId());
      System.out.println("Hello");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
