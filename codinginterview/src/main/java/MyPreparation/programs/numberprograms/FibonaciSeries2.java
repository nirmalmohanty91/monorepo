package MyPreparation.programs.numberprograms;

public class FibonaciSeries2 {

  public static void main(String[] args) {

    int i1 = 0;
    int i2 = 1;
    int sum = 0;
    int count = 10;

    System.out.print(i1 + " " + i2);

    for (int i = 2; i < count; i++) {
      sum = i1 + i2;
      System.out.print(" " + sum);
      i1 = i2;
      i2 = sum;
    }
  }
}
