package MyPreparation.stringprograms;

import java.util.Arrays;

public class SortCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Java";
		char[] ch = s.replaceAll("\\s", "").toLowerCase().toCharArray();
		Arrays.sort(ch);
		String sortedString = new String(ch);
		System.out.println(sortedString);

	}
}
