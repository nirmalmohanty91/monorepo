package interviewquestions.$2second.DBS;

public class PostAndPreIncrement {
  public static void main(String[] args) {

    PostAndPreIncrement.test2();
  }

  public static void test1() {
    int x = 0;
    int y = 0;

    for (int z = 0; z < 5; z++) {
      if ((z > ++x) && (z > ++y)) {
        x++;
        System.out.print(x + " " + y);
      }
    }
    System.out.print("\n" + x + " " + y);
  }

  public static void test2() {
    int a = 0;
    int b = 0;

    //    a++;
    //    int c = a;
    //    System.out.println(c);
    //    ++a;
    //    int d = a;
    //    System.out.println(d);
    /** Should be careful with post & pre increment when using it with assignment operator */
    System.out.println("--------");
    // Post Increment: 1st assign & then Increment
    int e = a++;
    System.out.println("a: " + e);

    // Pre Increment: 1st increment & then assign
    int f = ++a;
    System.out.println("a: " + f);
  }
}
