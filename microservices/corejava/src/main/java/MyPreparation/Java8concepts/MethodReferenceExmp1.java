package MyPreparation.Java8concepts;

public class MethodReferenceExmp1 {

  public static void main(String[] args) {
    Thread t = new Thread(() -> printMessage());
    // The above expression can be replaced with Method reference(In no input arguments and just
    // executing a method with no input parameters this is applied)
    Thread t2 = new Thread(MethodReferenceExmp1::printMessage);

    t.start();
    t2.start();
  }

  public static void printMessage() {
    System.out.println("Hello");
  }
}
