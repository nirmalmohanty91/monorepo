package MyPreparation.zExperimentPackage;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

@ControllerAdvice
public class Test {
  public static void main(String[] args) {

    //    Optional<String> gender = Optional.of("MALE");
    //    String answer1 = "Yes";
    //    String answer2 = null;
    //
    //    System.out.println("Non-Empty Optional:" + gender);
    //    System.out.println("Non-Empty Optional: Gender value : " + gender.get());
    //    System.out.println("Empty Optional: " + Optional.empty());
    //
    //    System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
    //    System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
    //
    //    java.lang.NullPointerException
    //    System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
    //    HashMap<String, String> hashMap = new HashMap<>();

    //    int[] numbers = {2, 4, 5, 6};
    //
    //    int[] multiplied = Arrays.stream(numbers).map(a -> a * 2).toArray();
    //
    //    long count = Arrays.stream(numbers).map(a -> a + 2).filter(b -> b == 8).count();
    //    System.out.println(count);
    // Arrays.stream(multiplied).forEach(System.out::println);

    //    int[] a = {10, 5,20,20,4,5,2,25,1};
    //
    //   Arrays.stream(breakingRecords(a)).forEach(System.out::println);

    //    Integer a = null;
    //    System.out.println(Optional.ofNullable(a).isPresent()?a.toString():"");
    /** ########################## */
    //    String s = "Nirmal ! Mohanty";
    //    String s3=Arrays.stream( s.split(" ")).map(s2 -> StringUtils.reverse(s2)+"
    // ").collect(Collectors.joining()).trim();
    //    System.out.println(s3);
    /** ########################## */
    //    ArrayList<Integer> arrayList = new ArrayList<>();
    //    arrayList.add(1);
    //    arrayList.add(3);
    //
    //    long sum = arrayList.stream().reduce((a,b) -> a+b).get();
    //    System.out.println(sum);
    /** ########################## */
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.add(6);

    //
    //    System.out.println(Test.birthday(arrayList, 3, 2));

    /** ########################## */
    //    HashMap<Integer, Integer> map = new HashMap<>();
    //    for (Integer i : arrayList) {
    //      if (map.containsKey(i)) {
    //        map.put(i, map.get(i)+1);
    //      } else {
    //        map.put(i, 1);
    //      }
    //    }
    //    System.out.println(map);
    //    List<Integer> list = new ArrayList<>();
    //
    //    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //      if (entry.getValue() == Collections.max(map.values())) {
    //        list.add(entry.getKey());
    //      }
    //    }
    //
    //    //    List<Integer> list =
    //    //        Optional.ofNullable(map.entrySet()
    //    //            .stream()
    //    //            .map(
    //    //                entry -> {
    //    //                  if (entry.getValue() == Collections.max(map.values())) {
    //    //                    return entry.getKey();
    //    //                  } else return null;
    //    //                })).
    //    //            .collect(Collectors.toList());
    //
    //    System.out.println(Collections.min(list));
    /** ########################## */
    // System.out.println(Test.dayOfProgrammer(1800));
    //    String s1 = "tttttttttttttttttttttttttttttttttttttsssssssssssssssss";
    //    String s2 =
    // "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss";
    //
    //    HashMap<String, Integer> m1 = Test.getMap(s1);
    //    HashMap<String, Integer> m2 = Test.getMap(s2);

    //    System.out.println(m1);
    //    System.out.println(m2);
    //
    //    System.out.println(Test.getCount1(m1, m2));
    //    System.out.println(Test.getCount2(m2, m1));
    // int n = Test.getCount1(m1, m2) + Test.getCount2(m2, m1);
    /** ########################## */
    // System.out.println(Test.pageCount(7, 4));

    //    JSONObject jo = new JSONObject();
    //    jo.put("type", "Cash");
    //    jo.put("Amount", "100");
    //    JSONObject jo1 = new JSONObject();
    //    jo1.put("type", "Debit");
    //    jo1.put("Amount", "120");
    //    JSONObject jo3 = new JSONObject();
    //    jo3.put("type", "Credit");
    //    jo3.put("Amount", "30");
    //
    //    List<JSONObject> lit = new ArrayList<>();
    //    lit.add(jo);
    //    lit.add(jo1);
    //    lit.add(jo3);
    //
       BigDecimal n = new BigDecimal(100.893);
    //    System.out.println((n.floatValue()*100));

    //    String s1 = null;
    //    System.out.println("P".equalsIgnoreCase(s1));

    //    Integer i = 128;
    //    Integer i1 = Integer.valueOf(128);
    //
    //    int i2 = 128;
    //    int i3 = 128;
    //
    //    System.out.println(i.equals(i1));
    //    System.out.println(i2 == i3);

    //    BigDecimal value = new BigDecimal(.59);
    //
    //    //    System.out.println(value.multiply(new BigDecimal(100));
    //    //    System.out.println(Float.toString(value.floatValue()*100));
    //    System.out.println(value);
    //    String paymentAmounts =
    //        value.multiply(new BigDecimal(100).setScale(2, RoundingMode.DOWN)).toString();
    //    // System.out.println(paymentAmounts);
    //
    //    // System.out.println("Original Value: " + value);
    //
    //    System.out.println(Float.toString(value.floatValue() * 100).split("\\.")[0]);

    //    List<Nirmal> nirmalList = new ArrayList<>();
    //
    //    nirmalList.add(Nirmal.builder().id(112).name("Batman").build());
    //    nirmalList.add(Nirmal.builder().id(2).name("hello").build());
    //    nirmalList.add(Nirmal.builder().id(92).name("Bello").build());
    //    nirmalList.add(Nirmal.builder().id(20).name("kello").build());
    //    nirmalList.add(Nirmal.builder().id(52).name("sello").build());
    //    nirmalList.add(Nirmal.builder().id(23).name("you").build());
    //
    ////    nirmalList.sort(Comparator.comparing(x -> x.name));
    ////    System.out.println(nirmalList);
    //    TreeMap<Nirmal,Integer> map= new TreeMap<>();
    //    map.put(Nirmal.builder().id(112).name("Batman").build(),1);
    //    map.put(Nirmal.builder().id(112).name("Atman").build(),1);
    //    System.out.println(map);
    //
    //    TreeSet<Nirmal> set = new TreeSet<>();
    //    set.add(Nirmal.builder().id(112).name("Batman").build());

//    Scanner s = new Scanner(System.in);
//    int a = s.nextInt();
//    int b = s.nextInt();
//    System.out.println(a + " : " + b);




    // Write your code here
//    for(int i=1;  i<= a && i<= b; i++){
//      if(a%i ==0 && b%i ==0){
//        System.out.println(i);
//      }
//    }

//      int[] array = {2, 4, 6, 2, 46, 2, 2};
//      if(Arrays.stream(array).boxed().anyMatch(x-> x==2)){
//          System.out.println("found it");
//      }

    for(int i = 0, j = 0; i < 7; i++){
      System.out.println("i:"+i);
      for(; j < 6; j++){
        System.out.println(i+":"+j);
      }

  }}
}

// @Builder
// @ToString
// class Nirmal{
//  int id;
//  String name;
//
////  @Override
////  public int compareTo(Nirmal o) {
////    return this.name.compareTo(o.name);
////  }
// }