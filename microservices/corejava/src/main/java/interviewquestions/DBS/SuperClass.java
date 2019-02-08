package interviewquestions.DBS;

public class SuperClass {

  public static void main(String[] args) {
    B1 b1 = new B1(1);
    b1.printValue(2);
  }
}

class A1 {
  int i;
}

class B1 extends A1 {
  int j;

  public B1(int i) {
    this.j = i;
  }

  public void printValue(int l) {
    i = j + l;
    System.out.println(super.i + " " + j);
  }
}
