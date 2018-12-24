package MyPreparation.Others.SingletonExamples;

public class SingletonDemo {

    private static final SingletonDemo instance= new SingletonDemo();
    //private constructor to avoid client applications to use constructor
    private SingletonDemo(){}

    public static SingletonDemo getInstance(){
        return instance;
    }
}
