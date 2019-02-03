package MyPreparation.programs.stringprograms;

/** Convert String "1234" to number 1234 */
public class ConvertStringToNumber {

  public static void main(String[] args) {

    System.out.println(ConvertStringToNumber.convertStringToNumber("1294598347"));
  }

  public static int convertStringToNumber(String s) {

    char[] chars = s.toCharArray();
    int sum = 0;
    for (char c : chars) {
      System.out.println(c + "-" + '0' + "|" + (int) c + "-" + (int) '0' + " = " + (c - '0'));
      sum = sum * 10 + (c - '0');
    }
    System.out.println();
    return sum;
  }
}
