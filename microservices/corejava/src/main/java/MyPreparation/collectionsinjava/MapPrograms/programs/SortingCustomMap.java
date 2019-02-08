package MyPreparation.collectionsinjava.MapPrograms.programs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class SortingCustomMap {
  public static int a;
  public int b;

  public static TreeMap<Integer, Employee> sortMapByValue(HashMap<Integer, Employee> map) {
    Comparator<Integer> comparator = new SalaryComparator(map);
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
    m.put(3, emp3);
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

@Getter
@Setter
@AllArgsConstructor
@ToString
class Employee {

  public String name;
  public int id;
  public int salary;
}

class SalaryComparator implements Comparator<Integer> {

  HashMap<Integer, Employee> map = new HashMap<>();

  public SalaryComparator(HashMap<Integer, Employee> map) {
    this.map.putAll(map);
  }

  @Override
  public int compare(Integer o1, Integer o2) {
    if (map.get(o1).getSalary() >= map.get(o2).getSalary()) {
      return -1;
    } else {
      return 1;
    }
  }
}
