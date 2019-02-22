package interviewquestions.$2second.gap;

public class ReverseStringWithRecursion {
  public static void main(String[] args) {
    String name = "Nirmal";
    System.out.println(reverse(name));
  }

  public static String reverse(String s) {
    if (s.isEmpty()) {
      return s;
    }

    return reverse(s.substring(1)) + s.charAt(0);
  }
}
