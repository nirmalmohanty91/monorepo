package MyPreparation.programs.stringprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString3 {

	public static void main(String[] args) {
		String s = "aaa Tit for tat";
		Set<Character> dup = new LinkedHashSet<>();
		Set<Character> nonDup = new LinkedHashSet<>();
		for (char c : s.replaceAll("\\s", "").toLowerCase().toCharArray()) {
			if (nonDup.contains(c)) {
				dup.add(c);
			} else {
				nonDup.add(c);
			}

		}
		System.out.println(dup + "\n" + nonDup);
		String s2 = "";
		for (char c : nonDup) {
			s2 += c;
		}
		System.out.println(s2);

	}

}
