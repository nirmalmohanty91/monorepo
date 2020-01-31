package MyPreparation.numberprograms;

import java.util.ArrayList;

public class PrintingPrimeNumber4 {

  public static void main(String[] args) {
    int count = 0;
    ArrayList<Integer> primeList = new ArrayList<>(); // version 3
    long start = System.currentTimeMillis();
    for (int i = 2; i <= 1000; i++) {
      boolean isPrime = true;
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          isPrime = false;
          break; // version 2
        }
      }
      if (isPrime) {
        count++;
        primeList.add(i); // version 3
      }
    }

    System.out.println(primeList);
    long end = System.currentTimeMillis();
    System.out.println(count);
    System.out.println(end - start);
  }
}
