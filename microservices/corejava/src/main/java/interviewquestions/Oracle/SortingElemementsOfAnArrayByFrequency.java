package interviewquestions.Oracle;

import utils.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingElemementsOfAnArrayByFrequency {

  public static void main(String[] args) {

    int[] numbers = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
    int[] ints = {5, 5, 4, 6, 4};
    int[] ints1 ={1, 3, 7, 7, 7, 3, 2, 2, 2, 7, 3, 1, 7, 1, 6, 3, 5, 5, 4, 5, 6, 2, 1, 2, 4, 7, 3, 1, 3, 5, 4, 1, 7, 2, 6, 1, 2};
     SortingElemementsOfAnArrayByFrequency.sortByFrequency(ints1);
    //SortingElemementsOfAnArrayByFrequency.sortByFrequency();
  }

  public static void sortByFrequency(int[] number) {

//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//    while (t-- > 0) {
//
//      int n = sc.nextInt();
//      int[] number = new int[n];
//      for (int i = 0; i < n; i++) {
//        number[i] = sc.nextInt();
//      }

      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for (int i : number) {
        if (hashMap.containsKey(i)) {
          hashMap.put(i, hashMap.get(i) + 1);
        } else {
          hashMap.put(i, 1);
        }
      }
      ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(hashMap.entrySet());
      arrayList.sort((a, b) -> b.getValue().intValue() - a.getValue().intValue());
      int j = 0;
      for (Map.Entry<Integer, Integer> entry : arrayList) {
        for (int i = 0; i < entry.getValue(); i++) {
          number[j] = entry.getKey();
          j++;
        }
      }
      Arrays.stream(number).forEach(a -> System.out.print(a + " "));
    }
  //}
}
