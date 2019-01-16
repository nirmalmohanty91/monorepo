package MyPreparation.Java8.Java8Features;

interface Parent {
  static void printName() {
    System.out.println("Interface static");
  }
}

public class $6Java8Interface1 implements Parent {

  public static void main(String[] args) {
    /*
    printName();
    $6Java8Interface1.printName();
    $6Java8Interface1 p = new $6Java8Interface1();
    p.printName();
    All these are invalid calls to access static
     */
    Parent.printName();
  }
}
