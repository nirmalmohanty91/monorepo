package interviewquestions.uhg;

public class InnerClass {
  public static void main(String[] args) {



    class InnerClass1 {
      private static final int i = 7;
      Integer i1 = 8;
      InnerClass1() {
        System.out.println(i + i1);
      }
    }
  }
}
