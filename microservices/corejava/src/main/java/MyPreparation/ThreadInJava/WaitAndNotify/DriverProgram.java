package MyPreparation.ThreadInJava.WaitAndNotify;

public class DriverProgram {
  public static void main(String[] args) {

    final Shared s = new Shared();

    Thread t1 = new Thread(() -> s.methodOne(), "Thread-1");
    Thread t2 = new Thread(() -> s.methodTwo(), "Thread-2");

    t1.start();
    t2.start();
  }
}
