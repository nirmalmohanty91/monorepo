package interviewquestions.$2second.uhg;

import utils.Utility;

public class StringSplit {
  public static void main(String[] args) {
    String s = " s, y,?";
    String[] s1 = s.split(",");
   // String[] s2 = s.split();
    Utility.printArray(s1);
  }
}
