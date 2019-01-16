package MyPreparation.programs.numberprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYean {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter value:");
    int y = Integer.parseInt(br.readLine());
    if ((y % 100 == 0 && y % 400 == 0) || (y % 100 != 0 && y % 4 == 0)) {
      System.out.println("This is leap year");
    } else System.out.println("NOT a leap year...");
  }
}
