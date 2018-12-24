package MyPreparation.Java8concepts;
// Java 7 way
/*
class MyRunnable implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child Thread: "+i);
    }
  }
}
*/
public class $4LEMultithreading {

  public static void main(String[] args) {

    // Java 7 Way
    /*
    MyRunnable myRunnable = new MyRunnable();
    */

    Runnable myRunnable =
        () -> {
          for (int i = 0; i < 10; i++) {
            System.out.println("Child Thread: " + i);
          }
        };
    Thread t1 = new Thread(myRunnable);
    t1.start();

    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread: " + i);
    }
  }
}
