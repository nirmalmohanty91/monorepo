package MyPreparation.Java8concepts;

@FunctionalInterface
public interface $3LambdaExpWithFI2 {

  int add(int a, int b);
}
// Java 7 way
/*
class Add implements $3LambdaExpWithFI2 {

  @Override
  public int add(int a, int b) {
    return a + b;
  }

  //Equivalent LE for above method
  // (a,b) -> a+b;
}
*/
class Test1 {
  public static void main(String[] args) {
    // Java 7 way
    /*
    $3LambdaExpWithFI2 functionalInterface = new Add();
    System.out.println(functionalInterface.add(3, 5));
    */
    //Java 8 way
    $3LambdaExpWithFI2 functionalInterface = (a, b) -> a + b;
    System.out.println(functionalInterface.add(4, 7));
  }
}
