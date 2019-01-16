package MyPreparation.programs.stringprograms;

public class RemoveDuplicateFromString4 {

	public static void main(String[] args) {
		String s = "abaa Tit for tat";
		String s2 = s.replaceAll("\\s", "").toLowerCase();
		String result = "";
		for (int i = 0; i < s2.length(); i++) {
			if (!result.contains(String.valueOf(s2.charAt(i)))) {
				result += String.valueOf(s2.charAt(i));
			}
		}
		System.out.println(result);
	}
}
