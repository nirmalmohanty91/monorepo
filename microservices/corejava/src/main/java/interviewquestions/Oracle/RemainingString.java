package interviewquestions.Oracle;

import java.util.Scanner;

/**
 * Given a string without spaces, a character, and a count, the task is to print the string after
 * the specified character has occurred count number of times. Print “Empty string” in case of any
 * unsatisfying conditions. (Given character is not present, or present but less than given count,
 * or given count completes on last index). If given count is 0, then given character doesn’t
 * matter, just print the whole string.
 */
public class RemainingString {

  public static void main(String[] args) {

    String s = "Thisisdemostring";
    // printRemainingString(s, 'g', 1);
    //    String s1 = "geeksforgeeks";
    //    printRemainingString(s1, 'e', 2);
    printRemainingString();
  }

  // public static void printRemainingString(String s, char c, int position) {
  public static void printRemainingString() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Number of test cases:");
    int numberOfTestCases = sc.nextInt();
    while (numberOfTestCases > 0) {
      System.out.println("Input sting");
      String s = sc.next();
      System.out.println("Character to be searched");
      char c = sc.next().charAt(0);
      System.out.println("Nth repetition of the element");
      int position = sc.nextInt();
      int count = 0;
      if (position == 0) {
        System.out.println(s);
      } else {
        for (int i = 0; i < s.length(); i++) {
          if (c == s.charAt(i)) {
            count++;
          }
          if (i == s.length() - 1) {
            System.out.println("Empty string");
            break;
          } else if (count == position) {
            System.out.println(s.substring(i + 1));
            break;
          }
        }
        if (count == 0 || count < position) {
          System.out.println("Empty String");
        }
      }
      numberOfTestCases--;
    }
  }
}
