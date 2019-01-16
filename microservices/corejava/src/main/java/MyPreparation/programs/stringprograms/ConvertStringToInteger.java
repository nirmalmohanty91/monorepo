package MyPreparation.programs.stringprograms;

public class ConvertStringToInteger {
  public static void main(String[] args) {

    // Assigns the ASCII value to integer
    int b = '3';
    System.out.println("ASCII value of 3: " + b);
    int c1 = Character.getNumericValue('5');
    System.out.println("Getting the exact value: " + c1);
    int a1 = Integer.parseInt(String.valueOf('5'));
    System.out.println("Another way to do it: "+a1);
    int asciValueOf5 = (int) '5';
    int asciValueOf0 = (int) '0';
    System.out.println("ASCII value of 5: " + asciValueOf5);
    System.out.println("ASCII value of 0: " + asciValueOf0);

    // variable a will be assigned with the difference b/w the ascii value of 5 and
    String s = "5";
    char c = s.charAt(0);
    int a = c - '0';

    System.out.println("After the subtraction:" + a);
  }
}
