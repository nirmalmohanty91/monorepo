package MyPreparation.Java8.Java8Features;

public class $8Java8MethodRef {

  public static void m1() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child thread");
    }
  }
  // run() is refering to this method when we use :: operator. it works for both public/private
  // access modifier
  public void m2() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child thread for method ref");
    }
  }



  public static void main(String[] args) {
    // :: -> This is called method reference/constructor reference
    // This type of call (ClassName::MethodName) only works for static method
    Runnable r = $8Java8MethodRef::m1;
    // For non static method we use object reference like below
    $8Java8MethodRef objectRef = new $8Java8MethodRef();
    Runnable r1 = objectRef::m2;

    Thread t = new Thread(r);
    t.start();

    Thread t1 = new Thread(r1);
    t1.start();
    // After t.start 2 thread are available Main & the other
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread");
    }
  }
}
