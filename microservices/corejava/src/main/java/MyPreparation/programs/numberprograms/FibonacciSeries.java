package MyPreparation.programs.numberprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeries {

  public static void main(String[] args) throws NumberFormatException, IOException {
    int f1 = 0;
    int f2 = 1;
    int f = f1 + f2;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // Scanner sc=new Scanner(System.in);

    System.out.println("Enter the no. of fibonacci numbers:");
    int n = Integer.parseInt(br.readLine());
    int count = 3;
    System.out.println(f1);
    System.out.println(f2);
    while (count <= n) {

      f = f1 + f2;
      System.out.println(f);
      f1 = f2;
      f2 = f;
      count++;
    }
  }
}
