package MyPreparation.algorithms.sorting;

/*The time complexity of this algorithm is O(n2)
 * This is average case example
 * */
public class BubbleSort1 {

	public static void main(String[] args) {
		int[] numbers = new int[] { 12, 89, 1, 67, 5, 23 };

		for (int i : numbers)
			System.out.print(i + " ");
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers.length - j - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					int temp = numbers[i + 1];
					numbers[i + 1] = numbers[i];
					numbers[i] = temp;

				}
			}

		}
		System.out.println();
		for (int i : numbers)
			System.out.print(i + " ");

	}

}
