package MyPreparation.algorithms.sorting;

/*The time complexity of this algorithm is O(n2)
 * Selection sort is the slow sorting algorithm 
 */
public class SelectionSort {

	public static void main(String[] args) {

		int[] numbers = new int[] { 12, 89, 1, 67, 5, 23 };

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[i]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}

			for (int a : numbers)
				System.out.print(a + " ");
			System.out.println();
		}
	}
}
