package MyPreparation.programs.numberprograms;

import java.util.ArrayList;

public class PrintingPrimeNumber3 {

  public static void main(String[] args) {
    ArrayList<Integer> primeList = new ArrayList<>(); // version 3
    long start = System.currentTimeMillis();
    for (int i = 2; i <= 1000; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break; // version 2
        }
      }
      if (isPrime) primeList.add(i); // version 3
    }

    System.out.println(primeList);
    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
}
