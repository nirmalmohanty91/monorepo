package MyPreparation.programs.stringprograms;

import java.util.HashMap;

public class CountingCharsInString {

	public void countingChars(String string) {

		char[] array = string.replaceAll("\\s", "").toLowerCase().toCharArray();
		System.out.println(array);
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : array) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		System.out.println(map);

	}

	public static void main(String[] args) {
		new CountingCharsInString().countingChars("aaaa BBBB cc d fff");
	}

}
