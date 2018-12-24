package MyPreparation.Java8concepts;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Java8WaysOfStream {

  public static List<String> list = Java8WaysOfStream.populateList();
  public static Map<String, String> map = Java8WaysOfStream.populateMap();

  private static Map<String, String> populateMap() {

    Map<String, String> map = new HashMap<>();
    map.put("1", "Nirmal");
    map.put("2", "Guns");
    map.put("3", "Roses");
    map.put("4", "Oh Mama");
    map.put("5", "Queen");
    return map;
  }

  private static List<String> populateList() {

    ArrayList<String> stringList = new ArrayList<>();
    stringList.add("c");
    stringList.add("g");
    stringList.add("c");
    stringList.add("a");
    stringList.add("b");
    stringList.add("c");
    return stringList;
  }

  public static void main(String[] args) {

    System.out.println("Stream from List:");
    list.stream().forEach(System.out::println);
    System.out.println("Stream from map using entrySet():");
    map.entrySet().stream().forEach(System.out::println);
    System.out.println("Stream from map using keySet():");
    map.keySet().stream().forEach(System.out::println);
    System.out.println("Stream from map using values():");
    map.values().stream().forEach(System.out::println);
    System.out.println("Stream from a string using chars()");
    "12424534564".chars().forEach(a -> System.out.println(Character.toChars(a)));
    System.out.println("Stream from a string using split()");
    Stream.of("a,b,c,f".split(",")).forEach(System.out::println);
    System.out.println("Stream from array");
    Integer[] array = {2, 4, 6, 2, 46, 2, 2};
    Stream.of(array).forEach(System.out::println);
    Arrays.stream(array).forEach(System.out::println);
    System.out.println("Stream generate function");
    Stream.generate(() -> Math.random()).limit(20).forEach(System.out::println);
    Stream.iterate(0, i -> i + 1).limit(5).forEach(System.out::println);
    Stream.builder().add("Hi").add("Hello").add("Bello").build().forEach(System.out::println);
    list.stream().distinct().limit(5).sorted().forEach(System.out::println);
  }
}
