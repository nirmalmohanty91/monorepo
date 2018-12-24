package MyPreparation.Java8concepts;
@FunctionalInterface
public interface $3LambdaExpWithFI1 {
  public void m1();
}
// Java 7 way. This is not at all required if you use Lambda Expression
/*
class Demo implements $3LambdaExpWithFI {

  @Override
  public void m1() {
    System.out.println("Hi Guys!!");
  }
  // Equivalent Lambda for above method
  //() -> System.out.println("Welcome to lambda world!");

}
*/
class Test {

  public static void main(String[] args) {
    // Java 7 way
    /*
    Demo demo = new Demo();
    demo.m1();
    */
    //Java 8 way
    $3LambdaExpWithFI1 functionalInterface = () -> System.out.println("Welcome to lambda world!");
    functionalInterface.m1();
  }
}
