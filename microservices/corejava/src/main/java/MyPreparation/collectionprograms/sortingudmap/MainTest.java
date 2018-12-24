package MyPreparation.collectionprograms.sortingudmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MainTest {
  public static int a;
  public int b;

  public static TreeMap<Integer, Employee> sortMapByValue(HashMap<Integer, Employee> map) {
    Comparator<Integer> comparator = new ValueComparator(map);
    // TreeMap is a map sorted by its keys.
    // The comparator is used to sort the TreeMap by keys.
    TreeMap<Integer, Employee> result = new TreeMap<>(comparator);
    result.putAll(map);
    return result;
  }

  public static void main(String[] args) {
    HashMap<Integer, Employee> m = new HashMap<>();
    Employee emp = new Employee("Nirmal", 421, 20);
    Employee emp1 = new Employee("Batman", 445, 30);
    Employee emp3 = new Employee("Batman", 445, 56);
    Employee emp2 = new Employee("Clark", 245, 10);
    m.put(1, emp);
    m.put(2, emp1);
    m.put(3,emp3);
    m.put(4, emp2);
    System.out.println("Map before sorting: " + m);
    TreeMap<Integer, Employee> sortedMap = sortMapByValue(m);
    System.out.println("Map after sorting: " + sortedMap);

    /*
     * List<Integer> list = new ArrayList<>(); Map<Integer, Integer> m1 =
     * new HashMap<Integer, Integer>();
     *
     * Set<Integer> set = m.keySet(); Iterator<Integer> itr =
     * set.iterator();
     *
     * while (itr.hasNext()) {
     *
     * Integer key = itr.next(); list.add(m.get(key).getSalary());
     * m1.put(m.get(key).getSalary(), key);
     *
     * }
     *
     * System.out.println(list); Collections.sort(list);
     * System.out.println(list); System.out.println(m1); for (int i : list)
     * { m1.put(i, )
     *
     * }
     */

  }
}
