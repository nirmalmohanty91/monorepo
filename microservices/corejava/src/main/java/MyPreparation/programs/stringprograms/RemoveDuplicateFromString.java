package MyPreparation.programs.stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

  public static void main(String[] args) {
    String s = "aa bb cc";
    Set<Character> set = new LinkedHashSet<>();

    for (char c : s.replaceAll("\\s", "").toCharArray()) {
      set.add(c);
    }

    StringBuffer sb = new StringBuffer();

    for (Character c : set) {
      sb.append(c);
    }
    System.out.println(sb.toString());
  }
}
