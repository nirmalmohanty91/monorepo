package MyPreparation.datastructureprograms;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] numbers = { 1, 44, 2, 449, 6, 433 };
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();

		Arrays.sort(numbers);
		for (int i : numbers) {
			System.out.print(i + " ");
		}

	}
}
