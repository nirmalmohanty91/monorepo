package interviewquestions.gap;

public class RemoveDuplicateAndPrintSecondHighest {
  public static void main(String[] args) {
    int[] a = {12, 4, 90, 4, 69, 90, 69, 90};

    removeDuplAndPrintSecondHighest(a);
  }

  public static void removeDuplAndPrintSecondHighest(int[] a) {

    int fm = Integer.MIN_VALUE;
    int sm = Integer.MIN_VALUE;

    for (int i = 0; i < a.length; i++) {
      int j;
      for (j = 0; j < i; j++) {
        if (a[i] == a[j]) {
          break;
        }
      }

      if (i == j) {

        if (a[i] > fm) {
          sm = fm;
          fm = a[i];
        } else if (a[i] > sm) {
          sm = a[i];
        }

        System.out.println(a[i]);
      }
    }

    System.out.println(sm);
  }
}
