package MyPreparation.ThreadInJava.programs;

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
    MyThread1 myThread1 = new MyThread1();
    myThread1.setName("Batman");
    myThread1.start();

    MyThread2 thread2 = new MyThread2();
    thread2.setName("Superman");
    thread2.start();
  }
}

class MyThread1 extends Thread {
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

class MyThread2 extends Thread {
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
