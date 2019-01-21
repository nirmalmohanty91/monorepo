package MyPreparation.threadprograms.ExecutorServiceDemo.TypesOfThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/** When the requirement is task 1 completes before moving to task 2 */
public class SingleThreadedExecutor {
  public static void main(String[] args) {
    ExecutorService service = Executors.newFixedThreadPool(1);
    // Submit the tasks for execution
    for (int i = 0; i < 100; i++) {
      service.execute(new Task());
    }
    service.shutdown();
  }
}
