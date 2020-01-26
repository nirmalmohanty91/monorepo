package MyPreparation.programs;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SpellCheckProgram {

  public static void main(String[] args) throws IOException {

    HashSet<String> set = new HashSet<>();
    set.add("My");
    set.add("Name");
    set.add("is");
    set.add("Nirmal");
    set.add("hello");

    Set<String> dictionary = set.stream().map(String::toLowerCase).collect(Collectors.toSet());

    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();

    String[] input = s1.split(" ");
    boolean isCorrect = false;
    for (String s2 : input) {
      isCorrect = dictionary.contains(s2.toLowerCase()) ? true : false;
    }
    if (isCorrect) {
      System.out.println("Spelled Correctly");

    } else {
      System.out.println("Wrong!!");
    }
  }
}
