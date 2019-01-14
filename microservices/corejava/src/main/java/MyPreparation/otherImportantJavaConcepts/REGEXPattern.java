package MyPreparation.otherImportantJavaConcepts;

import utils.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGEXPattern {

  public static void main(String[] args) {
    String sentence1 = "Nirmal Batman Spiderman Venom";

    String[] s = sentence1.split(" ");
    Utility.printArray(s);
    String sentence2 = "Nirmal   Batman    Spiderman     Venom";
    // The below code will not work if we try to split it by space in sentence2(Have multiple spaces
    // in between)
    System.out.print("Without Regex: ");
    String[] s1 = sentence2.split(" ");
    Utility.printArray(s1);

    System.out.print("Using Regex: ");
    String[] s2 = sentence2.split("\\s+");
    Utility.printArray(s2);

    String sentence3 = "Nirmal.Batman.Spiderman.Venom";
    System.out.print("Didn't work without regex: ");
    String[] s3 = sentence3.split(".");
    Utility.printArray(s3);
    System.out.print("With regex: ");
    String[] s4 = sentence3.split("\\.");
    Utility.printArray(s4);

    String sentence4 = "Nirmal1Batman2Spiderman3Venom";
    System.out.println("Printing all the numbers in a string using regex: "+sentence4.replaceAll("\\D", ""));
    System.out.println("Another way: "+sentence4.replaceAll("[^0-9]+", ""));
    System.out.println("Remove all the numbers from string: "+ sentence4.replaceAll("[^a-zA-Z]+", ""));
    //Check if string contains only numbers
    String numbers = "123456";
    String regex = "[0-9]+";
    System.out.println("Check if the string has only numbers: "+numbers.matches(regex));
    //Check if string contains only alphabets
    String numbers1 = "abcAZ";
    String regex1 = "[a-zA-Z]+";
    System.out.println("Check if the string has only alphabets: "+numbers1.matches(regex1));
    //Check if the String has special characters
    String special = "1234444@hgsd!~";
    String regex3 = "[a-zA-Z_0-9]";// same as \\w
    System.out.println("Type all non-word chars in a string: "+special.replaceAll("\\w",""));
    System.out.println("Type all word chars in a string: "+special.replaceAll("[^\\w]",""));
    System.out.println("Type all word chars in a string: "+special.replaceAll("\\W",""));
    //Check if string has special chars
    //Pattern p = Pattern.compile("[^A-Za-z0-9]");
    Pattern p = Pattern.compile("\\W");
    Matcher m = p.matcher(numbers);
    System.out.println("Checking if any non-word char is present: "+m.find());
    System.out.println("In one line: "+Pattern.compile("\\W").matcher(special ).find());

  }
}
