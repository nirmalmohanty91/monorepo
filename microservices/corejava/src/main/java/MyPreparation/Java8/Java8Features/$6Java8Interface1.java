package MyPreparation.Java8.Java8Features;

interface Parent {
  static void printName() {
    System.out.println("Interface static");
  }
  default void printId(){
    System.out.println("This is your id.");
  }
}

public class $6Java8Interface1 implements Parent {

  public static void main(String[] args) {
    /**
    printName();
    $6Java8Interface1.printName();
    $6Java8Interface1 p = new $6Java8Interface1();
    p.printName();
     */
   // All these above calls are invalid calls to access static method, because it wo't be available fo rhe implementation class
    Parent.printName();

    //call for default method
    $6Java8Interface1 p = new $6Java8Interface1();
    p.printId();
  }
}
