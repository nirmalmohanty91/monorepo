package MyPreparation.programs.numberprograms;

public class IfNumberIsPowerOf2 {

  public static void main(String[] args) {
    System.out.println(secondApproach(16));
  }

  public static boolean firstApproach(int n) {
    if (n <= 0) {
      return false;
    }

    while (n > 1) {
      if (n % 2 != 0) {
        return false;
      } else {
        n = n / 2;
      }
    }
    return true;
  }
  // Trick here is: If the number is power of two then the bitwise AND(&) operation will result 0
  // between the number and it's previous number
  public static boolean secondApproach(int n) {
    return (n > 0) && ((n & (n - 1)) == 0);
  }
}
