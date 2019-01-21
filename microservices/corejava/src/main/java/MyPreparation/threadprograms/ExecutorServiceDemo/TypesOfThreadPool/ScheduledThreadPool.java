package MyPreparation.threadprograms.ExecutorServiceDemo.TypesOfThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

  public static void main(String[] args) {
    // for scheduling of tasks
    ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
    // Task to run after 10 seconds delay
    service.schedule(new Task(), 10, TimeUnit.SECONDS);

    // Task to run repeatedly in every 10 second
    service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);

    // Task to run repeatedly 10 second after previous task completes
    service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);
  }
}
