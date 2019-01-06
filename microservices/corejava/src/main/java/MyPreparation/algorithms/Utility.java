package MyPreparation.algorithms;

import java.util.Arrays;

public class Utility {

    public static void printArray(int[] numbers, int i){
        System.out.print("Loop "+i+": ");
        Arrays.stream(numbers).forEach(a -> System.out.print(a+" "));
        System.out.println();
    }
}
