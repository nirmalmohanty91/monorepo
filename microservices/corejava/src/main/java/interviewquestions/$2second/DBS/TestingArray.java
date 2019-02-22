package interviewquestions.$2second.DBS;

public class TestingArray {

  public static void main(String[] args) {
    long[] b1 = {3, 4, 5};
    long[] b2 = getArray(b1);
    System.out.println(b1[0] + b1[1] + b1[2]);
    System.out.println(b2[0] + b2[1] + b2[2]);
  }

  public static long[] getArray(long[] b3) {
    b3[1] = 7;
    return b3;
  }
}
