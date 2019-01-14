package MyPreparation.WorkingWithDates;
/** This is an Hacker Rank problem */
public class TimeConversion {

  static String timeConversion(String s) {

    if (s.contains("PM")) {
      String[] params = s.split(":");
      String formatted = null;
      if (params[0].equalsIgnoreCase("12")) {
        formatted = s;
      } else {
        formatted = s.replace(params[0], Integer.toString(Integer.parseInt(params[0]) + 12));
      }
      return formatted.substring(0, s.length() - 2);
    } else {
      String[] params = s.split(":");
      String formatted = null;
      if (params[0].equalsIgnoreCase("12")) {
        formatted = s.replace(params[0], "00");
      } else {
        formatted = s;
      }
      return formatted.substring(0, s.length() - 2);
    }
  }

  public static void main(String[] args) {
    String s = "12:06:09AM";
    System.out.println(TimeConversion.timeConversion(s));
  }
}
