package interviewquestions.Oracle;

public class MaximumNumberOfZeros {

  public static void main(String[] args) {

    //
    //      Scanner sc = new Scanner(System.in);
    //      int length = sc.nextInt();
    //      int[] a = new int[length];
    //      for(int i=0;i< length;i++){
    //          a[i] = sc.nextInt();
    //      }

    // int[] a = {10, 20, 5000, 200000, 9999, 4000};
    int[] a = {1, 2, 5, 2, 9999, 4};

    int maxZeros = 0;
    int numberWithMaxZeros = 0;

    for (int number : a) {
      int countOfZero = 0;
      // char[] c = ("" + number).toCharArray();
      String s = String.valueOf(number);
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '0') {
          countOfZero++;
        }
      }
      if (maxZeros <= countOfZero) {
        maxZeros = countOfZero;
        if (numberWithMaxZeros < number) {
          numberWithMaxZeros = number;
        }
      }
    }
    if (maxZeros == 0) {
      System.out.println(-1);

    } else {
      System.out.println(numberWithMaxZeros);
    }
  }
}
