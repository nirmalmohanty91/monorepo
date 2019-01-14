package MyPreparation.collectionprograms.MapPrograms;

import utils.Utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 1. Maintains no order
 * 2. Gives constant time O(1) performance for put() & get()
 * 3. Can have multiple null values and only one null key
 * 4. Default initial capacity of HashMap is 16
 * 5. HashMap is not synchronized. Use Collections.synchronizedMap() method for synchronized map
 */
public class HashMapFunctions {
  public static void main(String[] args) {

    HashMap<Integer, String> map1 = new HashMap<>();
    map1.put(12, "Nirmal");
    map1.put(43, "Batman");
    map1.put(1, "Vigilante");
    map1.put(4, "Deadpool");
    map1.put(7, "we are venom");
    System.out.println(map1);

    // Getting keys of a map
    Set<Integer> keys = map1.keySet();
    System.out.println("Keys of the Map: " + keys);

    // Getting values of a map
    Collection<String> values = map1.values();
    System.out.println("Values of the map: " + values);

    // Different ways to iterate a map
    System.out.println("1. Looping map Using Iterator(Java 7): ");
    System.out.println("------------------------------");
    Iterator iterator = map1.keySet().iterator();
    while (iterator.hasNext()) {
      Integer i = (int) iterator.next();
      System.out.println(i + "=>" + map1.get(i));
    }

    System.out.println("2. Looping map using EntrySet(Java 7): ");
    System.out.println("-------------------------------");
    Set<Map.Entry<Integer, String>> entries = map1.entrySet();
    for (Map.Entry<Integer, String> e : entries) {
      System.out.println(e.getKey() + "=>" + e.getValue());
    }

    System.out.println("3. Looping map in Java 8: ");
    System.out.println("-------------------------------");
    map1.forEach((key,value) -> System.out.println(key+"=>"+value));

    // Converting HashMap to ArrayList
    System.out.println("Map keys in an ArrayList: ");
    ArrayList<Integer> mapKeys = new ArrayList<>(keys);
    System.out.println(mapKeys);

    System.out.println("Map values in an ArrayList: ");
    ArrayList<String> mapValues = new ArrayList<>(values);
    System.out.println(mapValues);

    System.out.println("Map Key & Value in an ArrayList: ");
    ArrayList<Map.Entry<Integer,String>> entryArrayList = new ArrayList<>(entries);
    System.out.println(entryArrayList);

    //Another map
     HashMap<Integer, String> map2 = new HashMap<>();
     map1.put(1, "Nirmal");
     map1.put(34, "Batman");
     map1.put(11, "Vigilante");
     map1.put(47, "Deadpool");
     map1.put(70, "we are venom");
     map1.putAll(map2);
     System.out.println(map1);
     System.out.println("Size of map: "+map1.size());
     System.out.println("Is map empty: "+map1.isEmpty());
     System.out.println("If key present: "+map1.containsKey(43));
     System.out.println("If value present: "+map1.containsValue("Batman"));
     System.out.println("Remove mapping of a key:");
     map1.remove(70);
     map1.remove(1,"Nirmal");
     System.out.println(map1);
     System.out.println("Insert a key and value if the key is absent: ");
     map1.putIfAbsent(100,"Hulk");
     map1.putIfAbsent(7,"Value if key is not there");
     System.out.println(map1);
     System.out.println("Replacing old value with new value: ");
     map1.replace(100,"Hulk","Incredible Hulk");
     map1.replace(7,"REPLACED");
     System.out.println(map1);

     Map<Integer, ArrayList<String>> map3 = new HashMap<>();
     ArrayList<String> stringArrayList1 = new ArrayList<>(Arrays.asList("Nirmal","Aquaman", "Batman"));
     ArrayList<String> stringArrayList2 = new ArrayList<>(Arrays.asList("Robin","Natasha Romanoff", "Wanda Maximoff"));

      map3.put(4,stringArrayList2);

     // Requirement: Put the sorted list into the map
     // Java 7 way of doing a put
     Collections.sort(stringArrayList1);
     map3.put(2,stringArrayList1 );

     // Java 8 way of doing put
     map3.compute(4,(key, value) -> Utility.sortAlphabetically(value));
     System.out.println(map3);

     System.out.println("Only modify if key already exists in the map:");
     // Java 7 way
     if(map3.containsKey(2)){
         map3.put(2,Utility.reverseList(map3.get(2)));
     }
     //Java 8 way of doing it
     map3.computeIfPresent(2,(key,value)->Utility.reverseList(value));

     //Add data to a map only if key isn’t there
      //java 7 way
      if (!map3.containsKey(8)) {
          map3.put(8, Utility.getList());
      }
      //java 7 way. Downside: We always need to have the value before hand. Let's say we are
      // calling a method which is providing us the value. In that case it would impact the performance.
      // Like here if you observe the getList() gets called even if the key is present
      map3.putIfAbsent(8,Utility.getList());
    // Java 8 way. If you observe here if key is present the call is not going to the method at all
    map3.computeIfAbsent(8, value -> Utility.getAnotherList());
    //Adding element to the list whose key is 8
    map3.computeIfAbsent(8, value -> new ArrayList<>()).add("Green Goblin");

    System.out.println("Replace all the elements with upper case letters: ");
    map3.replaceAll((key,value) -> {
        value.replaceAll(temp -> temp.toUpperCase());
        return value;
    });
    System.out.println(map3);

    System.out.println("Avoiding a null return when fetching a non-existent key's entry using Map.getOrDefault() method");
    System.out.println(map3.getOrDefault(10,new ArrayList<>()));
    System.out.println(map3.getOrDefault(8,new ArrayList<>()));

    System.out.println("Merging lists: ");
   // map3.merge(4, value, (Utility.getList(),Utility.getAnotherList())->Stream.of())
  }


}




