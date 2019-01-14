package MyPreparation.collectionprograms.MapPrograms.programs.equalsandhashcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TestEmp {

  public static void main(String[] args) throws IOException {

    Emp e1 = Emp.builder().age(23).build();
    Emp e2 = Emp.builder().age(23).build();
    //System.out.println(e1.equals(e2));
    Map<Emp, String> map = new HashMap<>();
    map.put(e1,"Hi");
    System.out.println("#######");
    map.put(e2,"Hello");
    /**if you don't override equals() & hashcode(), the size of map will be 2. Because the default implementation
     * of equals() is:
     public boolean equals(Object obj) {
        return (this == obj);
     }
     And since while putting keys into a map the comparision happens. The result of the comparision will be false,
     because the default equals() method will just compare the object reference and return the result. Which is false
     for two different objects. And as per the contract when you override equals() you must override hashcode() too.
     More details to come...

     So the the key point to note here is:
     => If you are planning to use a class as Hash table key, then you should override both equals() and hashCode() methods.
     => Note that your program will not throw any exceptions if the equals() and hashCode() contract is violated, if you
        are not planning to use the class as Hash table key, then it will not create any problem.
     */
    System.out.println(map.size());

    Map<Student, String> studentStringMap = new HashMap<>();

    






  }
}
