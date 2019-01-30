package MyPreparation.ThreadInJava.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameList {

  private List<String> names = Collections.synchronizedList(new ArrayList<>());

  public void add(String name) {
    names.add(name);
  }

  public String removeFirst() {
    if (names.size() > 0){
        return names.remove(0);
    }
    else return null;
  }

  public static void main(String[] args) {
    final NameList nameList = new NameList();
    nameList.add("Ozymandias");

    class NameDropper extends Thread {
      public void run() {
        String name = nameList.removeFirst();
        System.out.println(name);
      }
    }

    Thread t1 = new NameDropper();
    Thread t2 = new NameDropper();

    t1.start();
    t2.start();
  }
}
