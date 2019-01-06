package interviewquestions.ZebiData;

public class Times {
  public static void main(String[] args) {

    int[] numbers = {12, 89, 1, 67, 5, 23};
    int[] numbers1 = {12, 89, 1, 67, 5, 23, 232, 1, 212, 121, 12, 12, 1};
    int[] numbers2 = {12, 89, 54, 1, 67, 5, 23};
    System.out.println(numbers.length + ": " + numbers1.length + ": " + numbers2.length);
    int count = 0;
    for (int i=0;i<numbers.length;i++){
        for (int j=0;j<numbers1.length;j++){
            for (int k=0;k<numbers2.length;k++){
                count++;
            }
        }
    }
    System.out.println(count);
  }
}
