package MyPreparation.threadprograms.ExecutorServiceDemo;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * The use of Callable interface is the drawback of Runnable interface. If you want a return value
 * from your task using Runnable interface, it is impossible. Because runnable has only one method
 * run(), which is a void type. So to address this Callable is there.
 */
public class CallableExample {

  public static void main(String[] args) throws ExecutionException, InterruptedException {

    ExecutorService service = Executors.newFixedThreadPool(10);
    // Submit the tasks for execution
    Future<Integer> future = service.submit(new Task1());
    // Do some operation. As the name suggests above: Future that means you are going to get the
    // response in future

    Integer integer = future.get();
    System.out.println(integer);
  }
}

class Task1 implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    Thread.sleep(3000);
    return new Random().nextInt();
  }
}
