package MyPreparation.programs.stringprograms;

public class StringReverse {

  public static void main(String[] args) {
    String s = "Nirmal";
    String str = "I Am Not String";

    System.out.println(reverseCharArray(str));
    //System.out.println(reverseSentence(str));
  }

  static String reverseCharArray(String str) {
    char[] letters = str.toCharArray();
    StringBuffer s = new StringBuffer();
    for (int i = letters.length - 1; i >= 0; i--) {
      s.append(letters[i]);
    }
    return s.toString();
  }

  static String reverseSentence(String str) {
    // String str = "I Am Not String";
    char[] stringArray = str.toCharArray();
    System.out.println(String.valueOf(stringArray));
    // System.out.println(str.length());
    StringBuffer sb = new StringBuffer(str.replaceAll("\\s", ""));
    char[] string1 = sb.reverse().toString().toCharArray();
    System.out.println(String.valueOf(string1));
    // char[] resultArray = new char[stringArray.length];

    char[] resultArray = stringArray.clone();
    System.out.println(resultArray.length);
    int j = 0;
    for (int i = 0; i < resultArray.length; i++) {

      if (resultArray[i] == ' ') {

      } else {
        resultArray[i] = string1[j];
        j++;
      }
    }
    System.out.println(String.valueOf(resultArray));
    return String.valueOf(resultArray);
  }
}
