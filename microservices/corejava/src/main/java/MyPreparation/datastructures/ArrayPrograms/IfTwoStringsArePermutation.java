package MyPreparation.datastructures.ArrayPrograms;

import utils.Utility;

import java.util.Arrays;

public class IfTwoStringsArePermutation {

  public static void main(String[] args) {
    String s1 = "1234";
    String s2 = "4321";
    System.out.println(ifPermutation2(s1, s2));
  }

  public static boolean ifPermutation1(String s1, String s2) {
    char[] array1 = s1.toCharArray();
    Arrays.sort(array1);
    String sortedS1 = new String(array1);

    char[] array2 = s2.toCharArray();
    Arrays.sort(array2);
    String sortedS2 = new String(array2);

    return sortedS1.equalsIgnoreCase(sortedS2);
  }

  public static boolean ifPermutation2(String s1, String s2) {
    int[] ints = new int[128];
    // we can directly use the character as an array index. It takes the ASCII values of the chars
    // automatically
    for (char c : s1.toCharArray()) {
      ints[c]++;
    }

    for (char c : s2.toCharArray()) {
      ints[c]--;
      if (ints[c] < 0) {
        return false;
      }
    }

    Utility.printArray(ints);
    return true;
  }
}
