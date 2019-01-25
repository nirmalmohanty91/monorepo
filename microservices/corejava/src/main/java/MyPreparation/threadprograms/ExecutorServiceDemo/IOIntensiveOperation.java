package MyPreparation.threadprograms.ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * If you task is io intensive: database call, n/w call, http call, the thread will wait until they
 * get the response from the client and probably they will go to the waiting state until they get
 * the response. In this case it is good idea to have more threads in a pool.
 */
public class IOIntensiveOperation {
  public static void main(String[] args) {
    ExecutorService service = Executors.newFixedThreadPool(100);

    // Submit the tasks for execution
    for (int i = 0; i < 100; i++) {
      service.execute(new IoOperation());
    }
    service.shutdown();
  }
}

class IoOperation implements Runnable {

  @Override
  public void run() {
    System.out.println("IO Operation");
  }
}
