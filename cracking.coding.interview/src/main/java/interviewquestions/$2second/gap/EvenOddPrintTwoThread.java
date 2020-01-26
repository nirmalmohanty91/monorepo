package interviewquestions.$2second.gap;

public class EvenOddPrintTwoThread {
  public static void main(String[] args) {
    
    Thread t1 = new Thread(new MyRunnable(), "T1");
    Thread t2 = new Thread(new MyRunnable(), "T2");
    t1.start();
    t2.start();
  }
}

class MyRunnable implements Runnable {

  @Override
  public void run() {

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0 && Thread.currentThread().getName().equalsIgnoreCase("T1")) {
        System.out.println(Thread.currentThread().getName() + ":" + i);
      } else if (i % 2 != 0 && Thread.currentThread().getName().equalsIgnoreCase("T2")) {
        System.out.println(Thread.currentThread().getName() + ":" + i);
      }
    }
  }
}
