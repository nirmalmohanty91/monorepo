package MyPreparation.algorithms.sorting;

/*This is not the best sorting algorithm in terms of performance
 * But it is little more efficient than selection sort and bubble sort
 * The time complexity is O(n) for best case
 * There also can be reverse sorted array, which will be the worst case scenario 
 * and the time complexity will be O(n2)
 * 
 * */

public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = new int[] { 12, 89, 1, 67, 5, 23 };
		for (int i : numbers)
			System.out.print(i + " ");
		for (int i = 1; i < numbers.length; i++) {
			int value = numbers[i];
			int hole = i;

			while (hole > 0 && numbers[hole - 1] > value) {
				numbers[hole] = numbers[hole - 1];
				hole = hole - 1;
			}
			numbers[hole] = value;
		}
		System.out.println();
		for (int i : numbers)
			System.out.print(i + " ");
	}

}
