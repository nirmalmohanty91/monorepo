package interviewquestions.adp;

import java.util.ArrayList;

public class String1 {

	public static void main(String[] args) {
		String s = "Welcome to the worlabd";
		char[] array = s.replaceAll("\\s", "").toLowerCase().toCharArray();
		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
				}
				// System.out.print(count);
				if (count > 1) {
					list.add(array[i]);
					// break;
				}

			}
			// System.out.println();
		}

		System.out.println(list.get(list.size() - 1));
	}

}
