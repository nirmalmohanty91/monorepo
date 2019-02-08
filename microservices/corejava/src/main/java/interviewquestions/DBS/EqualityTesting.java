package interviewquestions.DBS;

public class EqualityTesting {
  public static void main(String[] args) {

    boolean i = false;
    boolean j = false;
    boolean k = i == j;
    boolean l = true;
    boolean m = i == l;
    System.out.println(k);
    System.out.println(m);
  }
}
