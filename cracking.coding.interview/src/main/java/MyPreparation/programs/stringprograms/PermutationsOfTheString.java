package MyPreparation.programs.stringprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PermutationsOfTheString {

  public List<String> permute(char[] input) {
    // Creating a dictionary for for integers
    Map<Character, Integer> countMap = new TreeMap<>();
    for (char ch : input) {
      if (countMap.containsKey(ch)) {
        countMap.put(ch, countMap.get(ch) + 1);
      } else {
        countMap.put(ch, 1);
      }
    }
    System.out.println(countMap);

    char str[] = new char[countMap.size()];
    int count[] = new int[countMap.size()];
    // Loading Arrays from map
    int index = 0;
    for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
      str[index] = entry.getKey();
      count[index] = entry.getValue();
      index++;
    }

    List<String> resultList = new ArrayList<>();
    char[] result = new char[input.length];
    permuteUtil(str, count, result, 0, resultList);

    return resultList;
  }

  public void permuteUtil(
      char str[], int count[], char result[], int level, List<String> resultList) {
    if (level == result.length) {
      resultList.add(new String(result));
      return;
    }

    for (int i = 0; i < str.length; i++) {
      if (count[i] == 0) {
        continue;
      }
      result[level] = str[i];
      count[i]--;
      permuteUtil(str, count, result, level + 1, resultList);
      count[i]++;
    }
  }

  private void printArray(char input[]) {
    for (char ch : input) {
      System.out.print(ch);
    }
    System.out.println();
  }

  public static void main(String args[]) {
    PermutationsOfTheString sp = new PermutationsOfTheString();

    sp.permute("SDFD".toCharArray()).forEach(s -> System.out.println(s));
  }
}
