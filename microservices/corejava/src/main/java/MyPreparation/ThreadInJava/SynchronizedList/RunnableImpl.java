package MyPreparation.ThreadInJava.SynchronizedList;

import java.util.stream.IntStream;

public class RunnableImpl implements Runnable {
    SynchronizedListOperations slo= new SynchronizedListOperations();

    @Override
    public void run() {
       // IntStream.range(0,100).forEach(i->slo.addToList(i));
        slo.printList();

    }
}
