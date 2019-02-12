package MyPreparation.ThreadInJava.SynchronizedList;

public class DriverClass {

  public static void main(String[] args) {
    SynchronizedListOperations slo = new SynchronizedListOperations();
    /** Java 7 way */
    Thread t1 = new Thread(new RunnableImpl());
    t1.setName("Java7-1");
    //t1.start();

    Thread t2 = new Thread(new RunnableImpl());
    t2.setName("Java7-2");
    //t2.start();

    /** Java 8 way */
    Thread t3 = new Thread(() -> slo.printList());
    t3.setName("Java8-1");
    t3.start();

    Thread t4 = new Thread(() -> slo.printList());
    t4.setName("Java8-2");
    t4.start();
  }
}
