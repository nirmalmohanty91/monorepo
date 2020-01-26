package MyPreparation.programs.controlstatements;

import java.util.Scanner;
/**
 * The default keyword should be used in a switch statement if you want to run some code when none
 * of the case values match the conditional value. The default block can be located anywhere in the
 * switch block, so if no case matches, the default block will be entered, and if the default does
 * not contain a break, then code will continue to execute (fall-through) to the end of the switch
 * or until the break statement is encountered.
 */
public class SwitchStatement {
  public static void main(String[] args) {
    long l = 50;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number:");
    int c = sc.nextInt();
    // The only allowed types are char, byte, short, int, Character, Byte, Short, Integer, String or
    // and Enum
    switch (c) {
      case 1:
        System.out.println("In 1st case statement");
        break;
      default:
        System.out.println("Printing default");
        break;
      case 2:
        System.out.println("In 2nd case statement");
        break;
    }
  }
}
