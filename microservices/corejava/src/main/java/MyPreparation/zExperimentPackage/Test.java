package MyPreparation.zExperimentPackage;

import org.springframework.web.bind.annotation.ControllerAdvice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

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
    arrayList.add(4);
    arrayList.add(4);
    arrayList.add(4);
    arrayList.add(5);
    arrayList.add(3);

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
    //    BigDecimal n = new BigDecimal(100.893);
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

    BigDecimal value = new BigDecimal(.59);

    //    System.out.println(value.multiply(new BigDecimal(100));
    //    System.out.println(Float.toString(value.floatValue()*100));
    System.out.println(value);
    String paymentAmounts =
        value.multiply(new BigDecimal(100).setScale(2, RoundingMode.DOWN)).toString();
    //System.out.println(paymentAmounts);

    //System.out.println("Original Value: " + value);

    System.out.println(Float.toString(value.floatValue() * 100).split("\\.")[0]);
  }
}

