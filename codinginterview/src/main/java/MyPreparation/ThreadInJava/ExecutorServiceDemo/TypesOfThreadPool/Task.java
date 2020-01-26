package MyPreparation.ThreadInJava.ExecutorServiceDemo.TypesOfThreadPool;

class Task implements Runnable {

  @Override
  public void run() {
    System.out.println("Task Running..");
  }
}
