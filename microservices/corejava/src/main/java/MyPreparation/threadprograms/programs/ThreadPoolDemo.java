package MyPreparation.threadprograms.programs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 1; i <= 5; i++) {
			executor.submit(new MyThread(i));
		}
		executor.shutdown();
		System.out.println("All tasks submitted");
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {

		}
		System.out.println("All tasks completed");
	}
}

class MyThread implements Runnable {
	private int id;

	public MyThread(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Starting id: " + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("Ending id: " + id);

	}

}