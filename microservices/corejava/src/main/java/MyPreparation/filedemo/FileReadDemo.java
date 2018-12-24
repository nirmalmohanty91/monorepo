package MyPreparation.filedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("C://Users//Prophet//Desktop/Interview Questions-incessant.java")));
		String line = null;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		// Map<Character, Integer> map = new HashMap<Character, Integer>();
		while ((line = br.readLine()) != null) {
			line = line.replaceAll("\\t", "").replaceAll("\\n", "").replaceAll("\\s", "").toLowerCase();
			// System.out.println(line);
			char[] ch = line.toCharArray();
			// String dfc = ch;
			// for (char c : ch)
			System.out.println(ch);
			// System.out.println();
			// System.out.println(Arrays.toString(ch));
			String s = Arrays.toString(ch);
			for (int i = 0; i < ch.length - 1; i++) {
				int count = 0;
				for (int j = i; j < ch.length; j++) {

					if (ch[i] == ch[j]) {

						count++;
						// System.out.println(ch[i] + " = " + count);
						// System.out.println(ch[j] + " = " + count);
					}
				}
				if (!map.containsKey(ch[i]) && (ch[i] >= 97 || ch[i] <= 122))
					map.put(ch[i], count);
				else
					map.replace(ch[i], count, map.get(ch[i]) + count);
			}

		}
		System.out.println(map);
	}
}
