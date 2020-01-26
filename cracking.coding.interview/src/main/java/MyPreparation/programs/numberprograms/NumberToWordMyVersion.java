package MyPreparation.programs.numberprograms;

import java.util.Scanner;

public class NumberToWordMyVersion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      // nextInt() can accept an integer of max length 10. So if you enter a number with more than
      // 10 digits it will throw error
      System.out.println(NumberToWordMyVersion.convert(sc.nextInt()));
    } catch (Exception e) {
      System.out.println("Please Enter a valid number");
    } finally {
      sc.close();
    }
  }

  public static String convert(int number) {

    String word = "";

    String[] unitsArray = {
      "zero",
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine",
      "ten",
      "eleven",
      "twelve",
      "thirteen",
      "fourteen",
      "fifteen",
      "sixteen",
      "seventeen",
      "eighteen",
      "nineteen"
    };
    String[] tensArray = {
      "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    if (number == 0) {
      return "zero";
    }

    if (number < 0) {

      String str = "" + number;
      str = str.substring(1);
      System.out.println(str);
      return "minus " + convert(Integer.parseInt(str));
    }

    if ((number / 1000) > 0) {
      word += convert(number / 1000) + " thousand ";
      number %= 1000;
    }

    if ((number / 100) > 0) {
      word += convert(number / 100) + " hundred ";
      number %= 100;
    }

    if (number > 0) {
      if (number < 20) {
        word += unitsArray[number];
      } else {
        word += tensArray[number / 10];
        if ((number % 10) > 0) {
          word += "-" + unitsArray[number % 10];
        }
      }
    }

    return word;
  }
}
