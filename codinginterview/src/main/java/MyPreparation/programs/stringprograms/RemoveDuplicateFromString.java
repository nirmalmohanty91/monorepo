package MyPreparation.programs.stringprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

  public static void main(String[] args) {
    String s = "aa bb cc";
    String s1 = "abaa  Tit for tat";
    RemoveDuplicateFromString.removeDuplicate4(s1);
  }

  public static void removeDuplicate1(String s) {
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

  public static void removeDuplicate2(String s) {
    char[] c = s.replaceAll("\\s", "").toCharArray();
    String result = "";
    for (int i = 0; i < c.length; i++) {
      if (!result.contains(String.valueOf(c[i]))) {
        result = result + String.valueOf(c[i]);
      }
    }
    System.out.println(result);
  }

  public static void removeDuplicate3(String s) {
    Set<Character> dup = new LinkedHashSet<>();
    Set<Character> nonDup = new LinkedHashSet<>();
    for (char c : s.replaceAll("\\s", "").toLowerCase().toCharArray()) {
      if (nonDup.contains(c)) {
        dup.add(c);
      } else {
        nonDup.add(c);
      }
    }
    System.out.println(dup + "\n" + nonDup);
    String s2 = "";
    for (char c : nonDup) {
      s2 += c;
    }
    System.out.println(s2);
  }

  public static void removeDuplicate4(String s) {
    String s2 = s.replaceAll("\\s", "").toLowerCase();
    String result = "";
    for (int i = 0; i < s2.length(); i++) {
      if (!result.contains(String.valueOf(s2.charAt(i)))) {
        result += String.valueOf(s2.charAt(i));
      }
    }
    System.out.println(result);
  }

  public static String removeDuplicate5(String s) {
    String[] s1 = s.replaceAll("\\s", "").toLowerCase().split("");
    HashSet<String> set = new HashSet<>(Arrays.asList(s1));
    return set.toString();
  }
}
