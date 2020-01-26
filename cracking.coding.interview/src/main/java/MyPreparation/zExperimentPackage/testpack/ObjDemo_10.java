package MyPreparation.zExperimentPackage.testpack;

public class ObjDemo_10 {

  int i = 10;
  Overal06072006 o = new Overal06072006();
  Overal06072006 o1;
  private int j;

  // sysout(o1);

  public static void main(String[] args) {

    ObjDemo_10 d1 = new ObjDemo_10();
    System.out.println(d1.o1);
    System.out.println(d1.i);
    int x = d1.i;
    System.out.println(d1.o);
    d1.i = 25;
    d1.o.i = 20;
    d1.o.functionA();

    /*
     * 'pintln()' is a non-static method present in 'out' object. But note
     * that 'System' is a Class.In the statement d1.o.functionA() is a
     * non-static method present in o object of class Overal06072006 and d1
     * is also an object of a class
     */
    System.out.println(d1.o1);
    d1.o1.functionA(); // we don't get a compilation error but we get a runtime error
    // Overal06072006 a1; ---> This is nothing but declaring a1 variable as
    // type Overal06072006 like int x where x is a variable of int type
    Overal06072006 a1 = null;
    a1.functionA(); // Here we will get a compilation error because a1 is a
    // local variable and JVM will not initialize it.
    d1.o1 = d1.o;
    System.out.println(d1.o1.i);
    d1.j = d1.i;
    d1.o1 = new Overal06072006();
    System.out.println(d1.o1.i);
  }
}

// We can define object of any class as an instance variable of any other class
