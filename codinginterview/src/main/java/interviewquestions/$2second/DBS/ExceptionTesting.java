package interviewquestions.$2second.DBS;

public class ExceptionTesting {

  public static void main(String[] args) {
    try {
      // Uncomment this line to see the error. The concept here is
      // since Exception includes both checked and Runtime Exception, we need to th
      // throw new Exp1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class Exp0 extends Exception {}

class Exp1 extends Exp0 {}
