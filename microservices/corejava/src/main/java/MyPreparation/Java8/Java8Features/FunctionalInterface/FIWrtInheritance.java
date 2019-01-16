package MyPreparation.Java8.Java8Features.FunctionalInterface;

@FunctionalInterface
public interface FIWrtInheritance {

  public void m1();
  //public void m4(int a);
  public boolean equals(Object obj);

  default void m2() {
    System.out.println("Hello");
  }

  public static void m3() {}
}

// You can't have two public interface/class in one file
// This is a valid Functional interface because the abstract method from parent is automatically
// available to child
@FunctionalInterface
interface child1 extends FIWrtInheritance {}

// This is also a valid example of FI because here you are overriding the method from
// parent(FIWrtInheritance)
@FunctionalInterface
interface child2 extends FIWrtInheritance {
  public void m1(); // valid because method signature is same
  // public void m2(); --> this is invalid because this is a new AM which is making 2 AMs in child
}

//This is perfectly valid because, this is not a FI. Only the Parent is FI
interface child3 extends FIWrtInheritance{
    public void m3();
}
