package MyPreparation.programs.numberprograms;

public class PrintingPrimeNumber2 {

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    for (int i = 2; i <= 1000; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break; // version 2
        }
      }
      if (isPrime) System.out.print(i + " ");
    }
    long end = System.currentTimeMillis();
    System.out.println();
    System.out.println(end - start);
  }
}
