package MyPreparation.ThreadInJava.ExecutorServiceDemo.TypesOfThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
  public static void main(String[] args) {
    ExecutorService service = Executors.newFixedThreadPool(10);
    // Submit the tasks for execution
    for (int i = 0; i < 100; i++) {
      service.execute(new Task());
    }
    service.shutdown();
  }
}
