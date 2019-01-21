package MyPreparation.threadprograms.ExecutorServiceDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * If your code within the run method is CPU intensive for example: code for hashing/Cryptographic
 * function, then go for this approach. In java one java_thread = one_cpu_thread. So if you have a
 * CPU of 4 cores, at a time you can have only 4 threads running. That means no matter how many
 * threads you have in your thread pool, if your cpu can run only 4 threads at a time, it will go
 * for a time split scheduling. That is it will give sometime to one thread and some time to other
 * thread and so on. In this case the ideal pool size should be equal to the number of available
 * processors in your cpu.
 */
public class CPUIntensiveTask {

  public static void main(String[] args) {

    // Get count of available cores
    int coreCount = Runtime.getRuntime().availableProcessors();
    System.out.println(coreCount);
    System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
    ExecutorService service = Executors.newFixedThreadPool(coreCount);

    // Submit the tasks for execution
    for (int i = 0; i < 100; i++) {
      service.execute(new IntensiveTask());
    }
    service.shutdown();
  }
}

class IntensiveTask implements Runnable {

  @Override
  public void run() {
    System.out.println("Hashing code");
  }
}
