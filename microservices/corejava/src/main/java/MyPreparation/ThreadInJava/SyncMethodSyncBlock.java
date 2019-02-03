package MyPreparation.ThreadInJava;

import java.util.Arrays;
import java.util.List;

public class SyncMethodSyncBlock {
  public static void main(String[] args) {




  }

  public synchronized void getName() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    System.out.println("Nirmal");
  }

  public void getTitle() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    synchronized (list) {
      System.out.println("Nirmal");
    }
  }
}
