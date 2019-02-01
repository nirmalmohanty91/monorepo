package interviewquestions.Oracle;

import java.util.Scanner;

import static java.lang.Long.max;
import static java.lang.Long.min;

public class MinimumTime {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long scan1, scan2, docs, minTime = Long.MAX_VALUE;
    int t = sc.nextInt();
    while (t-- > 0) {
      scan1 = sc.nextLong();
      scan2 = sc.nextLong();
      docs = sc.nextLong();

      // Checking which printer takes minimum time if all the documents passed to each of them
      long tmpMin = min(scan1 * docs, scan2 * docs);
      // This loop is to check which combination takes less time for (docs-1)
      for (int i = 1; i < docs; i++) {
        // Checking the max time that printer would take for different combinations(for 4 docs the
        // combination would be (1,3),(2,2),(3,1))
        long temp = max(scan1 * i, scan2 * (docs - i));
        long tmp = min(temp, minTime);
        minTime = tmp;
      }
      // now take the min time
      long tempMin = min(tmpMin, minTime);
      minTime = tempMin;

      System.out.println(minTime);
      minTime = Long.MAX_VALUE;
    }
  }
}
