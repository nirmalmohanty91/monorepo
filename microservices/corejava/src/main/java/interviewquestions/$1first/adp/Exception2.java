package interviewquestions.$1first.adp;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String[] s = new String[] { "Miller", "Blake", "Nirmal" };
			System.out.println(s[3]);
		} finally {
			System.out.println(1 / 0);
		}

	}

}
