package MyPreparation.datastructures.ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedElement {
  public static void main(String[] args) {

    int[] array1 = {1, 3, 1, 3, 2, 1};
    int[] array2 = {};
    int[] array3 = {3, 3, 1, 3, 2, 1};
    int[] array4 = {0};
    int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1};
    System.out.println(MostRepeatedElement.mostRepeated(array5));
  }

  public static Integer mostRepeated(int[] numbers) {
    Integer maxCount = 0;
    Integer mostRepeated = null;
    Map<Integer, Integer> map = new HashMap<>();

    for (int element : numbers) {
      if (map.containsKey(element)) {
        map.put(element, map.get(element) + 1);
      } else {
        map.put(element, 1);
      }

      if (map.get(element) > maxCount) {
        maxCount = map.get(element);
        mostRepeated = element;
      }
    }
    return mostRepeated;
  }
}
