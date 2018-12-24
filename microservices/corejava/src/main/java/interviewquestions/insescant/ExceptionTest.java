package interviewquestions.insescant;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int x = 1 / 0;
			try {
				int y = 1 / 0;
				try {
					int z = 1 / 0;
				} finally {
					System.out.println("sss");
				}

			} finally {
				System.out.println("This is inner test");
			}

		} finally {
			System.out.println("This is outer test");
		}

	}

}
