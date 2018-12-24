package MyPreparation.stringprograms;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "JaVA";
		String s2 = "AVAj";
		char[] c1 = s1.replaceAll("\\S", "").toCharArray();
		char[] c2 = s2.replaceAll("\\S", "").toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		/*
		 * String s3 = new String(c1); String s4 = new String(c2);
		 * 
		 * if (s3.equals(s4)) {
		 */
		if (Arrays.equals(c1, c2)) {
			System.out.println("Strings are anagrams");
		} else {
			System.out.println("Strings are not anagrams");
		}

	}

}
