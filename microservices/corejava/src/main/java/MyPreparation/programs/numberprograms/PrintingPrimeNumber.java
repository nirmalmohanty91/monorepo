package MyPreparation.programs.numberprograms;

public class PrintingPrimeNumber {

  public static void main(String[] args) {
    int count = 0;
    long start = System.currentTimeMillis();
    for (int i = 2; i <= 1000; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
        }
      }
      if (isPrime) {
        count++;
        System.out.print(i + " ");
      }
    }
    long end = System.currentTimeMillis();
    System.out.println("\n" + count);
    System.out.println(end - start);
  }
}
