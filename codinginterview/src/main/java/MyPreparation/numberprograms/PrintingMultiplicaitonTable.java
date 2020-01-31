package MyPreparation.numberprograms;

import java.util.Scanner;

public class PrintingMultiplicaitonTable {

  public static void main(String[] args) {

    System.out.println("Please Enter which muliplication table you want: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(number + "*" + i + "=" + (i * number));
    }
  }
}
