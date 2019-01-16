package MyPreparation.programs.stringprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingString {
  static int even = 0;
  static int odd = 1;

  public static void main(String[] args) {
    // use this logic to get the string if you are getting it with double
    // quotes already
    String name = "\"nirmal\"";
    String finalName = name.substring(1, name.length() - 1);

    if (name.startsWith("\"")) {
      System.out.println(finalName);
    }
    // logic for dynamically receiving a string of strings separated by
    // comma and place it in a collection. If there is 1 string other two
    // fields should be null in the collection
    String s1 = "1";
    String s2 = "1,2";
    String s3 = "1,2,3";

    String[] a = s3.split(",");
    List<String> finalArray = new ArrayList<>(Arrays.asList(null, null, null));
    for (int i = 0; i < a.length; i++) finalArray.set(i, a[i]);
    System.out.println(finalArray);
  }
}
