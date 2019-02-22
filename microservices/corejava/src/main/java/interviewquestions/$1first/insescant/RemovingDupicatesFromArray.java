package interviewquestions.$1first.insescant;

import java.util.Arrays;
import java.util.HashSet;

public class RemovingDupicatesFromArray {

	public static void main(String[] args) {
		Integer[] str1 = new Integer[] { 1, 1, 1, 2, 2, 2, 4, 4, 4 };

		HashSet<Integer> set = new HashSet<>(Arrays.asList(str1));
		Integer[] str2 = set.toArray(new Integer[set.size()]);

		for (int i : str2) {
			System.out.println(i);
		}

	}
}
