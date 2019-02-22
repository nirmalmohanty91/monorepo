package interviewquestions.$2second.Jpmc;

public class DriverClass {
  public static void main(String[] args) {
    A a = new B();
    // Notice that here you can not access the method m2()
    a.m1();

    D d = new E();
    d.m1();
  }
}
