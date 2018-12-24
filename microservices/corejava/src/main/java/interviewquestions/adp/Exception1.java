package interviewquestions.adp;

public class Exception1 {

	public static void main(String[] args) {

		try {
			String[] s = new String[] { "Miller", "Blake", "Nirmal" };
			System.out.println(s[3]);
		} catch (Exception e) {
			System.out.println("Pinting A");
//		} catch (ArrayIndexOutOfBoundsException e1) { //Can't place this exception here
//			System.out.println("printing B");

		} finally {
			System.out.println("Printing C");
		}

	}
}
