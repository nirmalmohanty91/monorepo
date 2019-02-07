package interviewquestions.DBS;

import java.util.HashSet;
import java.util.Set;

public class SmallesSubarray {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    int n = arr.length;
    int k = 3;
    minRange(arr, n, k);
  }

  // Prints the minimum range
  // that contains exactly k
  // distinct numbers.
  static void minRange(int arr[], int n, int k) {
    int l = 0, r = n;

    // Consider every element
    // as starting point.
    for (int i = 0; i < n; i++) {

      // Find the smallest window
      // starting with arr[i] and
      // containing exactly k
      // distinct elements.
      Set<Integer> s = new HashSet<Integer>();
      int j;
      for (j = i; j < n; j++) {
        s.add(arr[j]);
        if (s.size() == k) {
          if ((j - i) < (r - l)) {
            r = j;
            l = i;
          }
          break;
        }
      }

      // There are less than k
      // distinct elements now,
      // so no need to continue.
      if (j == n) break;
    }

    // If there was no window
    // with k distinct elements
    // (k is greater than total
    // distinct elements)
    if (l == 0 && r == n) System.out.println("Invalid k");
    else System.out.println(l + " " + r);
  }
}
