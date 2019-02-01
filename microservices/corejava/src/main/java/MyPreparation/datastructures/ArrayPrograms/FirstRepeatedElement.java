package MyPreparation.datastructures.ArrayPrograms;

public class FirstRepeatedElement {

  public static void main(String[] args) {

    //int[] a = {1, 5, 3, 4, 3, 5, 6};
      int[] a = {1, 5, 3, 4, 6};
    FirstRepeatedElement.findFistRepeatingElement(a);
  }

  public static void findFistRepeatingElement(int[] a) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          count++;
          break;
        }
      }

      if (count > 0) {
        System.out.println(i + 1);
        break;
      }
    }
    if (count == 0) {
      System.out.println(-1);
    }
  }
}
