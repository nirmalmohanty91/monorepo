package MyPreparation.stringprograms;

public class RemoveDuplicateFromString2 {

	public static void main(String[] args) {
		String s = "aa bb cc";
		char[] c = s.replaceAll("\\s", "").toCharArray();
		String result = "";
		for (int i = 0; i < c.length; i++) {
			if (!result.contains(String.valueOf(c[i]))) {
				result = result + String.valueOf(c[i]);
			}
		}
		System.out.println(result);
	}
}
