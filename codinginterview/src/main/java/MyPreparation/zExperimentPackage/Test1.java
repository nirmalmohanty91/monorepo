package MyPreparation.zExperimentPackage;

public class Test1 {

    public static void main(String[] args) {
        A1 a1 = new A1();
        Object o = null;
        char[] c = null;
        String s = null;
       // a1.printName(null);

        System.out.println(null == null);
        System.out.println(null != null);
        char[] ints = {'c','v'};
        System.out.println(ints);
    }
}

class A1 {

    public void printName(B1 b1) {
        System.out.println("In Object");

    }

//    public void printName(char[] c) {
//        System.out.println("In char array");
//
//    }

    public void printName(String s) {
        System.out.println("In String");
    }
}
 class B1{

 }