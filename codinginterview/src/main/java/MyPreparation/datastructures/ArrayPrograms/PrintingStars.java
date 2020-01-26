package MyPreparation.datastructures.ArrayPrograms;

public class PrintingStars {

  public static void main(String[] args) {

    String[][] arr = new String[5][5];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j] = "*";
      }
    }

    System.out.println("Print straight");
    PrintingStars.printStraight(arr);
    System.out.println("Print Reverse");
    PrintingStars.printReverse(arr);
    System.out.println("Print reverse1");
    PrintingStars.printX(arr);
  }

  public static void printStraight(String[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (j <= i) System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void printReverse(String[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (j >= i) System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void printX(String[][] arr) {
    int length = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (j == length) {
          System.out.print(arr[i][j]);
        } else if(i==j){
            System.out.print(arr[i][j]);
        } else System.out.print(" ");
      }
      length--;
      System.out.println();
    }
  }
}
