package MyPreparation.algorithms.sorting;

/*The time complexity of this algorithm is O(n2)
 * Bubble sort is in place and stable sorting algorithm
 * This is worst case example
 * */

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = new int[] { 12, 89, 1, 67, 5, 23 };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int i : numbers)
			System.out.print(i + " ");
	}
}
