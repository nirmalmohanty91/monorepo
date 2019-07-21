package interviewquestions.$2second.gap;

public class SystemOut {

  public static void main(String[] args) {

    /*** public final static PrintStream out = null;
     *
     *  1. System is a final class
     *  2. Like you see above out is an instance of PrintStream class which is final
     *  3. println() is defined inside PrintStream
     *  4. passing null to this will throw compile time error as it has below overloaded methods
     *      a. public void println(char x[])
     *      b. public void println(String x)
     *      c. public void println(Object x)
     *      All these methods can accept null & it creates an ambiguity when you pass it to the println
     * */
    System.out.println();
  }
}
