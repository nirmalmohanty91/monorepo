package MyPreparation.numberprograms;

public class AddTwoNumberWithoutUsingArithmatic {

  public static void main(String[] args) {
    System.out.println(AddTwoNumberWithoutUsingArithmatic.Add(15, 3));
  }

  static int Add(int x, int y) {
    // Iterate till there is no carry
    while (y != 0) {
      // carry now contains common
      // set bits of x and y
      int carry = x & y;
      System.out.print("carry:" + carry + " ");
      // Sum of bits of x and
      // y where at least one
      // of the bits is not set
      x = x ^ y;
      System.out.print("x:" + x + " ");
      // Carry is shifted by
      // one so that adding it
      // to x gives the required sum
      y = carry << 1;
      System.out.print("y:" + y + " ");
      System.out.println();
    }
    return x;
  }
}
